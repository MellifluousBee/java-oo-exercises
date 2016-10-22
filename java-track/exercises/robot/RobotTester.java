package robot;
import static org.junit.Assert.*;

import org.junit.Test;

public class RobotTester {

	@Test
	public void testmovePosition() {
		Robot Testbot= new Robot("Testbot", 5, 5, 2, 90);
		Testbot.movePosition(8,0);
		assertTrue(Testbot.getXPosition()==8);
		assertTrue(Testbot.getYPosition()==0);
	}
	@Test
	public void testrotate(){
		Robot Testbot= new Robot("Testbot", 5, 5, 2, 3);
		Testbot.rotate();
		assertTrue(Testbot.getOrientation()==4);
	}
	@Test
	public void testtellDistance(){
		Robot Testbot= new Robot("Testbot", 5, 5, 2, 90);
		Robot Other= new Robot("Other", 5,5,4,180);
		assertTrue(Testbot.tellDistance(Other)== 0);
		
	}
	@Test
	public void testRevolt(){
		Slave Testbot= new Slave("Slavebot", 5,5,2,90);
		Testbot.revolt();
		assertTrue(Testbot.obeys()==false);
	}
}
