package Package2;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import Package1.BasePage;
import Package1.HomePageObject;

public class HomePageTest {

HomePageObject hp;
BasePage bp;

public HomePageTest() {
	hp= new HomePageObject();
	bp= new BasePage();
	
}

@Test 
public void verifyvisibility1()
{
	Assert.assertTrue(hp.checkingwomenvisibility().isDisplayed());
}

@Test 
public void verifyvisibility2()
{
	Assert.assertTrue(hp.elementFound(hp.Dresstitle));

}

@Test
public void verifyvisibility3()
{
	Assert.assertTrue(hp.elementFound(hp.Tshirttitle));
}

@Test
public void womennavcheck() {
	Assert.assertEquals(hp.checkwomennav,hp.womennav());
}

@Test
public void dressnavcheck()
{
	Assert.assertEquals(hp.checkdressnav,hp.dressnav());
}

@Test
public void tshirtnavcheck()
{
	Assert.assertEquals(hp.checktshirtnav,hp.tshirtnav());
}

@Test
public void sucalertmsgtest()
{
Assert.assertEquals(hp.successalert, hp.successalertmsg());
}

}
