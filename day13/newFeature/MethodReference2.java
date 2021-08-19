package com.tech.day13.newFeature;

interface Calculate {
	 int add(int a, int b);
}
class Calculationutil{
	int addition(int a,int b) {
		return a+b;
	}
		static int subtraction(int a,int b) {
			return a-b;
		
	}
}
	
	
public class MethodReference2 {

	public static void main(String[] args) {
		Calculate calculate = (a, b) -> a + b;
		System.out.println(calculate.add(2, 3));
		Calculate calculate2 = (a, b) -> a - b;
		System.out.println(calculate.add(3, 4));
   //using metod reference
	/*Add add=new Add();
	Calculate cal=add::addition;
	System.out.println(cal.add(3, 3));
	Sub sub=new Sub();
	Calculate cal2=sub::subtraction;
	System.out.println(cal2.add(5,4));
	*/
		Calculationutil util=new Calculationutil();
	   Calculate c1=util::addition;
	  // Calculate c2=util::subtraction;
	System.out.println(c1.add(4, 3));
	//System.out.println(c2.add(2,4));
	
	Calculate c2=Calculationutil::subtraction;
	c2.add(3, 4);
	}

}
