package Player;

import Dices.FraudDice;
public class FraudPlayer extends Player{
	
	public FraudPlayer(){
		/*
		 * ����÷��̾�� �Ϲ��÷��̾��� ������ ������ �ֻ����� �Ϲ� �ֻ������� ��� �ֻ����� �������ִ� constructor�Դϴ�.
		 */
		setMyDice(new FraudDice(""));
	}
}
