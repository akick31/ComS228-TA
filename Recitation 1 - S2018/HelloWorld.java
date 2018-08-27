package Recitation1;

/**
 * Program used to demonstrate JUnit Tests for ComS228
 * @author Andrew Kicklighter
 *
 */

public class HelloWorld {
	public static String hello = "Hello World"; //Note: JUnit can only access global variables, 
										//if I were to put "hello" into the main, it would be unable to access
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(hello);
		}
	}

}
