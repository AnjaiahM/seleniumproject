package javaprograms.Naveen;

import org.testng.annotations.Test;

public class NaN {

	@Test
	public void NaN() {
		
	//	System.out.println(0/0);  //arith
		System.out.println(0.0/0);  //NaN
		System.out.println(12.00f/0.0);  //infinity
		System.out.println(1.00d/0);   //infin
		System.out.println(0.0/0.0);  //Nan
		System.out.println(0/0.0);  //Nan
		System.out.println(1.0/0); //infin
		
		System.out.println(MainClass.x);
		
		
		
	}
	
	
	
	
	
	
}

class  MainClass {
	public static final int x=100;
	
	static {
		System.out.println("sttaic block.....");
	}
}