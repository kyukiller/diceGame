package Dices;

public class FraudDice extends Dice{
	
	public FraudDice(String status){
		/*
		 * 주사위의 상태를 받아서 그에 상응하는 주사위를 굴립니다.
		 * 
		 * @param String status 선수가 지고 있는지, 이기고 있는지의 상태를 나타내주는 String을 받습니다.
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
		 * 일반 주사위와는 구분을 할 수 있도록 toString 메소드를 override하였습니다.
		 */
		return "This dice is a FraudDice with " + typeToString(getType()) +  " type and value of " +  getValue();
	}
	
}
