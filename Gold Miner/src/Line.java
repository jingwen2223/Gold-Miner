import java.awt.Color;
import java.awt.Graphics;

public class Line {
int x=200;  //start x,y
int y=350; //initialized x and y , not moving

int endx;
int endy;		//end x, y 

//endx = x+leng*cosa;
//endy = y+leng* sina;

double length =50;
double n = 0; //angle

int dir =100;

void  paintSelf(Graphics g) {
	if(n<0.1) {dir=1;}
	else if(n>0.9) {dir=-1;}
	n= n+0.005*dir;
	endx =  (int) (x + length*Math.cos(n*Math.PI));
	//unit vector: x=r∗sin(θ),y=r∗cos(θ)
	endy = (int) (y + length*Math.sin(n*Math.PI));
	
	g.setColor(Color.red);//giving line a color
	
	for(int i=0;i<100;i++) {
		endx= -endx;
		endx++;
	g.drawLine(x, y, endx, endy);}
	
}
}
