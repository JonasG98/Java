package pbox;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoxTest {

	@Test
	void testGetHeight() {
		Box normal = new Box(5);		
		assertEquals(5, normal.getHeight(),0.001);
	}

	@Test
	void testGetWidth() {
		Box normal = new Box(5);
		assertEquals(5, normal.getWidth(),0.001);
	}

	@Test
	void testGetLength() {
		Box normal = new Box(5);
		assertEquals(5, normal.getLength(),0.001);
	}

	@Test
	void testSetHeight() {
		Box normal = new Box(5);
		normal.setHeight(10);
		assertEquals(10, normal.getHeight(),0.001);
	}

	@Test
	void testSetWidth() {
		Box normal = new Box(5);
		normal.setWidth(10);
		assertEquals(10, normal.getWidth(),0.001);
	}

	@Test
	void testSetLength() {
		Box normal = new Box(5);
		normal.setLength(10);
		assertEquals(10, normal.getLength(),0.001);
	}

	@Test
	void testCalcVolume() {
		Box normal = new Box(5);
		assertEquals(125, normal.calcVolume());
	}

	@Test
	void testCalcSurfaceArea() {
		Box normal = new Box(5);
		assertEquals(150,normal.calcSurfaceArea());
	}

	@Test
	void testToString() {
		Box normal = new Box(5);
		assertEquals("the height is 5.0 the width is 5.0 the length is 5.0 this means the Volume is 125.0 and the surface area is 150.0", normal.toString());
	}
	@Test
	void testCalcVolume1() {
		Box normal = new Box(5, 7);
		assertEquals(175,normal.calcVolume());
	}
	@Test
	void testCalcVolume2() {
		Box normal = new Box(5, 7, 10);
		assertEquals(350,normal.calcVolume());
	}
	@Test
	void testCalcSurfaceArea1() {
		Box normal = new Box(5, 7);
		assertEquals(190,normal.calcSurfaceArea());
	}
	@Test
	void testCalcSurfaceArea2() {
		Box normal = new Box(5, 7, 10);
		assertEquals(310,normal.calcSurfaceArea());
	}
	@Test
	void testToString1() {
		Box normal = new Box(5, 7);
		assertEquals("the height is 7.0 the width is 5.0 the length is 5.0 this means the Volume is 175.0 and the surface area is 190.0", normal.toString());
	}
	@Test
	void testToString2() {
		Box normal = new Box(5, 7, 10);
		assertEquals("the height is 5.0 the width is 7.0 the length is 10.0 this means the Volume is 350.0 and the surface area is 310.0", normal.toString());
	}


}
