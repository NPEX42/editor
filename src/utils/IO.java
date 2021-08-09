package utils;

import java.io.*;

public class IO {
	public static final String LINE_SEP = "\n";
	private IO() {}

	public static String workingDirectory() {
		return System.getProperty("user.dir");
	}
	
	public static String loadString(String path) throws RuntimeException {
		try {
			StringBuffer buffer = new StringBuffer();
			String line = "";
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
			while((line = reader.readLine()) != null) {
				buffer.append(line);
				buffer.append(LINE_SEP);
			}

			return buffer.toString();
		} catch (IOException ioex) {
			throw new RuntimeException(ioex); 
		}
	}

	public static String[] loadStrings(String path) throws RuntimeException {
		return loadString(path).split(LINE_SEP);
	}


	public static void saveString(String path, String text) throws RuntimeException {
		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path)));
			writer.write(text);
			writer.flush();
			writer.close();
		} catch (IOException ioex) {
			throw new RuntimeException(ioex);
		}
	}
}
