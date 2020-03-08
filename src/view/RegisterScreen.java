package view;

import controlP5.ControlP5;
import controlP5.Textfield;
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
		
		cp5.addBang("Registrarse").setPosition(app.width/2, app.height*4/5).setSize(150,50).setColorActive(250).setColorBackground(0);
	}

	public void paint() {
		// TODO Auto-generated method stub
		app.background(150);
		
		
	
	}

	public void clicked() {
		// TODO Auto-generated method stub
		//Conseguir la sabrosa información
		if (app.mouseX > app.width/2 && app.mouseX < app.width/2+150 && app.mouseY > app.height*4/5 && app.mouseY < app.height*4/5+50) {
			username = cp5.get(Textfield.class, "username").getText();
			password = cp5.get(Textfield.class, "password").getText();
			confirmedPassword = cp5.get(Textfield.class, "confirmedPassword").getText();
			email = cp5.get(Textfield.class, "email").getText();
			
			//Esto valida que un string sea igual a otro
			if(password.equals(confirmedPassword)) {
				registerC.getInfoPage(username,email,password,confirmedPassword);
			}
		}
	}


	
	
}
