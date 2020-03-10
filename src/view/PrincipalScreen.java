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
	}
	
	public void burger() {
		if(app.mouseX > 157 && app.mouseX < 203 &&
				app.mouseY > 29 && app.mouseY < 69) {
			isClickinLogo = true;
			System.out.println(isClickinLogo);
		} else {
			isClickinLogo = false;
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
		
	}
}
