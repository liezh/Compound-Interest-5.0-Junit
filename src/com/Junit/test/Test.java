package com.Junit.test;

import static org.junit.Assert.*;
import interest.BestProject;
import interest.CompoundInterrest;
import interest.InterestTime;
import interest.PeriodicIncome;
import interest.Principal;
import interest.Refund;
import interest.SingleInterest;

public class Test {

	@org.junit.Test
	public void testCompoundInterrest() {
		double f = new CompoundInterrest("0.05","100.0","1","1").Interrest();
		assertEquals(105, (int)f);
	}
	@org.junit.Test
	public void testSingleInterest() {
		double f = new SingleInterest("0.05","100.0","1").Interest();
		assertEquals(105, (int)f);
	}
	@org.junit.Test
	public void testInterestTime() {
		int t = new InterestTime("0.05","100.0","105.0","1").Interrest();
		assertEquals(1, t);
	}
	@org.junit.Test
	public void testPeriodicIncome() {
		double f = new PeriodicIncome("0.01","100","1").Interrest();
		assertEquals(101, (int)f);
	}
	@org.junit.Test
	public void testPrincipal () {
		double f = new Principal("0.05","105.0","1","1").Interrest();
		assertEquals(100, (int)f);
	}
	@org.junit.Test
	public void testBestProject () {
		double f = new BestProject("200","100","1","1").Interrest();

		assertEquals(1, (int)f);
	}
	@org.junit.Test
	public void testRefund () {
		double f = new Refund("0.87","1200","3").Interrest();
//		System.out.print((int)f);
		assertEquals(94, (int)f);
	}

}
