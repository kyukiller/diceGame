package Dices;
import java.util.Random;



public class Dice {	
	protected enum Type{
		NONE, NORMAL,STRONG, WEAK;
	}
	private int value;
	private Type type = Type.NONE;
	
	/**
	 * �Ϲ����� �ֻ����� ������ ������ ���� ������ �ֱ����� �����ϴ�.
	 */
	public Dice(){
		roll();
	}
	
	/*
	 * 1~6 ������ ������ ������ ������ �ֻ����� value�� �� ���� �����մϴ�.
	 */
	public void roll() {
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
	
	/*
	 * �ֻ����� ���¸� enum������ Type�� �޾Ƽ� String���� ��ȯ���ִ� �޼ҵ��Դϴ�.
	 * 
	 * @param Type thisType enum���� �ۼ��� Type�� �� �ϳ��� �޽��ϴ�.
	 */
	public String toString(){
		return "This dice is a normal dice with " + typeToString(getType()) +  " type and value of " +  value;
	}
	
	public static String typeToString(Type thisType){
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
