package Player;

import Dices.Dice;
import Dices.FraudDice;

public class Player {
	int score = 0;
	String name = "default";
	Dice myDice = new Dice();
	int opponentScore = 0;
	
	public Player(){
	}

	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public void setOpponentScore(int score) {
		this.opponentScore = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Dice getDice() {
		return myDice;
	}
	
	public void changeDice(){
		//creates a new dice to roll when called.
		if (score-opponentScore>=6 && myDice instanceof FraudDice){
			myDice = new FraudDice("winning");
		} else if (score<opponentScore && myDice instanceof FraudDice){
			myDice = new FraudDice("losing");
		} else if (score-opponentScore <= 6 && score >= opponentScore && myDice instanceof FraudDice){
			myDice = new FraudDice("");
		} else {			
			myDice = new Dice();
		}
	}	
}
