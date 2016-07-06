import Facillitators.Judge;
import Player.Player;
import junit.framework.TestCase;


public class FacillitatorsTest extends TestCase {
	/*Recorder classe's printed statements served as testcases themselves in the
	play method, so these tests focus on the Judge class.*/
	Player p1 = new Player();
	Player p2 = new Player();
	Judge j = new Judge(p1,p2);
		
	public void testSetRounds(){
		//see if rounds could be set manually.
		j.setRounds(8);
		assertEquals(j.getRounds(), 8);
	}
	
	
	
	
}
