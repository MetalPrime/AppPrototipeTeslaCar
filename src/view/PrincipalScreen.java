package view;

import processing.core.PApplet;
import processing.core.PImage;

public class PrincipalScreen {

	private PApplet app;
	private PImage [] carsSelection ;
	private PImage header;
	private int posX,posY;
	private int posXh;
	private int posYh;
	private PImage burgermenu;
	private boolean showBurger;
	
	public PrincipalScreen(PApplet app) {
		carsSelection = new PImage[6];
		header = app.loadImage("./../Taller1Individual/data/Principal/Header.png");
		this.app = app;
		burgermenu = app.loadImage("./../Taller1Individual/data/Principal/burgermenu.png");
		posXh = 0;
		posYh = 0;
		posX = 0;
		posY =141;
		carsSelection[0] = app.loadImage ("./../Taller1Individual/data/Principal/model3.png");
		carsSelection[1] = app.loadImage ("./../Taller1Individual/data/Principal/models.png");
		carsSelection[2] = app.loadImage ("./../Taller1Individual/data/Principal/modelx.png");
		carsSelection[3] = app.loadImage ("./../Taller1Individual/data/Principal/modely.png");
		carsSelection[4] = app.loadImage ("./../Taller1Individual/data/Principal/roadster.png");
		carsSelection[5] = app.loadImage ("./../Taller1Individual/data/Principal/cybertruck.png");
	}
	
	public void paint() {
		app.background(180);
		app.image(header, posXh, posYh);
		for(int i=0; i<carsSelection.length; i++) {
			app.image(carsSelection[i],posX,(i*posY)+108);
		}
		burger();
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
	
	public void clicked() {
		if(app.mouseX > 24 && app.mouseX < 62 &&
				app.mouseY > 29 && app.mouseY < 69) {
			
			showBurger=true;
		} else if(app.mouseX>app.width/2 && app.mouseX<app.width && app.mouseY>0 && app.mouseY<app.height && showBurger==true) {
			showBurger = false;
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
