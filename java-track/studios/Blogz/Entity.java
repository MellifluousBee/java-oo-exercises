package Blogz;

abstract class Entity {
	
	//abstract String serialize();
	
//public class User extends Entity{}
	//protected String serialize(){return "abc";}

	
	private final int uid; //unique identifier
	
	
	public Entity(String user, String post, int uid){
		this.uid= uid;
		
	
	}
	public int getUID(){
		return this.uid;
	}
}
