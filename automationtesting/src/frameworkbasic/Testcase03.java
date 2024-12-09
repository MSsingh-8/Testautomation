package frameworkbasic;

import org.testng.annotations.Test;

public class Testcase03 extends GenericScript01
{
	@Test
	public void title()
	{
		driver.getTitle();
		System.out.println();
	}

}
