package polymorphism;


class c1{
	public c1(){
		
	}
	public void m1() {
		System.out.println("m1");
	}
}
class c2 extends c1{
	public void m1() {
		System.out.println("m2");
	}
}
public class polymorphism {
	
	
	
	public static void main(String[] args) {
//		polymorphism p=new polymorphism();
//		p.m1((String) new Object());
		
		c1 c=(c1)new c2();
		c2 cc=(c2)c;
		c.m1();
		cc.m1();
		cc.m1();
		
		
		int a=10;
		long l=a;
		int i=(int)l;
	}
	
}
