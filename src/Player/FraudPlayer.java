package Player;

import Dices.FraudDice;
public class FraudPlayer extends Player{
	
	/*
	 * ����÷��̾�� �Ϲ��÷��̾��� ������ ������ �ֻ����� �Ϲ� �ֻ������� ��� �ֻ����� �������ִ� constructor�Դϴ�.
	 */
	public FraudPlayer(){
		setMyDice(new FraudDice(""));
	}
}
