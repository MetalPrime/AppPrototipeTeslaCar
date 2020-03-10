package model;

import java.util.ArrayList;

public class Logic {
	
	private  ArrayList<User> listUsers = new ArrayList<User>();
	private  ArrayList<Cards> listCards = new ArrayList<Cards>();
	private boolean isRegister = false;
	private Car[] teslaCars;
	private static Logic instance = null;
	
	private Logic() {
		
		
	}
	
	// mantener la logica usada en las demás clases, como la unics 
	public static Logic getInstance() {
		if(instance==null) {
			instance = new Logic();
			
		} 
		return instance;
		
		
	}
	
	// añadir un nuevo usuario
	public void registerUser(String username,String password,String email) {
		
		listUsers.add(new User(username, email, password));
		System.out.println(listUsers.size());
	}
	// verificar si hay algún usuario registrado
	public void enterUser(String email, String password) {
		
	
		System.out.println(listUsers.size());
	/*	System.out.println("password");
		System.out.println("===============");*/
		for (User user : listUsers) {
	System.out.println("====0000===0000=====00=");
			
			if(user.getEmail().equals(email) && user.getPassword().equals(password) ) {
				
				System.out.println("====0000===0000=====00=");
				isRegister = true;
			} 
		} 
		
		
		
	}
	// confirmar el usuario registrado
	public boolean isUser() {

		return isRegister;
		
	}
	
	
	/////////////////////////////////////////////////////
	
	
	//añadir una tarjeta nueva
	public void registerCard(String titular,int numberCount,int dateExpiration, int CVV) {
		listCards.add(new Cards(titular, numberCount, dateExpiration, CVV));
	}
}
