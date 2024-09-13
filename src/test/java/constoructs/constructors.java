package constoructs;

import org.testng.annotations.Test;

public class constructors {

	
	
	public  constructors() {
	//	this(9);
		System.out.println("no arg con");
		}
	public constructors(String x) {
		System.out.println(" sinle ele string con "+x);
	}
	public constructors(int a) {
		//this("Anjaiahmartha");
		System.out.println(" sinle ele int con "+a);
	}
	
	public constructors(long x) {
		System.out.println(" sinle ele long con");
	}
	
//	@Test
//	public void runex() {
//		constructors cc=new constructors(9);
//		
//	}
	
}
