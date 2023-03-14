package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Testmycontactform {
  @Test(dataProvider = "dp")
  
  
  public void testcase(Integer n, String s) {
	  System.out.println("Test is successfull");
  }

	@Test(timeOut = 3000, description = "i want to with invalid details", invocationCount = 10)

	public void testcaseinvalid() throws InterruptedException {
		System.out.println("Negative scenaorio");
		Thread.sleep(4000);
	}
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Launch URL nd valid login");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Logout");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] { 3, "a" },
      new Object[] { 4, "b" },
      new Object[] {5 , "a" },
      new Object[] {6 , "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("setting database connection for getting test data");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("close connection and genderate reports");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("open the browser");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("close the browser");
  }

}
