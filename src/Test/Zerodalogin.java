package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import org.testng.annotations.Test;

public class Zerodalogin {

	@Test(priority=1,timeOut=1000)
	public void testp() throws InterruptedException
	{
		Thread.sleep(0);
		System.out.println("testp is executed");
	}
	
	@Test(enabled=false)
	public void test2()
	{
		System.out.println("test2 is executed");
	}
	@Test()
	public void testo()
	{
		System.out.println("testo is executed");
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
	
	
	
}
