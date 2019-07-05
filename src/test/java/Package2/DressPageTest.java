package Package2;

import org.testng.Assert;
import org.testng.annotations.Test;

import Package1.BasePage;
import Package1.DressPageObject;

public class DressPageTest {

	DressPageObject dp;
	BasePage bp;

	public DressPageTest() {
		dp = new DressPageObject();
		bp = new BasePage();
	}

	@Test
	public void sizevisibilitycheck() {
		Assert.assertTrue(dp.elementFound(dp.sizevisiblility()));
	}

	@Test
	public void checkaddandcart()
	{
	
}
}
