package robot;

public class Bodyguard extends Robot {//bodyguard is a type of robot object
	
	private boolean hasWeapons;
	
	public Bodyguard(String name, double xPos, double yPos, int speed, int orientation){
		super(name, xPos, yPos, speed, orientation);
		this.hasWeapons= true;
		
	}
	
	public void attack(){
		System.out.println("Bodyguard thwarts attacker");
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bodyguard b= new Bodyguard("B", 2, 3, 5, 90);
		b.attack();
		
	}

}
