package day3;

import javax.swing.JOptionPane;

public class Hello_World {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print("Hi");
			// String name = "AIDEN";
			// JOptionPane.showMessageDialog(null, name);
			String input = JOptionPane.showInputDialog("Enter your name");
			JOptionPane.showMessageDialog(null, "Hello " + input);
			String city = JOptionPane.showInputDialog("Where are you from?");
			if (city.equalsIgnoreCase("San Diego")) {
				JOptionPane.showMessageDialog(null, "Ur Kewl");
			} else {
				JOptionPane.showMessageDialog(null, "Move plz");
			}
		}

	}

}
