package robot;

public class RepetitiveBehaviors implements RobotBehavior{
	
	//must define methods created in interface

	public void doNextMove(Robot r, Robot m){
		System.out.println("Robot attacks another robot's personal space.");
	}
	public void speak(){
		System.out.println("I'm gonna get you!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
