import junit.framework.Test;
import junit.framework.TestSuite;


public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(DiceTest.class);
		suite.addTestSuite(FacillitatorsTest.class);
		suite.addTestSuite(PlayerTest.class);
		//$JUnit-END$
		return suite;
	}

}
