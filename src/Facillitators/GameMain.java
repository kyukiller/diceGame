package Facillitators;

import Player.FraudPlayer;
import Player.Player;

public class GameMain {
	public static void main(String[] args) {
		/*
		 * 실제 게임이 진행되는 메인 메소드입니다.
		 */
		Player p1 = new Player();
		Player p2 = new FraudPlayer();;
		Judge judge = new Judge(p1, p2);
		judge.setRounds(5);
		judge.insertName();		
		judge.play();
	}
}
