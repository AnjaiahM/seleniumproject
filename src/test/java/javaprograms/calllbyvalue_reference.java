package javaprograms;

import org.testng.annotations.Test;

public class calllbyvalue_reference {
	String str1;
public calllbyvalue_reference(String str1) {
	this.str1=str1;
}
	public void callByValue(int n1,int n2) {
		System.out.println("before swap...n1..n2..are "+n1+" "+n2);
		int temp = n1;
		n1=n2;
		n2=temp;
		
		
		System.out.println("After swap...n1..n2..are "+n1+" "+n2);
	}
	public String getName() {
		return str1;
	}
	
	public void callByReference(calllbyvalue_reference c1,calllbyvalue_reference c2) {
		System.out.println("Before swap...n1..n2..are "+c1.getName()+" "+c2.getName());
		calllbyvalue_reference temp=c1;
		c1=c2;
		c2=temp;
		System.out.println("After swap...n1..n2..are "+c1.getName()+" "+c2.getName());
	}

	@Test
	public void calllbyValue_ref() {
		//callByValue(5,6);
		calllbyvalue_reference c1=new calllbyvalue_reference("lll");
		calllbyvalue_reference c2=new calllbyvalue_reference("kkkk");
		callByReference(c1,c2);
	}
}
