import java.awt.Graphics;
import java.awt.Image;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.*;



public class GameWindow extends JFrame{
	
	int num;
	
	ArrayList <Object>objectList = new ArrayList<Object>(); //store gold and stone;
	
	background bg= new background(); //make new background
	Line line = new Line(this);
	Gold gold = new Gold();
	Rock rock = new Rock();

	{  	
		num= (int) (Math.random()*3);
		for(int i=0; i<num+1; i++) {//code bock for generating amount of gold
			objectList.add(new Gold());
		}
	
	
	  	
		
		for(int i=0; i<5; i++) {//code bock for generating amount of gold
			objectList.add(new Rock());
		}
	
	}
	
	Image offScreenImage; //make a screenImage
	
	void launch() {
		this.setVisible(true);
		this.setSize(700,900);
		//this.setLocation(null);
		 setLocationRelativeTo(null);
		this.setTitle("Gold Miner");

		addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(e.getButton()==1) {line.state=1;}
            }});
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		
		 //clicking the "X" for exsiting the GAME
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
		offScreenImage = this.createImage(700, 900); //(width, height)  To draw Image before it print again
		Graphics gImage =offScreenImage.getGraphics();
		
		bg.paintSelf(gImage); //only call method from background paintSefl method
		line.paintSelf(gImage);
		line.lines(gImage);
		
		
		for(Object obj:objectList) {
			obj.paintSelf(gImage);
		}
	//	gold.paintSelf(gImage);
		rock.paintSelf(gImage);
		
		g.drawImage(offScreenImage, 0, 0, null);
	
	}
	
	
		
	public static void main(String[]args) {
		GameWindow gameWindow = new GameWindow();
		gameWindow.launch();
		
	}
	
		
}
	
		
	
	

