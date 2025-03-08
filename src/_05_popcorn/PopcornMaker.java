package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String flavor = JOptionPane.showInputDialog("What do you want your flavor to be?");
		String minutes = JOptionPane.showInputDialog("How long do you want to cook it?");
		int minutesInt = Integer.parseInt(minutes);
		Popcorn popcorn = new Popcorn(flavor);
		Microwave microwave = new Microwave();
		microwave.putInMicrowave(popcorn);
		microwave.setTime(minutesInt);
		microwave.startMicrowave();
	}

}
