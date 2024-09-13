package keywords;

public class thiskey {

	int a,b;
	public thiskey(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	public void returnValues() {
		System.out.println("a values is "+a);
		System.out.println("a values is "+b);
	}
	
	public thiskey returnObject() {
		 return this;
	}
	
	
	public void passObject1() {
		passObject2(this);
	}
	
	
	public void passObject2(thiskey k) {
		System.out.println("object2 method object ");
	}
}
