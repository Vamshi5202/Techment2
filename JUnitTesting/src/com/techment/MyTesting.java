package com.techment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyTesting {
	
	Calculation calculation=new Calculation();

	@Before
	void test10() {
		assertTrue(true);
		System.out.println("before test");

	}
	@BeforeAll
	 void test11() {
		 assertTrue(true);
		 System.out.println("before all");

	 }
	
	
	@Test
	void test() {
		assertEquals(5, calculation.add(2,3));
		System.out.println("test");
	}
	
	@Test
	void test2() {
		assertNotEquals(6, calculation.add(2, 4));
		System.out.println("test2");
	}
	@Test
	void test3() {
		assertEquals("eligible", calculation.checkEligibility(19));
		System.out.println("3");
	}
  @Test
	void test4() {
		assertThrows(ArithmeticException.class, ()-> {
			int a=1;
			int b=0;
			System.out.println(a/b);
		});
		
		System.out.println("4");
	}
  @Test
  void test5() {
	  
	  assertThrows(IllegalArgumentException.class, ()->{
		  Integer.parseInt("1");
	  });
  }
  @Test
  void test6() {
	  assertThrows(IllegalArgumentException.class, ()->{
		  Integer.parseInt("a");
	  });
  }
  
  @AfterEach
  void test12() {
	  assertTrue(true);
	  System.out.println("after each");
  }
  @BeforeEach
  void test13() {
	  assertTrue(true);
	  System.out.println("before each");
  }
 
}
