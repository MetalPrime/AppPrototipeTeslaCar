package view;

import processing.core.PApplet;

public class MainScreen extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(MainScreen.class.getName());
	}
	StartScreen startS;
	RegisterScreen registerS;
	private int screens;

	public void settings() {
		size(360, 640);
	}

	public void setup() {
		
		
		screens= 0;
		switch(screens) {
		case 0:
			startS = new StartScreen(this);
			break;
		case 1:
			
			registerS = new RegisterScreen(this);
			break;
		}
		
	}

	public void draw() {
		background(0);
		switch(screens) {
		case 0:
			startS.paint();
			break;
		case 1:
			registerS.paint();
			break;
		}
		
		
	}

	public void mouseClicked() {
		switch(screens) {
		case 0:
			startS.clicked();
			break;
		case 1:
			registerS.clicked();
			break;
		}
		
		
	}

	public void keyPressed() {
		
	}

}
