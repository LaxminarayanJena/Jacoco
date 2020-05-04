package unitTests;

import org.testng.annotations.Test;

import compare.CompareString;

public class TestCodeCoverage {
	
	@Test
	public void positiveTest()
	{
		CompareString obj1 = new CompareString();
		obj1.containsorNot("AutomationTesters");
		
	}
	
	@Test
	public void secondTest()
	{
		CompareString obj1 = new CompareString();
		obj1.containsorNot("jenkins");
		
	}

}
