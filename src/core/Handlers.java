package core;

import utils.*;
import java.awt.event.*;
import javax.swing.JFileChooser;
import java.io.*;

public class Handlers {

	private static UserInterface mainUI;

	public static void setup(UserInterface mainUI) {
		Handlers.mainUI = mainUI;
	}

	public static void onSave(ActionEvent event) {
		String fileContents = mainUI.getFileContents();
		JFileChooser jfc = new JFileChooser(IO.workingDirectory());
		jfc.showSaveDialog(null);
		File file = jfc.getSelectedFile();
		IO.saveString(file.getPath(), fileContents);
	}


	public static void onLoad(ActionEvent event) {
		JFileChooser jfc = new JFileChooser(IO.workingDirectory());
		jfc.showOpenDialog(null);
		File file = jfc.getSelectedFile();
		String contents = IO.loadString(file.getPath());
		mainUI.displayFileContents(contents);
	}
}
