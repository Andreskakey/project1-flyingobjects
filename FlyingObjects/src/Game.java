import javax.swing.*;



public class Game extends JPanel implements Runnable {
	Thread gameThread;
	protected boolean running;
	
	public Game(String name, int inWidth, int inHeight) {
		JFrame frame = new JFrame(name);
		frame.setSize(inWidth, inHeight);
		
		frame.add(this);
		
		frame.setVisible(true);
		frame.setResizable(false);

		running = true;		
		gameThread = new Thread(this);
	}
	
	public void startGame() {
		gameThread.start();
	}
	
	
	@Override
	public void run() {
		while (running) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.err.println("Game interrupted.");
			}
			repaint();
		}

	}

}
