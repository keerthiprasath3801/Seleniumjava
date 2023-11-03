package parasoft;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hookclass {
	
	@Before
	public static void setUp() {
		HelperClass.setUpDriver();
	}
	
	@After
	public static void  tearDown() {
		HelperClass.tearDown();
	}

}