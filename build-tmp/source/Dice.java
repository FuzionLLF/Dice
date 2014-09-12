import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

	Die one;
	Die two;
	public void setup()
	{
		noLoop();
		size(350,350);
	}
	public void draw()
	{
		background(255);
		one = new Die(100,100);
		two = new Die(200,100);
		one.show();
		one.roll();
		two.show();
		two.roll();
		fill(0);
		int total = one.dots + two.dots;
		text("total is "+ total,150,300);
	}
	public void mousePressed()
	{
		redraw();
	}
	class Die //models one single dice cube
	{
		int myX, myY, dots;//variable declarations here
		Die(int x, int y) //constructor
		{
			myX = x;
			myY = y; 
			dots = (int)(Math.random()*6)+1; //variable initializations here
		}
		public void roll()
		{
			
			int size = 10;

		if(dots==1){
			fill(0);
			ellipse(myX+25,myY+25,size,size);
		}
		if(dots==2){
			fill(0);
			ellipse(myX+18,myY+25,size,size);
			ellipse(myX+32,myY+25,size,size);
		}
		if(dots==3){
			fill(0);
			ellipse(myX+13,myY+25,size,size);
			ellipse(myX+25,myY+25,size,size);
			ellipse(myX+37,myY+25,size,size);
		}
		if(dots==4){
			fill(0);
			ellipse(myX+18,myY+18,size,size);
			ellipse(myX+32,myY+18,size,size);
			ellipse(myX+18,myY+32,size,size);
			ellipse(myX+32,myY+32,size,size);
		}
		if(dots==5){
			fill(0);
			ellipse(myX+15,myY+15,size,size);//top dot
			ellipse(myX+35,myY+15,size,size);//top dot
			ellipse(myX+25,myY+25,size,size);
			ellipse(myX+15,myY+35,size,size);
			ellipse(myX+35,myY+35,size,size);
		}
		if(dots==6){
			fill(0);
			ellipse(myX+15,myY+13,size,size);//top dot
			ellipse(myX+35,myY+13,size,size);//top dot
			ellipse(myX+15,myY+25,size,size);//middle left dot
			ellipse(myX+35,myY+25,size,size);//middle right dot
			ellipse(myX+15,myY+37,size,size);//bottom left dot
			ellipse(myX+35,myY+37,size,size);//bottom right dot
		}
		}
		public void show()
		{
			int siz = 50;
			fill(255);
			rect(myX,myY,siz,siz);
			//fill(0);
			//text("total is "+total,150,300);
			

  }	
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
