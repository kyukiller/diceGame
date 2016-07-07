package Player;

import Dices.FraudDice;
public class FraudPlayer extends Player{
	
	public FraudPlayer(){
		/*
		 * 사기플레이어와 일반플레이어의 유일한 차이인 주사위를 일반 주사위에서 사기 주사위로 설정해주는 constructor입니다.
		 */
		setMyDice(new FraudDice(""));
	}
}
