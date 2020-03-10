package controller;

import model.Logic;

public class CardsController {
	
	private Logic logic;
	
	public CardsController(){
		logic = Logic.getInstance();
	}
	
	public void getInfoPage (String titular,int numberCount,int dateExpiration,int CVV) {
		logic.registerCard(titular, numberCount, dateExpiration, CVV);
	}
}
