package Facillitators;

import Player.FraudPlayer;
import Player.Player;

public class GameMain {
	
	/*
	 * ���� ������ ����Ǵ� ���� �޼ҵ��Դϴ�.
	 */
	public static void main(String[] args) {
		Player p1 = new Player();
		Player p2 = new FraudPlayer();;
		Judge judge = new Judge(p1, p2);
		judge.setRounds(5);
		judge.insertName();		
		judge.play();
	}
}
