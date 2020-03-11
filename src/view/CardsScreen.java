package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import controller.CardsController;
import processing.core.PApplet;
import processing.core.PImage;

public class CardsScreen {
	
	private PApplet app;
	private CardsController cardsC;
	private PImage back;
	private ControlP5 cp5;
	private String[] inputsCards = {"titular","numberCount","dateExpiration","CVV"};
	private String botton = "botton";
	private String titular;
	private int numberCount,dateExpiration,CVV;
	private int numberCards;
	private boolean showBurger;
	private PImage burgermenu;
	private PImage header;
	private float posXh;
	private float posYh;

	public  CardsScreen(PApplet app) {
		this.app = app;
		app.textSize(15);
		back = app.loadImage("./../Taller1Individual/data/Card/backNormal.png");
		cardsC = new CardsController();
		cp5 = new ControlP5(app);
		numberCards=0;
			cp5.addTextfield(inputsCards[0]).setPosition(app.width/2-50, 0*50+108).setSize(100,40);
			cp5.addTextfield(inputsCards[1]).setPosition(app.width/2-50, 1*50+108).setSize(100,40).setInputFilter(ControlP5.INTEGER);
			cp5.addTextfield(inputsCards[2]).setPosition(app.width/2-50, 2*50+108).setSize(100,40).setInputFilter(ControlP5.INTEGER);
			cp5.addTextfield(inputsCards[3]).setPosition(app.width/2-50, 3*50+108).setSize(100,40).setInputFilter(ControlP5.INTEGER);
		
		
		cp5.addBang(botton).setPosition(app.width/2-50, 4*50+108).setSize(100, 40);
		burgermenu = app.loadImage("./../Taller1Individual/data/Principal/burgermenu.png");
		header = app.loadImage("./../Taller1Individual/data/Principal/Header.png");
		posXh = 0;
		posYh = 0;
	}
	
	public void paint() {
		app.background(0);
		app.image(back, 0, 0);
		app.image(header, posXh, posYh);
		paintcards();
		burger();
	}
	
	public void hideBottons(int display) {
		// TODO Auto-generated method stub
	 if(display!=5){
			cp5.hide();
		}
		if(display==5) {
			cp5.show();
			
		} 
	}
	
	public void clicked() {
		if (app.mouseX > app.width/2-50 && app.mouseX < app.width/2-50+100 && app.mouseY > 4*50+108 && app.mouseY < 4*50+40+108) {
			titular = cp5.get(Textfield.class, "titular").getText();
			numberCount = Integer.parseInt(cp5.get(Textfield.class, "numberCount").getText());
			dateExpiration = Integer.parseInt(cp5.get(Textfield.class, "dateExpiration").getText()) ;
			CVV = Integer.parseInt(cp5.get(Textfield.class, "CVV").getText());
			
			System.out.println("jjjj");
			//Esto valida que un string sea igual a otro
				
				cardsC.getInfoPage(titular,numberCount,dateExpiration,CVV);
				numberCards ++;
			}
		
		if(app.mouseX > 24 && app.mouseX < 62 &&
				app.mouseY > 29 && app.mouseY < 69) {
			
			showBurger=true;
		} else if(app.mouseX>app.width/2 && app.mouseX<app.width && app.mouseY>0 && app.mouseY<app.height && showBurger==true) {
			showBurger = false;
		}
	}
	

	
	public void paintcards() {
		for(int i=0; i<numberCards; i++) {
			int desplazar= 0;
			app.image(back, 0, i*50+app.height/2+desplazar,650,70);
			app.text(titular,20,i*50+app.height/2+10+desplazar);
			app.text(numberCount,20,i*50+app.height/2+25+desplazar);
			app.text(dateExpiration,20,i*50+app.height/2+40+desplazar);
			app.text("Card"+""+i,20,i*50+app.height/2+55+desplazar);

			desplazar = +10;
			
			
		}
	}
	
	public void burger() {
		if(showBurger==true) {
			app.image(burgermenu, 0, 0);
		} else {
			//isClickinLogo = false;
		}
	}
	
	public boolean logo() {
		boolean isClickinLogo = false;
		if(app.mouseX > 157 && app.mouseX < 203 &&
				app.mouseY > 29 && app.mouseY < 69) {
			isClickinLogo = true;
			System.out.println(isClickinLogo);
		} else {
			isClickinLogo = false;
		}
		return isClickinLogo;	
	}
	
	public boolean shop() {
		boolean isClickinShop = false;
		if(app.mouseX > 294 && app.mouseX < 340 &&
				app.mouseY > 29 && app.mouseY < 69) {
			isClickinShop = true;
			System.out.println(isClickinShop);
		} else {
			isClickinShop = false;
		}
		return isClickinShop;
	}
	
	
	
	public boolean profile() {
		if(showBurger && app.mouseX > 31 && app.mouseX < 97 &&
				app.mouseY > 265 && app.mouseY < 285 ) {
			return true;
		} else {
			return false;
		}
				
	}
	
	public boolean cards() {
		if(showBurger && app.mouseX > 31 && app.mouseX < 153 &&
				app.mouseY > 322 && app.mouseY < 339 ) {
			return true;
		} else {
			return false;
		}
		
		
	}
	
	public boolean directions() {
		if(showBurger && app.mouseX > 31 && app.mouseX < 125 &&
				app.mouseY > 385 && app.mouseY < 405 ) {
			return true;
		} else {
			return false;
		}
		
		
	}
	

	
	public boolean logOut() {
		if(showBurger && app.mouseX > 65 && app.mouseX < 170 &&
				app.mouseY > 590 && app.mouseY < 610 ) {
			return true;
		} else {
			return false;
		}
		
	}
}
