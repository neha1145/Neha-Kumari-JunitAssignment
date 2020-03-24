package com.epam.junit_assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveFirstTwoAA {
	/*
	 * 1.firstplacefor4char: ABCD=>BCD---success
	 * 2.bothplacefor4char: AACD=>CD---success
	 * 3.secondplacefor4char: BACD=>BCD---success
	 * 4.noplacefor4char: BBAA=>BBAA---success
	 * 5.bothplacefornchar: AABAA=>BAA---success
	 * 6.firstplacefor2char: AB=>B---success
	 * 7.secondplacefor2char: CA=>C---success
	 * 8.bothplacefor2char: AA=>""---success
	 * 9.noplacefor2char: CD=>CD---success
	 * 10.firstplacefor1char: A=>""---success
	 * 11.noplacefor1char: B=>B---success
	 * 12.emptystring: ""=>""---success
	 */
	RemoveFirst2AA removeFirst2AA=new RemoveFirst2AA();
	@Test
	void test4Charfirstplace() {
		assertEquals("BCD",removeFirst2AA.remove("ABCD"));
	}
	@Test
	void test4CharBothplace() {
		assertEquals("CD",removeFirst2AA.remove("AACD"));
	}
	@Test
	void test4CharSecondplace() {
		assertEquals("BCD",removeFirst2AA.remove("BACD"));
	}
	@Test
	void test4Charnoplace() {
		assertEquals("BBCD",removeFirst2AA.remove("BBCD"));
	}
	@Test
	void testnCharBothplace() {
		assertEquals("BAA",removeFirst2AA.remove("AABAA"));
	}
	@Test
	void test2CharFirstplace() {
		assertEquals("B",removeFirst2AA.remove("AB"));
	}
	@Test
	void test2CharSecondplace() {
		assertEquals("C",removeFirst2AA.remove("CA"));
	}
	@Test
	void test2CharBothplace() {
		assertEquals("",removeFirst2AA.remove("AA"));
	}
	@Test
	void test2Charnoplace() {
		assertEquals("CD",removeFirst2AA.remove("CD"));
	}
	@Test
	void test1CharFirstplace() {
		assertEquals("",removeFirst2AA.remove("A"));
	}
	@Test
	void test1CharNoplace() {
		assertEquals("B",removeFirst2AA.remove("B"));
	}
	@Test
	void testnoCharNoplace() {
		assertEquals("",removeFirst2AA.remove(""));
	}
}
