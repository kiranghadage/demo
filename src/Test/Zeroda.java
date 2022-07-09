package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Zeroda {
	
	@Test(priority=1,timeOut=1000)
	public void test1() throws InterruptedException
	{
		Thread.sleep(0);
		System.out.println("test1 is executed");
	}
	
	@Test(enabled=false)
	public void test2()
	{
		System.out.println("test2 is executed");
	}
	
	@Test(priority=2,invocationCount=3)
	public void teste()
	{
		System.out.println("teste is executed");
	}
	
	@Test(dependsOnMethods=("test1"))
	public void testm()
	{
		System.out.println("testm is executed");
	}

	@BeforeClass
	public void beforeclass()
	{
		System.out.println("beforeclass is executed");
	}
	

	@AfterClass
	public void afterclass()
	{
		System.out.println("afterclass is executed");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("beforemethod is executed");
	}

	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod is executed");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest is executed");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("aftertest is executed");
	}
}
