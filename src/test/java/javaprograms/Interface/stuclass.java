package javaprograms.Interface;

public class stuclass implements student,employ{
	int x=15;
 public int m1(){
	return 0;}
 
 public static void main(String[] args) {
	
student	 s=new stuclass();
	System.out.println(s.m1());
	System.out.println(s.x);
	s.m5();
	
	//m3();
	stuclass ss=new stuclass();
	System.out.println(ss.x);
	System.out.println(ss.m1());
	employ e=new stuclass();
System.out.println(	e.m1());
	
}
}
