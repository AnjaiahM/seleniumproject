package qafox.javaprgrams;

import org.testng.annotations.Test;

public class Strings {

	
	@Test
	public void stringManipulation() {
		String x="ABC";
		System.out.println(x.hashCode());
		 x="ab";
		 System.out.println(x.hashCode());
		 x="abc";
		 System.out.println(x.hashCode());
		
	}
}
