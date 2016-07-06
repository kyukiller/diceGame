package Facillitators;

import Player.FraudPlayer;
import Player.Player;

public class GameMain {
	public static void main(String[] args) {
		//main method to execute game.
		Player p1 = new FraudPlayer();
		Player p2 = new Player();;
		Judge judge = new Judge(p1, p2);
		judge.setRounds(5);
		judge.insertName();		
		judge.play();
	}
}
