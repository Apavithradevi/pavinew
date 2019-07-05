package Package1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject extends BasePage{
@FindBy(xpath="//a[@title='Women']")
public WebElement Womentitle;

@FindBy(xpath="(//a[@title='Dresses'])[2]")
public WebElement Dresstitle;

@FindBy(xpath="(//a[@title='T-shirts'])[2]")
public WebElement Tshirttitle;

@FindBy(xpath="//h2[@class='title_block']")
public WebElement checkwomennav;

@FindBy(xpath="//h2[@class='title_block']")
public WebElement checkdressnav;

@FindBy(xpath="//span[@class='category-name']")
public WebElement checktshirtnav;

@FindBy(xpath="(//ul[@class='col-lg-12 layered_filter_ul'])[1]")
public WebElement sizedisplay;

@FindBy(xpath="(//input[@type='text'])[2]")
public WebElement emailtxtbox;

@FindBy(xpath="(//button[@type='submit'])[2]")
public WebElement emailbtn;

@FindBy(xpath="//p[@class='alert alert-success']")
public WebElement successalert;



public HomePageObject()
{
	PageFactory.initElements(driver,this);
}

public WebElement checkingwomenvisibility()
{
	return Womentitle;
}

public WebElement checkingdressvisibility()
{
	return Dresstitle;
}

public WebElement checkingtshirtvisibility()
{
	return Tshirttitle;
}

public WebElement womennav() {
	Womentitle.click();
	return checkwomennav;
}

public WebElement dressnav() {
	Dresstitle.click();
	return checkdressnav;

}

public WebElement tshirtnav() {
	Tshirttitle.click();
	return checktshirtnav;
}

public void emailsub()
{
	emailtxtbox.sendKeys("fungames@gmail.com");
	emailbtn.click();
}


public WebElement successalertmsg()
{
	
	return successalert;
}

}
