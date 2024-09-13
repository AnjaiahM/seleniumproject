package CastingType;

import org.testng.annotations.Test;

public class castingmain {

	@Test
	public void maintype() {
		
		System.out.println("..........Upcasting");
		
	Parent p=new Child();
	
	System.out.println(p.hashCode());
	p.show();
	p.display();
	
	p=new Child();
	System.out.println(p.hashCode());
	p.show();
	p.display();
	Child cc=(Child) p;
	
	System.out.println("...........................");
	cc.print();
	cc.show();
	cc.display();
	
	System.out.println("..............................");
	
	
	System.out.println("..........downcasting");
	
	Child ch=(Child) new Parent();
	ch.show();
	ch.print();
	ch.display();
	
}
}
