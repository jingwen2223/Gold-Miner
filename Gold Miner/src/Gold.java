import java.awt.Toolkit;

public class Gold extends Object{
	
	

	Gold(){
		this.x=(int)(Math.random()*700);
		this.y=(int)(Math.random()*450+350);
		this.width=(int)(Math.random()*50);
		this.height=(int)(Math.random()*50);
		

		this.img = Toolkit.getDefaultToolkit().getImage("imgs/goldnuget.png");
		this.flag=false;
	}
}
