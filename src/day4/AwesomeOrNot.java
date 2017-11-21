package day4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…

	// 2. Make a variable that will hold a random number and put a random number
	// into this variable using "new Random().nextInt(4)"
	Random AIDEN = new Random();
	int x = AIDEN.nextInt(4);
	// 3. Print out this variable

	// 4. Get the user to enter something that they think is awesome
	String awesome = JOptionPane.showInputDialog("What is something you think is awesome?");
	// 5. If the random number is 0
	if(AIDEN.equals("0"))
	{
	// -- tell the user whatever they entered is awesome!
JOptionPane.showMessageDialog("That is pretty awesome not gonna lie.")}
	// 6. If the random number is 1
	if(AIDEN.equals("1"))
	{
		// -- tell the user whatever they entered is ok.
		JOptionPane.showMessageDialog(null, "Meh, thats not that awesome.");
	}
	// 7. If the random number is 2
	if(AIDEN.equals("2"))
	{
		// -- tell the user whatever they entered is boring.
		JOptionPane.showMessageDialog(null, "Dude really? Thats just straight up boring.");
	}
	// 8. If the random number is 3
	if(AIDEN.equals("3"))
	{
		// -- write your own answer
		JOptionPane.showMessageDialog(null, "No comment");
	}
}
