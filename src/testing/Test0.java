package testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test0 {
	
	@Test
	public void demo()
	{
		Reporter.log("Hello Selenium",true);
		Reporter.log("Hello Java",false);
	}

}
