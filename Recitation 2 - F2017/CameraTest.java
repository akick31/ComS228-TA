package equalsMethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class CameraTest {
	private Camera cam1 = new Camera(2500, 15, "Samsung");
	private Camera cam2 = new Camera(2500, 15, "Canon");
	private Camera cam3 = new Camera(2500, 15, "Canon");
	private Camera camNull = null;
	private int[] camNot = new int[50];
	
	@Test
	public void testNullObject(){
		//Check that cam 1 and null cam aren't equal
		assertFalse(cam1.equals(camNull));
	}
	
	@Test
	public void testEqualObjects(){
		//Check 2 equal objects are in fact equal
		assertTrue(cam2.equals(cam3));
	}
	
	@Test
	public void testDifferingObjects(){
		//Check that cam 1 and cam 2 aren't equal
		assertFalse(cam2.equals(cam1));
	}
	
	@Test
	public void testCamNot(){
		//Check that cam 2 and an array aren't equal
		assertFalse(cam2.equals(camNot));
	}

}

