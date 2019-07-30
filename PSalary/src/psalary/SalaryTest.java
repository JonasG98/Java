package psalary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SalaryTest {

	@Test
	void testGetGross() {
		Salary test = new Salary(0);		
		assertEquals(0, test.getGross(),0.001);
	}

	@Test
	void testSetGross() {
		Salary test = new Salary(0);
		test.setGross(100000);
		assertEquals(100000, test.getGross(),0.001);
	}

	@Test
	void testGetTax() {
		Salary test = new Salary(0);
		test.setGross(100000);
		test.getTax();
		assertEquals(76080, test.getGross(),0.001);
	}
	@Test
	void testGetTax1() {
		Salary test = new Salary(0);
		test.setGross(50000);
		test.getTax();
		assertEquals(41980, test.getGross(),0.001);
	}
	@Test
	void testGetTax2() {
		Salary test = new Salary(0);
		test.setGross(30000);
		test.getTax();
		assertEquals(25730, test.getGross(),0.001);
	}
	@Test
	void testGetTax3() {
		Salary test = new Salary(0);
		test.setGross(10000);
		test.getTax();
		assertEquals(8950, test.getGross(),0.001);
	}
	@Test
	void testGetTax4() {
		Salary test = new Salary(0);
		test.setGross(0);
		test.getTax();
		assertEquals(0, test.getGross(),0.001);
	}
	@Test
	void testGetTax5() {
		Salary test = new Salary(0);
		test.setGross(48001);
		test.getTax();
		assertEquals(40580.7, test.getGross(),0.001);
	}
	@Test
	void testGetTax6() {
		Salary test = new Salary(0);
		test.setGross(70001);
		test.getTax();
		assertEquals(55980.67, test.getGross(),0.001);
	}
	@Test
	void testGetTax7() {
		Salary test = new Salary(0);
		test.setGross(-1000);
		test.getTax();
		assertEquals(-1000, test.getGross(),0.001);
	}


	@Test
	void testGetNet() {
		Salary test = new Salary(0);
		test.getNet();
		assertEquals(0, test.getGross(),0.001);
	}
	@Test
    public void dalesTestSuiteForTax()
    {
	//the instructor's test suite for tax
	Salary money = new Salary(120000.50);
	assertEquals(30520.17, money.getTax(),0.01);
	money.setGross(52112);
	assertEquals(8653.6, money.getTax(),0.01);
	money.setGross(44567);
	assertEquals(6819.23, money.getTax(),0.01);
	money.setGross(7623);
	assertEquals(800.42, money.getTax(),0.01);
	//a couple more tests
	//these would normally be in separate methods
	//test the net
	assertEquals(6822.59, money.getNet(),0.01);
	//test a negative
	money.setGross(-50);
	assertEquals(0, money.getTax(),0.01);
    }

}
