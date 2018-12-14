package demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;


class CalculationTest {
	
	Calculation c=new Calculation();

	@Test
	public void testAdd() {
		assertEquals(30, c.add(10,20));
	}

	@Test
	public void testSub() {
		assertEquals(10, c.sub(20,10));
	}

	@Test
	public void testMul() {
		assertEquals(100, c.mul(50,2));
	}
	@Before
	@Test
	public void div()
	{
		System.out.println("can do intialization");
	}
	@After
	@Test
	public void mod()
	{
		System.out.println("cleanup task");
	}
	@BeforeClass
	@Test
	public void braces()
	{
		System.out.println("executes task");
	}
	@AfterClass
	@Test
	public void brackets()
	{
		System.out.println("executes cleanup");
	}
	@Ignore
	@Test
	public void sum()
	{
		System.out.println("ignores test method");
	}
	
}
