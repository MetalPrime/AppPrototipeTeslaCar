package controller;

import model.Logic;

public class LogInController {

	private Logic logic;
	
	public LogInController() {
		logic = new Logic();
	}

	public void acceptInfo(String email, String password) {
		logic.enterUser(email, password);
	
	}
	
}
