package javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class JavaPrograms {

	
	@Test
	public void evennum() {
		 List<Integer> li= Arrays.asList(2,9,12,9,6,10,6);
		List<Integer> llo= li.stream().filter(p->p%2==0).distinct()   .sorted().collect(Collectors.toList()); //.forEach(p->System.out.println(p));
	llo.forEach(p->System.out.println(p));
 Integer[] liupp=	(Integer[]) llo.toArray();
	System.out.println(liupp);
	}
	
	@Test
	public void polindrom() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number...");
	int n=	sc.nextInt();
		
		int r,temp,sum=0;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		
		if(temp==sum) {
			System.out.println("polindrom");
		}else {
			System.out.println("not polindrom");
		}
	}
	
	
	@Test
	public void armstrong() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number...");
	int n=	sc.nextInt();
		
		int r,temp,sum=0;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		
		if(temp==sum) {
			System.out.println("Armstrong");
		}else {
			System.out.println("not Armstrong");
		}
	}
	
	@Test
	public void swappingnumber() {
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		System.out.println("enter n1 value...");
		
	int	n1=sc1.nextInt();
	System.out.println("Enter n2 value...");
	int	n2=sc2.nextInt();
		
		System.out.println("before swaping "+n1+" "+n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("After swapping "+n1+" "+n2);
		
		int a=5;int b=6;
		int c=a+b;/// 11
		a=c-a; //6
		b=c-a;  //5
		System.out.println(a+" "+b);
	}
	
	@Test
	public void reversePolindrom() {
		
		for(int i=5;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(j+1);
			}
			System.out.println("");
		}
		
		
	}
	

	@Test
	public void pyramidstars() {
		
		for(int i=1;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}
	
	@Test
	public void printuptoGivennum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number...");
		int n=sc.nextInt();
		int res=0;
		for(int i=0;i<=n;i++) {
			
			//res=res+i;
			System.out.println(i);
		}
		
	}
	
	@Test
	public void primeNumber() {
 		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check primt or not");
		int n=sc.nextInt();
		int flag=0;
		for(int i=2;i<n;i++) {
		if(n%i==0) {
			System.out.println(n+" is not prime..");
			flag=1;
			break;
		}
		}
		if(flag==0) {
			System.out.println(n+" is prime");
		}
	}
	
	@Test
	public void primeInbetween_num() {
		
		
		for(int i=1;i<100;i++) {
			if(i==1||i==0) {
				System.out.println(i+" not prime numbers");
				continue;
			}
			boolean b=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					b=false;
					break;
				}
			}
			if(b) {
				System.out.println(i+" is prime");
			}
		}
		
		
	}
	
	
	
	@Test
	public void multiplicationTable() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a table number  ..");
		int n=s.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n+" * "+" "+i+"= "+n*i);
		}
		
	}
	
	@Test
	public void numberInvertTriangle() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a table number  ..");
		int n=s.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		
	}
	@Test
	public void numberofwordin_String() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string  ..");
		String str=s.nextLine();
		//String str="plane ia a pplane and";
		String[] st=str.split(" ");
		System.out.println(st.length);
		int c=0;
		for(int i=0;i<st.length;i++) {
			System.out.println(st[i]);
			c++;
		}
		System.out.println(c);
	}
	
	@Test
	public void digitSum() {
		int n=123,r,sum=0,temp;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum)+r;
			n=n/10;
		}
	System.out.println(sum);
	}
	
	public static Integer fact(int n) {
		if(n==0)
			return 1;
		return n*fact(n-1);
	}
	
	@Test
	public void factorial( ) {
int a=6;
 System.out.println(fact(a));
	}
	
	@Test
	public void sumofNumbers_array() {
		
		int []sum= {10,9,12,6,3};
		int s=0;
		for(int i=0;i<sum.length;i++) {
			s=s+sum[i];
		}
		System.out.println(s);
	}
	@Test
	public void fibanacciSeries() {
		
		int a=0,b=1,n=10;
		for(int i=1;i<=n;i++) {
			System.out.println(a);
			int fib=a+b;
			a=b;
			b=fib;
		}
		
	}
	@Test
	public void increase_pyramidnumbers() {
		int x=2,y=0;
		for(int i=0;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(y);
				y=y+x;
			}
			System.out.println("");
		}
	}
}
