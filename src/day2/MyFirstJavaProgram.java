package day2;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE
		Robot AIDEN = new Robot();
		AIDEN.miniaturize();
		AIDEN.penDown();
		AIDEN.setSpeed(40);
		AIDEN.setPenWidth(200);
		AIDEN.move(100);
		AIDEN.turn(90);
		AIDEN.move(100);
		AIDEN.turn(90);
		AIDEN.move(100);
		AIDEN.turn(90);
		AIDEN.move(100);

	}
}
