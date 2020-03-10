package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import controller.LogInController;
import processing.core.PApplet;

public class LogInScreen {
	private PApplet app;
	private ControlP5 cp5;
	private String[] inputs = {"email","password"};
	private String email,password;
	private LogInController loginC;

	public LogInScreen(PApplet app) {
		this.app = app;
		loginC = new LogInController();
		
		cp5 = new ControlP5(app);
		
		// inputs
		for(int i=0; i < inputs.length; i++) {
			cp5.addTextfield(inputs[i]).setPosition((app.width/2)-100,30+(i*70)).setSize(200, 40);
		}
		// botones
		cp5.addBang("Iniciar Sesión").setPosition(app.width/2, app.height*4/5).setSize(150,50).setColorActive(250).setColorBackground(0);
		
	}
	
	public void paint() {
		app.background(120);
	}
	
	// metodo ocultar
	public void hideBottons(int display) {
		// TODO Auto-generated method stub
	 if(display!=2){
			cp5.hide();
		}
		if(display==2) {
			cp5.show();
			
		} 
	}
	
	public boolean SignIn() {
		boolean isLogIn = false;
		if (app.mouseX > app.width/2 && app.mouseX < app.width/2+150 && app.mouseY > app.height*4/5 && app.mouseY < app.height*4/5+50) {
			email = cp5.get(Textfield.class, "email").getText();
			password = cp5.get(Textfield.class, "password").getText();
		
			
				loginC.acceptInfo(email, password);
					
				if(loginC.isRegister()) {
					isLogIn = true;
				}
			
		}
		return isLogIn;
	}
	
}
