package Dices;

public class FraudDice extends Dice{
	
	public FraudDice(String status){
		//Dice constructor that changes for each status
		if (status == "losing"){
			type = "[STRONG]";
			do{ roll();
			} while (value <= 2);
		} else if(status == "winning"){
			type = "[WEAK]";
			do{ roll();
			} while (value >= 5);
		} else{
			type = "[NORMAL]";
			roll();
		}
	}
	
	public String toString(){
		//toString method to check dice.
		return "This dice is a FraudDice with " + type +  " type and value of " +  value;
	}
	
}
