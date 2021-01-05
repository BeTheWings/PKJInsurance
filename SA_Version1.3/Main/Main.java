package Main;

public class Main {

	public static void main(String[] args) {

		mainFrame mainFrame;
		try {
			mainFrame = new mainFrame();
			mainFrame.initialize();
			mainFrame.run();
			mainFrame.finalization();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}	