package robot;

public class Chef extends Robot {//chef is a type of robot object
	
	private boolean hasDinner;
	
	public Chef(String name, double xPos, double yPos, int speed, int orientation){
		super(name, xPos, yPos, speed, orientation);//inherits definitions from superclass
		this.hasDinner=true;   //has to change robot fields to protected instead of private
	}
	
	public boolean obeys(){
		if(hasDinner){
			return true;
		}else{
			return false;
		}
	}
	
	public void cook(){
		this.hasDinner=false;
		System.out.println("Bon Appetit!");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chef s= new Chef("slave",2,2,2,1);
		s.cook();
	}

}
