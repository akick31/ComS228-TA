package Recitation1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * This is a JUnit test for the HelloWorld.java program in order to demonstrate JUnits. Please note that assertEquals is not the only way 
 * to compare things, there are multiple ways, this was just the simplest way to demonstrate this.
 * @author Andrew Kicklighter
 *
 */

public class HelloWorldTest {
	
	/**Runs once before the entire test fixture. If your test class has ten tests, this will be only executed once
	 */
	@BeforeClass
	public static void setup() {
		System.out.println("Hello there!\n");
	}

	/**Executed before each test. If your test class has ten tests, this will be executed 10 times. Notice how it's executed after every test case
	 */
	@Before
	public void init() {
		System.out.println("Welcome!");
	}
	
	/**Test cases
	 */
	@Test
	public void test() {
		String answer = "Hello World"; //You can define a string
		System.out.println("Testing....");
		assertEquals(HelloWorld.hello, answer);
		System.out.println("Correct!");
	}
	
	@Test
	public void test2() {
		System.out.println("Testing....");
		assertNotEquals(HelloWorld.hello, "hello"); //Or just insert a string into the comparison
		System.out.println("Correct!");
	}
	
	@Test
	public void test3() { //Purposefully incorrect
		System.out.println("Testing....");
		assertEquals(HelloWorld.hello, "Hello!"); //Or just insert a string into the comparison
		System.out.println("Correct!");
	}
	
	/**Same as before, just after each case
	 * 
	 */
	@After
	public void shutDown() {
		System.out.println("Test done!\n");	}
	
	/**Same as beforeClass, just after the tests
	 * 
	 */
	@AfterClass
	public static void shutDownJUnit() {
		System.out.println("All tests done! Testing complete!");
	}

}
