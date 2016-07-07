package Facillitators;

import Dices.Dice;
import Player.Player;
import Player.FraudPlayer;

public class Recorder {
	private Player p1;
	private Player p2;
	
	private enum WhoFraud{
		BOTH, PLAYERONE, PLAYERTWO, NONE
	}
	private WhoFraud whoFraud;
		
	public Recorder(Player player1, Player player2){
		/**
		 * �������� �� ���� ����� ����� ������ ����ϴ�.
		 * 
		 * @param Player player1, Player player2 ����� ���� ��
		 */
		p1 = player1;
		p2 = player2;
	}
	
	public void determineFraudPlayer(){
		/*
		 * ������ �� ���� FraudPlayer������ whoFraud ������ �����ϱ� ���� �޼ҵ��Դϴ�.
		 */
		if (p1 instanceof FraudPlayer && p2 instanceof FraudPlayer){
			whoFraud = WhoFraud.BOTH;
		} else if(p1 instanceof FraudPlayer){
			whoFraud = WhoFraud.PLAYERONE;
		} else if(p2 instanceof FraudPlayer){
			whoFraud = WhoFraud.PLAYERTWO;
		} else {
			whoFraud = WhoFraud.NONE;
		}
	}
	
	public void record(){
		/*
		 * �� ��Ȳ�� �´� ������ ����մϴ�. ���� �÷��̾�� ��ȣ�� �ʿ� ���� ������ switch...case�� �ۼ��Ͽ� �� ���� ��Ȳ�� �°� ����� �ý��ϴ�.
		 */
		determineFraudPlayer();
		switch(whoFraud){
		case BOTH:
			System.out.println("[" + p1.getName() + ":" + p1.getScore() + " [" + Dice.typeToString(p1.getDice().getType()) +
					"] " + p2.getName()+":"+ p2.getScore() + " [" +  Dice.typeToString(p2.getDice().getType())+ "]" + "]");
			break;
		case PLAYERONE:
			System.out.println("[" + p1.getName() + ":" + p1.getScore() + " [" + Dice.typeToString(p1.getDice().getType()) +
					"] " + p2.getName()+":"+ p2.getScore() + Dice.typeToString(p2.getDice().getType()) + "]");
			break;
		case PLAYERTWO:
			System.out.println("[" + p1.getName() + ":" + p1.getScore() + " " + Dice.typeToString(p1.getDice().getType()) +
					" " + p2.getName()+":"+ p2.getScore() + " [" +  Dice.typeToString(p2.getDice().getType())+ "]" + "]");
			break;
		case NONE:
			System.out.println("[" + p1.getName() + ":" + p1.getScore() + " " + Dice.typeToString(p1.getDice().getType()) +
					" " + p2.getName()+":"+ p2.getScore()+ Dice.typeToString(p2.getDice().getType()) + "]");
			break;
		}
	}
	

	
	public void result(){
		/*
		 * ��� ���尡 ������ �� ȣ��� �޼ҵ� �Դϴ�. ���� ������ ������ ���ڸ� �Ǵ��մϴ�.
		 */
		if (p1.getScore()>p2.getScore()){
			System.out.println(p1.getName()+"�� �¸��߽��ϴ�!");
		} else if (p2.getScore()>p1.getScore()){
		System.out.println(p2.getName()+"�� �¸��߽��ϴ�!");
		} else {
		System.out.println("�����Դϴ�!");
		}
	}
	
	
}
