package strings;

import org.testng.annotations.Test;

public class String_buffer {

	
	@Test
	public void stringMethods() {
		String s1="green";
		String s2="green";
		String s3=new String("green");
		String s4=new String("green");
		String s5=s1;
		String s6=s3;
		
		System.out.println("compare string object using == operator");
		System.out.println(s1==s2);  //true
		System.out.println(s1==s5);  //true
		System.out.println(s3==s4);   //false
		System.out.println(s3==s6);  //true
		System.out.println(s5==s6);  //true
		System.out.println(s3.equals(s6));  //true
		
		System.out.println("using equal mathod..........");
		
		System.out.println(s1.equals(s2));  //true
		System.out.println(s1.equals(s5));  //true
		System.out.println(s3.equals(s4));   //true
		System.out.println(s3.equals(s6));  //true
		
		System.out.println("compare string and stringbuffer.......");
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		System.out.println("using comapre method.......");
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s5));
		System.out.println(s1.compareTo(s6));
		
	}
	@Test
	public void Stringmethod() {
		String s1="greenpppp";
//		s1.chars().forEach(p->System.out.print((char)p));
//		System.out.println();
//		
//		s1="ssspp";
//		s1.concat("pppppp");
//		
//		System.out.println(s1);
//		System.out.println(s1.compareTo("plppppp"));
//		
//		System.out.println( s1.toCharArray());
		String s3="jdi jfjidsfj&Y&^^(I  HIH(&Y(YY@*(@YG99898fji";
		System.out.println(s3.replace(" ", ""));
		System.out.println(s3.replaceAll("[^0-9A-Za-z]", ""));
		
		
		StringBuffer sb1=new StringBuffer("ppppppp");
		sb1.append("jdjfjdfdjf");
		System.out.println(sb1);
		
		}
	
	@Test
	public void Strbufcompare() {
		StringBuffer sb=new StringBuffer("ppp");
		sb.append("lll");
		System.out.println(sb);
		sb=new StringBuffer("lll");
		System.out.println(sb);
	}
}
