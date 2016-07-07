package Dices;
import java.util.Random;



public class Dice {
	
	protected enum Type{
		NONE, NORMAL,STRONG, WEAK;
	}
	private int value;
	Type type = Type.NONE;
	
	public Dice(){
		/**
		 * 일반적인 주사위를 만든후 무작위 값을 설정해 주기위해 굴립니다.
		 */
		roll();
	}
	
	public void roll() {
		/*
		 * 1~6 사이의 무작위 정수를 만든후 주사위의 value에 그 값을 대입합니다.
		 */
		
		Random RandInt = new Random();
		value = 1 + RandInt.nextInt(6);
	}
	
	public int getValue() {
		return value;
	}
	
	public Type getType() {
		return type;
	}
	
	public void setType(Type settedType) {
		this.type = settedType;
	}

	public String toString(){
		//toString method to check dice.
		return "This dice is a normal dice with " + typeToString(getType()) +  " type and value of " +  value;
	}
	
	public static String typeToString(Type thisType){
		/*
		 * 주사위의 상태를 enum형식인 Type를 받아서 String으로 변환해주는 메소드입니다.
		 * 
		 * @param Type thisType enum으로 작성한 Type들 중 하나를 받습니다.
		 */
		
		String returnedString = "";
		switch (thisType){
		case NONE:
			break;		
		case NORMAL:
			returnedString = "NORMAL";
			break;
		case STRONG:
			returnedString = "STRONG";
			break;
		case WEAK:
			returnedString = "WEAK";
			break;
		}
		return returnedString;
	}
	
}
