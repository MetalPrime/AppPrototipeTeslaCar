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

	public  CardsScreen(PApplet app) {
		this.app = app;
		app.textSize(15);
		back = app.loadImage("./../Taller1Individual/data/Card/backNormal.png");
		cardsC = new CardsController();
		cp5 = new ControlP5(app);
		numberCards=0;
			cp5.addTextfield(inputsCards[0]).setPosition(app.width/2-50, 0*50).setSize(100,40);
			cp5.addTextfield(inputsCards[1]).setPosition(app.width/2-50, 1*50).setSize(100,40).setInputFilter(ControlP5.INTEGER);
			cp5.addTextfield(inputsCards[2]).setPosition(app.width/2-50, 2*50).setSize(100,40).setInputFilter(ControlP5.INTEGER);
			cp5.addTextfield(inputsCards[3]).setPosition(app.width/2-50, 3*50).setSize(100,40).setInputFilter(ControlP5.INTEGER);
		
		
		cp5.addBang(botton).setPosition(app.width/2-50, 5*50).setSize(100, 40);
		
	}
	
	public void paint() {
		app.background(0);
		app.image(back, 0, 0);
		paintcards();
	}
	
	public void hideBottons(int display) {
		// TODO Auto-generated method stub
	 if(display!=4){
			cp5.hide();
		}
		if(display==4) {
			cp5.show();
			
		} 
	}
	
	public void clicked() {
		if (app.mouseX > app.width/2-50 && app.mouseX < app.width/2-50+100 && app.mouseY > 5*50 && app.mouseY < 5*50+40) {
			titular = cp5.get(Textfield.class, "titular").getText();
			numberCount = Integer.parseInt(cp5.get(Textfield.class, "numberCount").getText());
			dateExpiration = Integer.parseInt(cp5.get(Textfield.class, "dateExpiration").getText()) ;
			CVV = Integer.parseInt(cp5.get(Textfield.class, "CVV").getText());
			
			System.out.println("jjjj");
			//Esto valida que un string sea igual a otro
				
				cardsC.getInfoPage(titular,numberCount,dateExpiration,CVV);
				numberCards ++;
			}
	}
	
	public void paintcards() {
		for(int i=0; i<numberCards; i++) {
			app.image(back, 0, i*50+app.height/2,650,50);
			app.text(titular,20,i*50+app.height/2+10);
			app.text(numberCount,20,i*50+app.height/2+25);
			app.text(dateExpiration,20,i*50+app.height/2+40);
			app.text("Card"+""+i,20,i*50+app.height/2+55);
		}
	}
}
