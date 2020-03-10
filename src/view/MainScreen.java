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
	PrincipalScreen principalS;
	CardsScreen cardsS;
	private int screens;

	public void settings() {
		size(360, 640);
	}

	public void setup() {
		
			screens = 3;
		
			startS = new StartScreen(this);
		
			
			registerS = new RegisterScreen(this);
			
			loginS = new LogInScreen(this);
			
			principalS = new PrincipalScreen(this);
			
			cardsS = new CardsScreen(this);
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
		case 3:
			principalS.paint();
			break;
		case 4:
			cardsS.paint();
			break;
		
		}
		text(mouseX, mouseX, mouseY);
		text(mouseY, mouseX+10, mouseY+12);
		hide();
	}
	
	public void hide() {
		startS.hideBottons(screens);
		registerS.hideBottons(screens);
		loginS.hideBottons(screens);
		cardsS.hideBottons(screens);
	}

	public void mouseClicked() {
	
		switch(screens) {
		case 0:
			if(startS.GetStarted()) {
				screens=1;
				
			} 
			
			
			if(startS.SignIn()) {
				screens=2;
				
			}
			break;
		case 1:
			if(registerS.clicked()) {
				screens=2;
				
			}
			
			break;
		case 2:
			if(loginS.SignIn()) {
				screens=3;
				
			}
			break;
		case 3:
			if(principalS.logo()) {
				screens=3;
			}
			
			if(principalS.shop()) {
				screens=4;
			}
			break;
		case 4:
			cardsS.clicked();
			break;
		}
		
		
	}



}
