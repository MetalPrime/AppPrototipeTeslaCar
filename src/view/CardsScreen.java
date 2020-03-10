package view;

import controller.CardsController;
import processing.core.PApplet;
import processing.core.PImage;

public class CardsScreen {
	
	private PApplet app;
	private CardsController cardsC;
	private PImage back;

	public  CardsScreen(PApplet app) {
		this.app = app;
		back = app.loadImage("./../Taller1Individual/data/Card/backNormal.png");
		
	}
	
	public void paint() {
		app.background(0);
		app.image(back, 0, 0);
		
	}
	
	public void clicked() {
		
	}
}
