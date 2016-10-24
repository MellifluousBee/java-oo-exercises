package Blogz;

import Student.Student;

abstract class Entity {
	
	//abstract String serialize();
	
//public class User extends Entity{}
	//protected String serialize(){return "abc";}

	
	private final int uid; //unique identifier
	
	
	public Entity(int uid){
			this.uid= uid;
		
	
	}
	public int getUID(){
		return this.uid;
	}
	@Override
	public boolean equals(Object o){
		//self check
		if (this == o)
			return true;
		//null check
		if(o==null)
			return false;
		//type check and cast
		if (getClass() != getClass())
			return false;
		Entity entity= (Entity) o;
		//field comparison
		return java.util.Objects.equals(uid, entity.uid);
	}	
}
