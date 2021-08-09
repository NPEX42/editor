package ui;
import utils.*;
import java.awt.event.*;
import javax.swing.*;

public class MainWindow implements UserInterface {

	private JFrame window;
	private JTextArea txtaEditor;
	private JMenuBar menu;
	private JMenu fileMenu;
	private JMenuItem saveItem, loadItem;

	public MainWindow(int width, int height) {
		window = new JFrame("Editor");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(width, height);

		txtaEditor = new JTextArea();
		txtaEditor.setTabSize(4);
		window.getContentPane().add(txtaEditor);


		menu = new JMenuBar();
		fileMenu = new JMenu("file");
		saveItem = new JMenuItem("save");
		loadItem = new JMenuItem("load");
		fileMenu.add(saveItem);
		fileMenu.add(loadItem);
		menu.add(fileMenu);
		window.setJMenuBar(menu);
	}

	public void start() {
		window.setVisible(true);
	}

	public void displayFileContents(String contents) {
		txtaEditor.setText(contents);
	}

    public String getFileContents() {
		return txtaEditor.getText();
	}

    public void setSaveHandler(ActionListener saveHandler) {
		saveItem.addActionListener(saveHandler);
	}

    public void setOpenHandler(ActionListener loadHandler) {
		loadItem.addActionListener(loadHandler);
	}
}
