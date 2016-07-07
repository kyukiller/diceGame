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
		 * �Ϲ����� �ֻ����� ������ ������ ���� ������ �ֱ����� �����ϴ�.
		 */
		roll();
	}
	
	public void roll() {
		/*
		 * 1~6 ������ ������ ������ ������ �ֻ����� value�� �� ���� �����մϴ�.
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
		 * �ֻ����� ���¸� enum������ Type�� �޾Ƽ� String���� ��ȯ���ִ� �޼ҵ��Դϴ�.
		 * 
		 * @param Type thisType enum���� �ۼ��� Type�� �� �ϳ��� �޽��ϴ�.
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
