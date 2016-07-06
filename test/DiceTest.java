
import Dices.Dice;
import Dices.FraudDice;
import junit.framework.TestCase;

public class DiceTest extends TestCase {
	int val;
	
	public void testRoll(){
		//test that the value of dice is an integer and between 1 and 6.
		Dice rolled = new Dice();
		rolled.roll();
		val = rolled.getValue();
		assertTrue((int)val == val && val >=1 && val <=6);
	}
	
	public void testGetValue() {
		//test that the normal dice works.
		Dice a = new Dice();
		val = a.getValue();
		assertTrue("Value is not between 1 and 6", val>=1 && val<=6);
	}
	
	
	public void testFraudDice(){
		//test that the FraudDice works in all situations.(also tests getType() method)
		FraudDice d = new FraudDice("losing");
		FraudDice e = new FraudDice("winning");
		FraudDice f = new FraudDice("other");
		
		val = d.getValue();
		assertEquals("[STRONG]", d.getType());
		assertTrue("While losing, the FraudDice should return value above 2", val>2);
		
		val = e.getValue();
		assertEquals("[WEAK]", e.getType());
		assertTrue("While winning, the FraudDice should return value under 5", val<5);
		
		val = f.getValue();
		assertEquals("[NORMAL]", f.getType());
		assertTrue("On other situations, the dice should be a normal dice", val>=1 && val<=6);
	}
	
}

