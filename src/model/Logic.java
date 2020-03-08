package model;

import java.util.ArrayList;

public class Logic {
	
	private ArrayList<User> listUsers;
	
	public Logic() {
		listUsers = new ArrayList<User>();
	}
	
	
	
	public void registerUser(String username,String password,String email) {
		
		listUsers.add(new User(username, email, password));
		
		
		for (User user : listUsers) {
			System.out.println(user.getUsername());
			System.out.println(user.getEmail());
			System.out.println(user.getPassword());
			System.out.println("===================");
		}
	}
}
