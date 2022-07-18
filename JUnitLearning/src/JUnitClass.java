import org.junit.Test;
//import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

//import org.junit.After;
//import org.junit.Before;



public class JUnitClass {
	
    @Test
	public void junitMethod() {
		System.out.println("Executing JUnit test case");
		String name = "vinay singh chouhan";
		assertEquals("Vinay singh chouhan",name);
		//assertEquals(expectedOutput, ActualOutput);
	}
	

}
