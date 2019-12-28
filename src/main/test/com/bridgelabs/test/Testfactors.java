package com.bridgelabs.test;
import junittest.Testunit;
import static org.junit.Assert.*;

import junit.framework.Assert;
import org.junit.Test;

public class Testfactors {

	@Test
	public void test() {
		
		int actual = Testunit.factors(6);
		assertEquals(720,actual);
	}
	
	@Test
	public void test1() {
		double actual = Testunit.harmonic(6);
		assertEquals(1.283,actual, 0.001);
	}
	
	@Test
	public void test2() {
		
		int actual = Testunit.power2(10);
		assertEquals(1024,actual);
	}
	
	@Test
	public void test3() {
		
		boolean actual = Testunit.leapYear(2020);
		assertEquals(true,actual);
	}
}
