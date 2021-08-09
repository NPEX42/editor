import utils.*;
import ui.*;
import core.*;

public class Main {
	public static void main(String[] args) {
		MainWindow window = new MainWindow(1280, 720);
		Handlers.setup(window);
		Thread t = new Thread(() -> {window.start();});
		window.setSaveHandler(Handlers::onSave);
		window.setOpenHandler(Handlers::onLoad);
		t.start();
	}
}
