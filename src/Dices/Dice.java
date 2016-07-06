package Dices;
import java.util.Random;


public class Dice {
	//Makes a normal dice.
	int value;
	String type = "";
	
	public Dice(){
		//Constructor that sets value each time created.
		roll();
	}
	
	public void roll() {
		//Roll the dice
		Random RandInt = new Random();
		value = 1 + RandInt.nextInt(6);
	}
	
	public int getValue() {
		return value;
	}
	
	public String getType() {
		return type;
	}

	public String toString(){
		//toString method to check dice.
		return "This dice is a normal dice with " + type +  " type and value of " +  value;
	}
	
}
