package Singleton_factory_method;

public class Singleton {
static	Singleton si;
	private Singleton() {
		
	}
	 void msg() {
		System.out.println("singletonmethod");
	}
	static Singleton getMethod() {
	if(si==null) 
		si=new Singleton();
		
	
	return si;
	}
	
}
