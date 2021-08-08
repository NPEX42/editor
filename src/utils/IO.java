package utils;

import java.io.*;

public class IO {
	private IO() {}
	
	public static String loadString(String path) throws RuntimeException {
		try {
			StringBuffer buffer = new StringBuffer();
			String line = "";
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
			while((line = reader.readLine()) != null) {
				buffer.append(line);
				buffer.append('\n');
			}

			return buffer.toString();
		} catch (IOException ioex) {
			throw new RuntimeException(ioex); 
		}
	}
}
