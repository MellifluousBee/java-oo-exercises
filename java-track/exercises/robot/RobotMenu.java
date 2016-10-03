package robot;

import java.util.ArrayList;//used to hold robot objects as we create them
import java.util.Scanner;//used to get the user input

public class RobotMenu {
//create two instance variables
	private ArrayList<Robot>robots;//need angle brackets to indicate the kind of object the arraylist contains
	private Scanner s;
	
	public static void main (String[]args){
		//sentinel struture
		//creates instance of Robot Menu
		int x = 0;
		RobotMenu rm=new RobotMenu();
		do{
			x=rm.startMenu();//asks user for an option
			rm.processInput(x);//process information
		}while(x !=5);//does it over and over again until input 5
	}
		
	public RobotMenu(){//constructor
		s= new Scanner(System.in);//initialize the scanner constructor with a print stream that allows user to input into console
		robots= new ArrayList<Robot>();//creates empty arraylist for us to start storing robot objects
	}
	
	public int startMenu(){
		System.out.println("Robot Menu:");
		System.out.println("1. Create a robot");
		System.out.println("2. Display the list of available robots");
		System.out.println("3. Move a robot");
		System.out.println("4. Rotate a robot");
		System.out.println("5. Compute the distance between two robots");
		System.out.println("6. Exit");
		System.out.println("Please select an option:");
		
		int selection=s.nextInt();//uses Scanner to ask user to type in an integer value
		while(selection<1 || selection>6){//uses another sentinel to check if user is picking available options
			System.out.println("Invalid Selection");
			selection= s.nextInt();//scanner reasks user to type an Int
		}
		return selection;
	}//selection passes on to input processor
	
	public void processInput(int selection){
		if (selection==1){
			createRobot();
			
		}
		else if (selection==2){
			displayRobots();
		}
		else if (selection==3){
			displayRobots();
			Robot r =selectRobot();
			System.out.println("Please type a new X coordinate:");
			int xPos=s.nextInt();
			System.out.println("Please type a new Y coordinate:");
			int yPos=s.nextInt();
			r.movePosition(xPos, yPos);
		}
		else if (selection == 4){
			displayRobots();
			Robot r= selectRobot();
			r.rotate();
			System.out.println("Your robot has rotated!");
		}
		else if (selection == 5){
			displayRobots();
			Robot r= selectRobot();
			displayRobots();
			Robot s= selectRobot();
			System.out.println(r.tellDistance(s) + " is the distance between the two");
		}
		else{
			return;
		}
	}
	private void displayRobots(){
		for(int i=0; i<robots.size(); i++){//iterate over array list and print robot objects, size method tell how big the list is
			System.out.println((i+1)+ ".)" + robots.get(i));
		}
	}
	private Robot selectRobot(){//gets robot out of display list
		System.out.println("Please select a robot:");
		int selection= s.nextInt();
		while(selection<1 || selection>robots.size()){
			System.out.println("Invalid selection");
			selection=s.nextInt();
		}
		return robots.get(selection-1);//selection is plugged into a get method as an index to access the robot in the ArrayList
	}
	private void createRobot(){
		
		System.out.println("Please enter a name for the robot:");
		String name=s.next();
		System.out.println("Please enter an X coordinate:");
		int xPos= s.nextInt();
		System.out.println("Please enter a Y coordinate");
		int yPos=s.nextInt();
		System.out.println("Please enter a speed:");
		int speed= s.nextInt();
		System.out.println("Plese enter an orientation (north=1, east=2, south=3 west=4):");
		int orientation=s.nextInt();
		robots.add(new Robot(name, xPos, yPos, speed, orientation));
	}
}