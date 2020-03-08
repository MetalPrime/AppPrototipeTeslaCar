package view;

import controlP5.ControlP5;
import processing.core.PApplet;
import processing.core.PImage;

public class StartScreen {
	
	private ControlP5 cp5;
	private PApplet app;
	private String[] bottons = {"GetStarted","SignIn"};
	private PImage back,logo;

	public StartScreen(PApplet app) {
		// TODO Auto-generated constructor stub
		this.app = app;
		cp5 = new ControlP5(app);
		

		for(int i=0; i< bottons.length; i++) {
			
			cp5.addBang(bottons[i]).setPosition(app.width/2-75,(i*70)+app.height/2+50).setSize(150,50);
		}
		back = app.loadImage("./../Taller1Individual/data/Register/background.png");
		logo = app.loadImage("./../Taller1Individual/data/Register/logo.png");
	}
	
	

	public void paint() {
		// TODO Auto-generated method stub
		app.background(180);
		app.image (back,0,0);
		app.image (logo,app.width/5,app.height/10);
		
		
	}


	public boolean GetStarted() {
		if(app.mouseX>(app.width/2-75) && app.mouseX<((app.width/2-75)+150) && app.mouseY > ((0*70)+app.height/2+50) && app.mouseY < ((1*70)+app.height/2+50)+50 ) {
			return true;
		} else {
			return false;
		}
		
		
	}
	
	public boolean SignIn() {
	
		if(app.mouseX>(app.width/2-75) && app.mouseX<((app.width/2-75)+150) && app.mouseY >(((1*70)+app.height/2+50)) && app.mouseY < (((2*70)+app.height/2+50)+50) ) {
			return true;
		} else {
			return false;
		}
	}

}
