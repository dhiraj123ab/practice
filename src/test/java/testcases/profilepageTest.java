package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import pages.profilepage;

public class profilepageTest extends TestBase
{
	profilepage profile;
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException
	{
		initialization();
		profile = new profilepage();	
		profile.login();
	}
	
	@Test
	public void inpprofilepagenameTest() throws IOException, InterruptedException
	{
		profile.login();
		profile.inpprofilepagename();
	}
	
	@Test
	public void inpprofilepagephonenumberTest() throws IOException
	{
		profile.inpprofilepagephonenumber();
	}
	
	@Test
	public void inpprofilepageEmailIdTest() throws IOException
	{
		profile.inpprofilepageEmailId();
	}
	
	@Test
	public void inpprofilepageGenderTest()
	{
		profile.inpprofilepageGender();
	}
	
	@Test
	public void inpprofilepagecityTest()
	{
		profile.inpprofilepagecity();
	}
	
	@Test
	public void inpprofilepageavatarTest()
	{
		profile.inpprofilepageavatar();
	}
	
	@Test
	public void inpprofilepagesavebtnTest()
	{
		profile.inpprofilepagesavebtn();
	}
	
	@Test
	public void inpprofilepagegradeTest()
	{
		profile.inpprofilepagegrade();
	}
	
	@Test
	public void verifyWelcomemsgTest()
	{
		String msg = profile.verifyWelcomemsg();
		Assert.assertEquals(msg, "Welcome Dhiraj");
	}

	@AfterMethod
	public void exit()
	{
		driver.close();
	}
	
}
