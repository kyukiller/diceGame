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
		 * 선수들의 각 라운드 결과를 기록할 심판을 만듭니다.
		 * 
		 * @param Player player1, Player player2 기록할 선수 둘
		 */
		p1 = player1;
		p2 = player2;
	}
	
	public void determineFraudPlayer(){
		/*
		 * 선수들 중 누가 FraudPlayer인지를 whoFraud 변수에 저장하기 위한 메소드입니다.
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
		 * 각 상황에 맞는 문장을 출력합니다. 보통 플레이어는 괄호가 필요 없기 때문에 switch...case로 작성하여 네 가지 상황에 맞게 만들어 봤습니다.
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
		 * 모든 라운드가 끝났을 때 호출될 메소드 입니다. 최종 점수를 가지고 승자를 판단합니다.
		 */
		if (p1.getScore()>p2.getScore()){
			System.out.println(p1.getName()+"가 승리했습니다!");
		} else if (p2.getScore()>p1.getScore()){
		System.out.println(p2.getName()+"가 승리했습니다!");
		} else {
		System.out.println("동점입니다!");
		}
	}
	
	
}
