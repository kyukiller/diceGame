package Dices;

public class FraudDice extends Dice{
	
	public FraudDice(String status){
		/*
		 * �ֻ����� ���¸� �޾Ƽ� �׿� �����ϴ� �ֻ����� �����ϴ�.
		 * 
		 * @param String status ������ ���� �ִ���, �̱�� �ִ����� ���¸� ��Ÿ���ִ� String�� �޽��ϴ�.
		 */
		if (status == "losing"){
			setType(Type.STRONG);
			do{ 
			roll();
			} while (getValue() <= 2);
		} else if(status == "winning"){
			setType(Type.WEAK);
			do{
			roll();
			} while (getValue() >= 5);
		} else{
			setType(Type.NORMAL);
			roll();
		}
	}
	
	public String toString(){
		/*
		 * �Ϲ� �ֻ����ʹ� ������ �� �� �ֵ��� toString �޼ҵ带 override�Ͽ����ϴ�.
		 */
		return "This dice is a FraudDice with " + typeToString(getType()) +  " type and value of " +  getValue();
	}
	
}
