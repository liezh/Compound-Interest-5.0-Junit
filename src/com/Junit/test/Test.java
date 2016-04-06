package com.Junit.test;

import static org.junit.Assert.*;
import interest.BestProject;
import interest.CompoundInterrest;
import interest.InterestTime;
import interest.PeriodicIncome;
import interest.Principal;
import interest.Refund;
import interest.SingleInterest;
import interest.showError;

public class Test {

	@org.junit.Test
	public void testCompoundInterrest() {
		double f = new CompoundInterrest(1,"0.05","100.0","1","1").Interrest(new showError() {
			@Override
			public void scanerError() {			}
			@Override
			public void havaString() {		}
		});
		assertEquals(105.0,f ,0.001);
		assertTrue("���Ϊ����", f > 0);
		double s = new CompoundInterrest(1,"-0.05", "-100.0", "1", "1").Interrest(new showError() {
			
			@Override
			public void scanerError() {		}
			@Override
			public void havaString() {		}
		});
		assertFalse("����Ϊ���������Ϊ����",s < 0);
	}
	
	
	@org.junit.Test
	public void testSingleInterest() {
		double f = new SingleInterest(1,"0.05","100.0","1").Interest(new showError() {
			@Override
			public void scanerError() {
			}
			@Override
			public void havaString() {
			}
		});
		assertEquals(105.0, f, 0.001);
		assertTrue("���Ϊ����", f > 0);
		double s = new SingleInterest(1,"-0.05","-100.0","1").Interest(new showError() {
			
			@Override
			public void scanerError() {		}
			@Override
			public void havaString() {		}
		});
		assertFalse("����Ϊ���������Ϊ����",s < 0);
	}
	
	
	@org.junit.Test
	public void testInterestTime() {
		double t = new InterestTime(1,"0.05","100.0","105.0","1").Interrest(new showError() {
			@Override
			public void scanerError() {		}
			@Override
			public void havaString() {		}
		});
		assertEquals(1, t, 0.001);
		assertTrue("���Ϊ����", t > 0);
		double s = new InterestTime(1,"-0.05","-100.0","105.0","1").Interrest(new showError() {
			@Override
			public void scanerError() {		}
			@Override
			public void havaString() {		}
		});
		assertFalse("����Ϊ���������Ϊ����",s < 0);
	}
	
	
	@org.junit.Test
	public void testPeriodicIncome() {
		double f = new PeriodicIncome(1,"0.01","100","1").Interrest(new showError() {
			
			@Override
			public void scanerError() {		}
			@Override
			public void havaString() {		}
		});
		assertEquals(101.0, f ,0.001);
		assertTrue("���Ϊ����", f > 0);
		double s = new PeriodicIncome(1,"-0.01","-100","1").Interrest(new showError() {
			
			@Override
			public void scanerError() {		}
			
			@Override
			public void havaString() {			}
		});
		assertFalse("����Ϊ���������Ϊ����",s < 0);
	}
	
	
	@org.junit.Test
	public void testPrincipal () {
		double f = new Principal(1,"0.05","105.0","1","1").Interrest(new showError() {
			@Override
			public void scanerError() {		}
			@Override
			public void havaString() {		}
		});
		assertEquals(100.0, f, 0.001);
		assertTrue("���Ϊ����", f > 0);
		double s = new Principal(1,"-0.05","-105.0","1","1").Interrest(new showError() {
			@Override
			public void scanerError() {		}
			@Override
			public void havaString() {		}
		});
		assertFalse("����Ϊ���������Ϊ����",s < 0);
	}
	
	
	@org.junit.Test
	public void testBestProject () {
		double f = new BestProject(1,"200","100","1","1").Interrest(new showError() {
			@Override
			public void scanerError(){			}
			@Override
			public void havaString() {		}
		});
		assertEquals(1.0, f, 0.001);
		assertTrue("���Ϊ����", f > 0);
		double s = new BestProject(1,"-200","100","1","1").Interrest(new showError() {
			@Override
			public void scanerError() {		}
			@Override
			public void havaString() {		}
		});
		assertFalse("����Ϊ���������Ϊ����", s < 0);
	}
	
	
	@org.junit.Test
	public void testRefund () {
		double f = new Refund(1,"0.87","1200","3").Interrest(new showError() {
			@Override
			public void scanerError() {		}
			@Override
			public void havaString() {		}
		});
		assertEquals(94.6147, f ,0.001);
		assertTrue("���Ϊ����", f > 0);
		double s = new Refund(1,"-0.87","-1200","3").Interrest(new showError() {
			@Override
			public void scanerError() {			}	
			@Override
			public void havaString() {			}
		});
		assertFalse("����Ϊ���������Ϊ����",s < 0);
	}

}
