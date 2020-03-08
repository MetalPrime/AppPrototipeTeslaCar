package view;

import controlP5.ControlP5;
import processing.core.PApplet;
import processing.core.PImage;

public class StartScreen {
	
	private ControlP5 cp5;
	private PApplet app;
	private String[] bottons = {"Get Started","Sign In"};
	private PImage back,logo;

	public StartScreen(PApplet app) {
		// TODO Auto-generated constructor stub
		this.app = app;
		cp5 = new ControlP5(app);
		for(int i=0; i< bottons.length; i++) {
			System.out.println(bottons.length);
			cp5.addBang(bottons[i]).setPosition(app.width/2-75,(i*70)+app.height/2).setSize(150,50);
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

	public void clicked() {
		// TODO Auto-generated method stub
		
	}

}
