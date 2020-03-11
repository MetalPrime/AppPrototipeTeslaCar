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
	ShoppingScreen shoppingS;
	CardsScreen cardsS;
	ProfileScreen profileS;
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
			
			shoppingS = new ShoppingScreen(this);
			
			profileS = new ProfileScreen(this);
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
			shoppingS.paint();
			break;
		case 5:
			cardsS.paint();
			break;
		case 6:
			profileS.paint();
			break;
		case 7:
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
			if(principalS.logOut()) {
				screens=0;
			}
			
			if(principalS.logo()) {
				screens=3;
			}
			
			if(principalS.shop()) {
				screens=4;
			}
			
			
			principalS.clicked();
			break;
		case 4:
			if(shoppingS.logOut()) {
				screens=0;
			}
			
			if(shoppingS.logo()) {
				screens=3;
			}
			
			if(shoppingS.shop()) {
				screens=4;
			}
			shoppingS.clicked();
			break;
		case 5:
			if(cardsS.logOut()) {
				screens=0;
			}
			
			if(cardsS.logo()) {
				screens=3;
			}
			
			if(cardsS.shop()) {
				screens=4;
			}
			cardsS.clicked();
			break;
		case 6:
			if(profileS.logOut()) {
				screens=0;
			}
			
			if(profileS.logo()) {
				screens=3;
			}
			
			if(profileS.shop()) {
				screens=4;
			}
			profileS.clicked();
			break;
		}
		
		
	}



}
