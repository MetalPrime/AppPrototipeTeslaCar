package view;

import controlP5.ControlP5;
import controller.RegisterController;
import processing.core.PApplet;

public class RegisterScreen {
	
	private PApplet app;
	private ControlP5 cp5;
	private RegisterController registerC;
	private String[] inputsRegister = {"username","password","confirmedPassword","email"};
	private String username,password,confirmedPassword,email;
	
	
	public RegisterScreen(PApplet app) {
		this.app = app;
		cp5 = new ControlP5(app);
		
		registerC = new RegisterController();
		
		for(int i=0; i<inputsRegister.length; i++) {
			cp5.addTextfield(inputsRegister[i]).setPosition((app.width/2)-100,30+(i*70)).setSize(200,40).setAutoClear(true);
		}
	}

	public void paint() {
		// TODO Auto-generated method stub
		
	}

	public void clicked() {
		// TODO Auto-generated method stub
		
	}

	public void pressed() {
		// TODO Auto-generated method stub
		
	}
	
	
}
