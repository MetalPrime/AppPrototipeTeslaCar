package view;

import processing.core.PApplet;
import processing.core.PImage;

public class ShoppingScreen {
	private boolean showBurger;
	private PApplet app;
	private PImage back;
	private PImage burgermenu;
	private PImage header;
	private int posXh;
	private int posYh;



	public ShoppingScreen(PApplet app) {
		this.app = app;
		back = app.loadImage("./../Taller1Individual/data/Card/backNormal.png");
		burgermenu = app.loadImage("./../Taller1Individual/data/Principal/burgermenu.png");
		header = app.loadImage("./../Taller1Individual/data/Principal/Header.png");
		posXh = 0;
		posYh = 0;
	}
	
	public void paint() {
		app.background(0);
		app.image(back, 0, 0);
		app.image(header, posXh, posYh);
		app.text("Current Cart", app.width/2-50,150);
		app.stroke(255,0,0);
		app.strokeWeight(3);
		app.line(app.width/2-50, 160, app.width/2+50, 160);
		burger();
	}
	
	public void clicked() {
		if(app.mouseX > 24 && app.mouseX < 62 &&
				app.mouseY > 29 && app.mouseY < 69) {
			
			showBurger=true;
		} else if(app.mouseX>app.width/2 && app.mouseX<app.width && app.mouseY>0 && app.mouseY<app.height && showBurger==true) {
			showBurger = false;
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


