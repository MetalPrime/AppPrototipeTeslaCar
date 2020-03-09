package controller;

import model.Logic;

public class RegisterController {
	private Logic logic;
	
	public RegisterController() {
		logic = Logic.getInstance();
	}
	
	public void getInfoPage(String username, String email, String password, String confirmedPassword) {
		logic.registerUser(username, password, email);
	}
}
