// Name: Johar Samrao
// ID: 180
// Assignment 1
// Simple List Test

package assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleListTest {
	
	@Test
	public void testAdd() {
		SimpleList list = new SimpleList();
		list.add(5);
		list.add(8);
		list.add(3);
		list.add(6);
		list.add(7);
		list.add(1);
		list.add(2);
		list.add(69);
		list.add(18);
		list.add(68);
		list.add(16);

		assertEquals("16 68 18 69 2 1 7 6 3 8 5", list.toString());
	}
	
	@Test
	public void testSearch() {
		SimpleList list = new SimpleList();
		list.add(5);
		list.add(8);
		list.add(1);
		
		assertEquals(3, list.search(5));
		assertEquals(-1, list.search(10));
	}
	
	@Test
	public void testCount() {
		SimpleList list = new SimpleList();
		list.add(5);
		list.add(3);
		list.add(18);
		list.add(86);
		list.add(6);
		
		assertEquals(5, list.count());
	}
	
	@Test
	public void testRemove() {
		SimpleList list = new SimpleList();
		list.add(5);
		list.add(3);
		list.add(6);

		list.remove(6);
		list.remove(3);
		assertEquals("5", list.toString());
	}
	
	@Test
	public void testAppend() {
		SimpleList list = new SimpleList();
		list.add(5);
		list.add(3);
		list.add(6);

		list.append(25);
		list.append(15);
		assertEquals("6 3 5 25 15", list.toString());
	}
	
	@Test
	public void testFirst() {
		SimpleList list = new SimpleList();
		list.add(5);
		list.add(3);
		list.add(6);

		assertEquals(6, list.first());
	}
	
	@Test
	public void testLast() {
		SimpleList list = new SimpleList();
		list.add(5);
		list.add(3);
		list.add(6);
		
		assertEquals(5, list.last());
	}
	
	@Test
	public void testSize() {
		SimpleList list = new SimpleList();
		list.add(5);
		list.add(8);
		list.add(3);
		list.add(6);
		list.add(7);
		list.add(1);
		list.add(2);
		list.add(69);
		list.add(18);
		list.add(68);
		list.add(16);
		assertEquals(15, list.size());
	}
	
}
