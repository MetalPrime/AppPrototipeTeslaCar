package view;

import processing.core.PApplet;

public class MainScreen extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(MainScreen.class.getName());
	}

	RegisterScreen registerS;

	public void settings() {
		size(360, 640);
	}

	public void setup() {
		registerS = new RegisterScreen(this);
				
	}

	public void draw() {
		registerS.paint();
	}

	public void mouseClicked() {
		registerS.clicked();
	}

	public void keyPressed() {
		registerS.pressed();
	}

}
