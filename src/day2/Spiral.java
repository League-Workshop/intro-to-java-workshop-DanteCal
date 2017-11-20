package day2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot AIDEN = new Robot();
		// 5. Set your robot's pen to the down position
		AIDEN.penDown();
		// 3. Set the robot to go at max speed (10)
		AIDEN.setSpeed(10);
		// 4. Do the following (steps 6-8) 75 times
		int i = 0;
		while (i < 75) {

			// 7. Change the pen color to random
			AIDEN.setRandomPenColor();
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
			AIDEN.move(5 * i);
			// 2. Turn the robot 1/7 of 360 degrees to the right
			AIDEN.turn(360 / 7);
			// 8. Set the pen width to i
			AIDEN.setPenWidth(i);
			i++;
		}
	}
}
