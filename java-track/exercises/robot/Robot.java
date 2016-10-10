package robot;

public class Robot {
// Fields:	
	private String name;
//	name- string
	private double xPos;
//	position x- double
	private double yPos;
//	position y- double
	private int speed;
//	speed- int
	private int orientation;
//	orientation- north-1, east 2, south 3, west 4
	
	

//create constructor/create robot- purpose of constructor is to give fields a value
public Robot(String name, double xPos, double yPos, int speed, int orientation){//no return type
	//use this.name, for example, to refer to the name declared in the field of the public class
	this.name=name; //sets the field equal to the input parameter
	this.xPos=xPos;
	this.yPos=yPos;
	this.speed=speed;
	this.orientation=orientation;
}
//create methods: getters, obtain field
public String getName(){
	return this.name;
}
public double getXPosition(){
	return this.xPos;
}
public double getYPosition(){
	return this.yPos;
}
public int getSpeed(){
	return this.speed;
}
public int getOrientation(){
	return this.orientation;
}
// behaviors:
// move
// rotate 90degrees
//distance from another object
//return string

public void movePosition(double newXPos, double newYPos){
	this.xPos=newXPos;
	this.yPos=newYPos;
}
public int rotate(){ 
	if(this.orientation<5){
	return this.orientation+=1;	
	}else{
	return this.orientation=1;
	}
	}
public double tellDistance(Robot other){
	double xDist=Math.pow((other.xPos - this.xPos), 2);
	double yDist=Math.pow((other.yPos- this.yPos),2);
	double distance= Math.sqrt(xDist + yDist);
	return distance;
}


public String toString(){
	return "Name: " + this.name + " Position: (" + this.xPos + " , " + this.yPos + ")" + " Speed: " + this.speed + " Orientation: " + this.orientation;
}
public static void main(String args[]){//create an instance of the robot object
	//call the class name as the variable, give name "myRobot", then call constructor
	Robot myRobot= new Robot("Jessica", 2.0, 6.5, 25, 3);
	//have successfully constructed an instance of the Robot class
	//can now use the methods and behaviors previously defined
	System.out.println(myRobot.toString());//toString unecessary, see next line
	System.out.println(myRobot);//automatically calls toString method
}
}
	