package Facillitators;

import Player.FraudPlayer;
import Player.Player;

public class GameMain {
	public static void main(String[] args) {
		/*
		 * ���� ������ ����Ǵ� ���� �޼ҵ��Դϴ�.
		 */
		Player p1 = new Player();
		Player p2 = new FraudPlayer();;
		Judge judge = new Judge(p1, p2);
		judge.setRounds(5);
		judge.insertName();		
		judge.play();
	}
}
