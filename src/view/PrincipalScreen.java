package view;

import processing.core.PApplet;
import processing.core.PImage;

public class PrincipalScreen {

	private PApplet app;
	private PImage [] carsSelection ;
	
	public PrincipalScreen(PApplet app) {
		carsSelection = new PImage[6];
		this.app = app;
		carsSelection[0] = app.loadImage ("./../Taller1Individual/data/Principal/model3.png");
		carsSelection[1] = app.loadImage ("./../Taller1Individual/data/Principal/models.png");
		carsSelection[2] = app.loadImage ("./../Taller1Individual/data/Principal/modelx.png");
		carsSelection[3] = app.loadImage ("./../Taller1Individual/data/Principal/modely.png");
		carsSelection[4] = app.loadImage ("./../Taller1Individual/data/Principal/roadster.png");
		carsSelection[5] = app.loadImage ("./../Taller1Individual/data/Principal/cybertruck.png");
	}
	
	public void paint() {
		for(int i=0; i<carsSelection.length; i++) {
			app.image(carsSelection[i],0,i*141);
		}
	}
	
	public void clicked() {
		
	}
}
