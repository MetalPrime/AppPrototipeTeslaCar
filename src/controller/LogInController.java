package controller;

import model.Logic;

public class LogInController {

	private Logic logic;
	
	public LogInController() {
		logic = Logic.getInstance();
	}

	public void acceptInfo(String email, String password) {
		logic.enterUser(email, password);
	
	}
	
}
