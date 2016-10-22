package robot;

public class DefensiveBehaviors implements RobotBehavior{
	
	
	public void doNextMove(Robot r, Robot m){
		if (r.xPos == m.xPos){
			if (r.yPos==m.yPos){
				System.out.println("Invasion contained. Enemy disarmed");
			}
		}
	}
	public void speak(){
		System.out.println("Hey you! Get outta here!");
	}
	
	

}
