package model;

import java.util.ArrayList;

public class Logic {
	
	private ArrayList<User> listUsers;
	private Car[] teslaCars;
	
	public Logic() {
		listUsers = new ArrayList<User>();
	}
	
	
	
	public void registerUser(String username,String password,String email) {
		
		listUsers.add(new User(username, email, password));
		System.out.println(listUsers.size());
	}
	
	public void enterUser(String email, String password) {
		
		System.out.println(listUsers.get(0).getEmail());
		System.out.println("password");
		System.out.println("===============");
		for (int i= 0; i<listUsers.size();i++) {
			System.out.println("====0000===0000=====00=");
		
			/*if(user.getEmail().equals(email) && user.getPassword().equals(password) ) {
				
				System.out.println("====0000===0000=====00=");
			} */
		}
		
	}
}
