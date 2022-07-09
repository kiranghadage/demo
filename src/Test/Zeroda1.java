package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Zeroda1 {
	
	@Test()
	@Parameters({"c"})
	public void test2(String b)
	{
		System.out.println(b);
	}
	@Test()
	@Parameters({"a","b"})
	public void testo(int a,int v)
	{
		System.out.println(a+v);
	}
	

}
