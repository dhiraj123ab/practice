package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;

public class profilepage extends TestBase 
{
	@FindBy(xpath="(//input[@class='form-control'])[1]") private WebElement LoginpageEnterName;
	@FindBy(xpath="(//input[@class='form-control'])[2]") private WebElement LoginpageEnterMobNumber;
	@FindBy(xpath="(//button[@class='btn'])[1]") private WebElement LoginpageSendOTPBtn;
	//@FindBy(xpath="//input[@name='otp']") private WebElement LoginpageEnterOTP;
	@FindBy(xpath="//select[@name='state']") private WebElement LoginpageSelectState;
	@FindBy(xpath="(//button[@type='submit'])[1]") private WebElement LoginpageScheduleFreeClassBtn;
	@FindBy(xpath="(//img[@class='rounded-circle'])[1]") private WebElement avatar3;
	@FindBy(xpath="(//span[@class='font-14'])[1]") private WebElement myprofile;
	@FindBy(xpath="//input[@name='fullName']") private WebElement name;
	@FindBy(xpath="//input[@placeholder='Enter your mobile number']") private WebElement phonenumber;
	@FindBy(xpath="//input[@placeholder='Enter your e-mail']") private WebElement EmailId;
	@FindBy(xpath="//input[@name='date_of_birth']") private WebElement DateOfBirth;
	@FindBy(xpath="(//div[@class=' css-ackcql'])[2]") private WebElement Gender;
	@FindBy(xpath="(//div[@class=' css-ackcql'])[3]") private WebElement city;
	@FindBy(xpath="//img[@class='personalDetails_edit__27EUA']") private WebElement avatar1;
	@FindBy(xpath="(//img[@alt='profile icon'])[3]") private WebElement avatar2;
	@FindBy(xpath="//button[@class='sc-jmpzUR ksXRkC personalDetails_saveBtn__eJgK-']") private WebElement savebtn;
	@FindBy(xpath="(//div[@class=' css-ackcql'])[1]") private WebElement grade;
	@FindBy(xpath="//h3[text()='Dhiraj']") private WebElement Welcomemsg;
	
	public profilepage()
	{
		PageFactory.initElements(driver, this);
	}
	public void login() throws InterruptedException
	{
		LoginpageEnterName.sendKeys("Dhiraj");
		LoginpageEnterMobNumber.sendKeys("7709030547");
		LoginpageSendOTPBtn.click();
		//LoginpageEnterOTP
		Select s= new Select(LoginpageSelectState);
		s.selectByVisibleText("Maharashtra");
		LoginpageScheduleFreeClassBtn.click();
		Thread.sleep(3000);
		
	}
	
	
	public void inpprofilepagename() throws IOException
	{
		
		name.sendKeys(readpropertyfile("name"));
	}
	
	public void inpprofilepagephonenumber() throws IOException
	{
		phonenumber.sendKeys(readpropertyfile("PhoneNumber"));
	}
	
	public void inpprofilepageEmailId() throws IOException
	{
		EmailId.sendKeys(readpropertyfile("EmailId"));
	}
	
	public void inpprofilepageDateOfBirth() throws IOException
	{
		DateOfBirth.sendKeys(readpropertyfile("DateofBirth"));
	}
	
	public void inpprofilepageGender()
	{
		Select s= new Select(Gender);
		s.selectByIndex(0);
		
	}
	
	public void inpprofilepagecity()
	{
		Select s= new Select(city);
		s.selectByVisibleText("Nagpur");
	}
	
	public void inpprofilepageavatar()
	{
		avatar1.click();
		avatar2.click();
		
	}
	
	public void inpprofilepagesavebtn()
	{
		savebtn.click();
	}
	
	public void inpprofilepagegrade()
	{
		Select s= new Select(grade);
		s.selectByIndex(0);
	}
	public String verifyWelcomemsg()
	{
		return Welcomemsg.getText();
	}
	
	
}
