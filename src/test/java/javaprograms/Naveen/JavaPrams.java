package javaprograms.Naveen;

import java.util.stream.IntStream;

import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class JavaPrams {

	
	@Test
	public void to100_withoutnum() {
		int one='a'/'a';
		String a="..........";
		for(int i=one;i<=(a.length()*a.length());i++) {
			System.out.println(i);
		}
	}
	
public void num_withoutloop(int one) {
//	one='a'/'a';
	String a="..........";
	if(one<=a.length()*a.length()) {
		System.out.println(one);
		one++;
		num_withoutloop(one);
	}
}
	@Test
	public void to100_withoutloo() {
		num_withoutloop(1);
	}
	
	@Test
	public void to100_withStream() {
		IntStream.range(1	,101).forEach(e->System.out.println(e));
	}
	
	
	@Test
	public void helloword_withoutusingsemicolon() {
		if(System.out.printf("helloworld"+"\n")==null) { 
			
		}
if(System.out.append("helloworld"+"\n")==null) { 
			
		}

if(System.out.append("helloworld"+"\n").equals(null)) { 
	
}


	}
	
	@Test
	public void string_catination() {
		System.out.println(10+30+"java");
		System.out.println("java"+10+30);
	}
	
	
	public static void main(String[] args) {
		string_NullArgument(null);
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println(a+b);
		
	}
	
public static void string_NullArgument(Object o) {
		System.out.println("o");

	}
public static void string_NullArgument(String o) {
	System.out.println("string");

}
	@Test
	public void subString() {
		String sub="programs";
		System.out.println(sub.substring(2));
		System.out.println(sub.substring(2, 5));
		System.out.println(sub.subSequence(2, 5));
		
		String intern=new String("intern");
		System.out.println(intern.intern());
		
		String s2=intern.intern();
		System.out.println(intern);
		System.out.println(s2);
		System.out.println(intern==s2);
		System.out.println(intern.equals(s2));
		
		System.out.println(1+sub+1+3+5);
		
		
	}
	
	
}
