package qa.pags;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newtest {

	@BeforeSuite
	public void add()
	{
		System.out.println("print siute");
	}
	@BeforeTest
public void sum()
{
		System.out.println("print test");
		
}
	@BeforeClass
	public void mul()
	{
		System.out.println("print mul");
		
	}
	@BeforeMethod
	public void all()
	{
		System.out.println("print before method");
	}
	@Test
	public void alltest()
	{
		System.out.println("my test case 1");
	}
@AfterMethod
public void closemetod()
{
	System.out.println("cloo");
}
@AfterClass
public void closeroo()
{
	System.out.println(("wewewe"));
}
}

