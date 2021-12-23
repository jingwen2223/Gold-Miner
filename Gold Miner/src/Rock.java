import java.awt.Toolkit;

public class Rock extends Object{
	Rock(){
		/*
		this.x=350;
		this.y=550;
		this.width=100;
		this.height=100;
		this.img = Toolkit.getDefaultToolkit().getImage("imgs/rocks-snow.png");
		
	*/	
		this.x=(int)(Math.random()*650);  //700
		this.y=(int)(Math.random()*350+400); //900
		this.width=(int)(Math.random()*10+60);
		this.height=(int)(Math.random()*13+60);
		
this.flag=false;
		this.img = Toolkit.getDefaultToolkit().getImage("imgs/rocks-snow.png");
		
	}
}
