package view;

import processing.core.PApplet;

public class MainScreen extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(MainScreen.class.getName());
	}
	StartScreen startS;
	RegisterScreen registerS;
	LogInScreen loginS;
	private int screens = 0;

	public void settings() {
		size(360, 640);
	}

	public void setup() {
		
		
		
		switch(screens) {
		case 0:
			startS = new StartScreen(this);
			break;
		case 1:
			
			registerS = new RegisterScreen(this);
			break;
		case 2:
			loginS = new LogInScreen(this);
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
		case 2:
			loginS.paint();
			break;
			
		
		}
		
		
	}

	public void mouseClicked() {
		
		switch(screens) {
		case 0:
			if(startS.GetStarted()) {
				screens=1;
				setup();
			} 
			
			
			if(startS.SignIn()) {
				screens=2;
				setup();
			}
			break;
		case 1:
			if(registerS.clicked()) {
				//screens=2;
				setup();
			}
			
			break;
		case 2:
			if(loginS.SignIn()) {
				screens=3;
				setup();
			}
			
			break;
		}
		
		
	}



}
