package javaprograms.Interface;

  public interface student {
	 
	   int x = 10;
	private static void m2() {
		System.out.println("private static method");
	}
	 static void m3() {
		m2();
		System.out.println("m3 method");

	}
	public static void m6() {
		 System.out.println("m6");
	 }
	  default void m5() {
		 System.out.println("default m5");
		 }
 public  int m1();
 
 public static void main(String[] args) {
	m3();
	m6();
}
 
}
//  class sud implements student{
//	public int m1(){
//		return 0;
//		
//	}
//}