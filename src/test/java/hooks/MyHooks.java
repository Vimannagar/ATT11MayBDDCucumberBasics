package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class MyHooks {
	
	
//	@After(order = 2)
//	public void afterHook1() {
//		System.out.println("After hook1 is executing");
//	}
	
	@Before("@sanity")
	public void beforeHook1()
	{
		System.out.println("Before hook1 is executing");
	}
	
//	@Before(order = -1)
//	public void beforeHook2()
//	{
//		System.out.println("Before hook2 is executing");
//	}
	
	@After("@functional")
	public void afterHook2() {
		System.out.println("After hook2 is executing");
	}
	
	
	@BeforeStep
	public void beforeStep()
	{
		System.out.println("Before step is executing");
	}
	
	@AfterStep
	public void afterStep()
	{
		System.out.println("After step is executing");
	}
	
	
	@BeforeAll(order = 2)
	public static void beforeAll()
	{
		System.out.println("Before all is executing");
	}
	
	@BeforeAll(order = 1)
	public static void beforeAll2()
	{
		System.out.println("Before all is executing");
	}
	
	@AfterAll
	public static void afterAll()
	{
		System.out.println("After all is executing");
	}

	
}
