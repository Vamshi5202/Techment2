package com.techment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestLogic {
	
	Calculation1 calculation=new Calculation1();

	 @Test  
	    public void testFindMax(){  
	        assertEquals(4,calculation.findMax(new int[]{1,3,4,2}));  
	        assertEquals(-1,calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
	    }  
      
	 
      
	 @Test  
	    public void testCube(){  
	        System.out.println("test case cube");  
	        assertEquals(27,calculation.cube(3));  
	    }  
	 
	  @Test
	    public void testReverseWord(){  
	        System.out.println("test case reverse word");  
	        assertNotEquals("jk  lk",calculation.reverseWord("lk jk"));
	    }  
	  
	     @After  
	    public void tearDown()  {  
	    	 
	    	 assertTrue(true);
	        System.out.println("after");  
	    }  
	     
	     @AfterClass  
	     public static void tearDownAfterClass(){  
	    	 
	    	 assertTrue(true);
	         System.out.println("after class");  
	     }  
	  


}
