package module3;

//Tell Java where to find PApplet
//Ref: https://processing.org/reference/
import processing.core.*; 


public class MyPApplet extends PApplet{
	
	private String URL = "beach.jpg";
	private PImage backgroundImg;
	
	//Configure canvas (executed once) -> only to load images into memory, not to show it
	public void setup() {
		size(800,600);
		backgroundImg = loadImage(URL, "jpg");
		backgroundImg.resize(0, height); //let Java calculate the width
		image(backgroundImg, 0, 0);
	}
	
	//Display content (loops many times)
	public void draw() {
		int[] color = sunColorSec(second());
		fill(color[0], color[1], color[2]);
		ellipse(width/4*3, height/5, 150, 150);
		
	}
	
	public int[] sunColorSec(float seconds) {
		int[] rgb = new int[3];
		
		//scale color based on seconds(0 sec: bright yellow, 30 sec: black)
		float diffFrom30 = Math.abs(30-seconds);
		
		float ratio = diffFrom30/30;
		rgb[0] = (int)(255*ratio);
		rgb[1] = (int)(255*ratio);
		rgb[2] = 0;
		
		return rgb;
	}
	
	public static void main (String[] args) {
		
	}

}
