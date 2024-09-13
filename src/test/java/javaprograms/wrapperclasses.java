package javaprograms;

import org.testng.annotations.Test;

public class wrapperclasses {

	@Test
	public void wrapperMethods() {
	String bo="TRUE";
	Boolean b=new Boolean(bo);
	System.out.println(b);
	b.booleanValue();
	Integer.valueOf("12");
	int d=12;
	Double.valueOf(d);
	
	String s="12";
	int ii=Integer.valueOf(s);
	Double.valueOf(s);
	
	//Character ch=new Character(bo);
	}
}
