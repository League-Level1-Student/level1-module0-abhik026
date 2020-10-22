package _01_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot();
	int y;
	String height;
	Random ran = new Random();
	public void run() {
		rob.setX(35);
		rob.setY(500);
		rob.setPenWidth(5);
		rob.setSpeed(65);
		rob.penDown();
		
		
		for(int i = 0; i<10; i++) {
			int house = ran.nextInt(3);
			if(house ==  0) {
			height = "small";	
			}
			else if(house == 1) {
				height = "medium";
			}
			else {
				height = "large";
			}
			building(height, ran.nextInt(31)+20);
		}
		
	}
	
	private void building(String x, int grass) {
		// TODO Auto-generated method stub
		if(x.equalsIgnoreCase("small")) {
			y = ran.nextInt(31)+ 60;
		}
		else if (x.equalsIgnoreCase("medium")) {
			y = ran.nextInt(41)+ 120;
		}
		else {
			y = ran.nextInt(40)+ 180;
		}
		rob.setRandomPenColor();
		rob.setAngle(0);
		rob.move(y);
		if(height.equalsIgnoreCase("large")){
			flatroof();
		}else {
			pointedroof();
		}
		rob.move(y);
		rob.turn(-90);
		rob.penUp();
		rob.move(7);
		rob.penDown();
		rob.setPenColor(0, 100,0);
		rob.move(grass);
	}
	
private void flatroof() {
	rob.turn(90);
	rob.move(40);
	rob.turn(90);
}
private void pointedroof() {
	rob.turn(45);
	rob.move(28);
	rob.turn(90);
	rob.move(28);
	rob.turn(45);
}
}

