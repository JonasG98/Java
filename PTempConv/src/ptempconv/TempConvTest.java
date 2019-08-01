package ptempconv;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TempConvTest {

	@Test
	void testGetCel() {
		TempConv test = new TempConv(20);
		assertEquals(20, test.getCel());
	}

	@Test
	void testGetFah() {
		TempConv test = new TempConv(20);
		assertEquals(68.0, test.getFah());
	}

	@Test
	void testGetKel() {
		TempConv test = new TempConv(20);
		assertEquals(293.15, test.getKel());
	}

	@Test
	void testSetCel() {
		TempConv test = new TempConv(20);
		test.setCel(17);
		assertEquals(17, test.getCel());
	}

	@Test
	void testSetFah() {
		TempConv test = new TempConv(20);
		test.setFah(66);
		assertEquals(66, test.getFah());
	}

	@Test
	void testSetKel() {
		TempConv test = new TempConv(20);
		test.setKel(0);
		assertEquals(0, test.getKel());
	}

	@Test
	void testToString() {
		TempConv test = new TempConv(20);
		assertEquals("Celcius is 20 Fahrenheit is 68 Kelvin is 293.15", test.toString());
	}
	@Test
	void testToString1() {
		TempConv test = new TempConv(17);
		assertEquals("Celcius is 17 Fahrenheit is 62.6 Kelvin is 290.15", test.toString());
	}
	@Test
	void testToString2() {
		TempConv test = new TempConv(0);
		test.setKel(0);
		assertEquals("Celcius is -273.15 Fahrenheit is -459.67 Kelvin is 0", test.toString());
	}
	@Test
	void testToString3() {
		TempConv test = new TempConv(0);
		test.setFah(0);
		assertEquals("Celcius is -17.78 Fahrenheit is 0 Kelvin is 255.37", test.toString());
	}
	@Test
	void testToString4() {
		TempConv test = new TempConv(0);
		test.setKel(456);
		assertEquals("Celcius is 182.85 Fahrenheit is 361.13 Kelvin is 456", test.toString());
	}

}
