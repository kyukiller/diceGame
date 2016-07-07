package Player;

import Dices.Dice;
import Dices.FraudDice;

public class Player {
	private int score = 0;
	private String name = "default";
	private Dice myDice = new Dice();
	private int opponentScore = 0;
	
	public void setMyDice(Dice myDice) {
		this.myDice = myDice;
	}

	public Dice getMyDice() {
		return myDice;
	}

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
		/*
		 * ���ο� �ֻ��� ���� ��� ���� ��Ȳ�� �´� �ֻ����� ������ �޼ҵ��Դϴ�.
		 */
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
