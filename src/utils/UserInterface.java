package utils;
import javax.swing.*;
import java.awt.event.*;
public interface UserInterface {
	void displayFileContents(String contents);
	String getFileContents();

	void setSaveHandler(ActionListener saveHandler);
	void setOpenHandler(ActionListener saveHandler);
}
