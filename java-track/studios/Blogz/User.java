package Blogz;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class User {
	
	private String username;
	private String hashedPassword;
	private static List<User> users= new ArrayList<User>();
	
	public User(String username, String password){
		if(isValidUsername(username)){
			this.username=username;
		}else{
			System.out.println("This is not a valid username");
		}
		this.hashedPassword=User.hashPassword(password); //not hashed yet, must use public static method to has before setting instance variable
		users.add(this);
	}
	
	private static String hashPassword(String a){
		if(User.isValidPassword(a)){
			//then hash String a
		}else{
			//error
		}
		
	}
	
	private static Boolean isValidPassword(String a){
		 //did it hash correctly?
			
		}
	private static Boolean isValidUsername(String username){
		 Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]{4,11}");
		 Matcher m = p.matcher(username);
		 boolean b = m.matches();
		 return b;
	}
	public static List<User> getAllUsers(){
		return User.users;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
