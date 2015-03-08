import java.awt.Color;
import java.awt.Graphics;


public class Dummy extends Game {
	
	SpaceObject ship;
	
	public Dummy(String name, int inWidth, int inHeight) {
		super(name, inWidth,inHeight);
		setBackground(Color.BLACK);
		
		Point[] shipShape = {new Point(210,100), new Point(190,90), new Point(200,100), new Point(190,110)};
		ship = new SpaceObject(shipShape, new Point(100,100), -90);
				
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		ship.paint(g);
	}

	public static void main(String[] args) {
		Dummy a = new Dummy("Dummy Game", 400, 900);
		
		a.startGame();
		
	}
	
}
