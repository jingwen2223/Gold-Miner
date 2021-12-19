import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

public class GameWindow extends JFrame{
	
	background bg= new background(); //make new background
	Line line = new Line();
	
	
	void launch() {
		this.setVisible(true);
		this.setSize(700,900);
		this.setLocation(null);
		this.setTitle("Gold Miner");

		setDefaultCloseOperation(EXIT_ON_CLOSE); //clicking the "X" for exsiting the GAME
		while(true) {
			repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

	@Override
	public void paint(Graphics g) {
		bg.paintSelf(g); //only call method from background paintSefl method
		line.paintSelf(g);
	
	}
	
	
	
	public static void main(String[]args) {
		GameWindow gameWindow = new GameWindow();
		gameWindow.launch();
		
	}
	
	
}
