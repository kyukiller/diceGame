import Dices.Dice;
import Player.Player;
import Player.FraudPlayer;
import junit.framework.TestCase;


public class PlayerTest extends TestCase {
	
	public void testPlayer(){
		int score;
		//test player constructors
		Player a = new Player();
		FraudPlayer b = new FraudPlayer();
		
		score = a.getScore();
		
		//check if the starting score is set at 0, and if getScore() is working.
		assertEquals(0, score);
		
		//check the correct dice is assigned to each player.
		assertEquals(Dice.typeToString(a.getDice().getType()), "");
		assertEquals(Dice.typeToString(b.getDice().getType()), "NORMAL");
	}
	
}
