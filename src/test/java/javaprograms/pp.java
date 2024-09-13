package javaprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.testng.annotations.Test;

public class pp {

	
	public pp() {
		super();
	}
	
	
	public void ppl() {
		
	}
	
	@Test
	public void resultifBodmas() {
		boolean isVowel=false;
	char c='a';
	switch(c) {
	case'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U':
		isVowel=true;
		
	}
	if(isVowel=true) {
		System.out.println(c+" is vowel");
	}else System.out.println(c+" is not vowel");
	}
	
	@Test
	public void powerof_number() {
		int ininumber=5;
		int power =3;
		int number;
		number=ininumber;
		
		for(int i=1;i<power;i++) {
			number=ininumber*number;
		}
		System.out.println(power+" power of "+ininumber+" is "+number);
	}
	
	@Test
	public void sumof_100_numbers(){
		char c='a';
		char b='a';
		int i=c/b;
		int p=(i+i+i)*(i+i+i);
		int p1=i+i+i+i+i;
		System.out.println(i+" "+p);
		int sum = 0;
		for( ;i<=p;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
	
	@Test
	public void sum_All_digits_number() {
		
		 int a=153;
		 int sum=0,r,
				 n=a;
		while(n>0) {
			r=n%10; //2
			sum=(sum)+r*r*r;
			n=n/10;   //
			
		}
		System.out.println(sum);
	}
	
	
	@Test
	public void duplicateChar_count_String() {
		
		String ss="jfhdfhdkikoewjfewfhffaa";
		char cc[]=ss.toCharArray();
		
		Map<Character,Integer> ma=new HashMap<Character,Integer>();
		for(Character ccccpopy:cc) {
			if(ma.containsKey(ccccpopy)) {
				ma.put(ccccpopy, ma.get(ccccpopy)+1);
			}else
			{
				ma.put(ccccpopy, 1);
			}
		}
		
		System.out.println(ma);
		
		for( Character ccc:ma.keySet()) {
			if(ma.get(ccc)>1) {
				System.out.println(ccc+ " occured "+ma.get(ccc)+" times");
			}
		}
		
	}
	
	@Test
	public void numberof_digits() {
		
		String ss="jhvjdshuhsd978ur9oeihdoh()*))&ohohouhdfuhdsdhuqqAAA";
		int isalphabet=0;
		int isdigit=0;
		int isletter=0;
		int isspace=0;
		int isco=0;
		
		char ch[]=ss.toCharArray();
		for(Character ccc:ch) {
			if(Character.isAlphabetic(ccc)) {
				isalphabet++;
			}
			else if(Character.isDigit(ccc)) {
				isdigit++;
			}
			else if(Character.isLetter(ccc)) {
				isletter++;
			}

			else if(Character.isSpace(ccc)) {
				isspace++;
			}
			else 
				isco++;
			}
		
		
		System.out.println(isalphabet);
		System.out.println(isdigit);
		System.out.println(isletter);
		System.out.println(isspace);
		System.out.println(isco);
}
		
	
	@Test
	public void removeDuplicateinArray_using_HashSet() {
		int[] a= {8,6,0,1,10,9,1,2,10,0};
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			
		hs.add(a[i]);
	}
		
		System.out.println(hs);
		
	Integer[] in=	hs.toArray(new Integer[hs.size()]);
	System.out.println(Arrays.toString(in));
	}
	
	
	@Test
	public void duplicateele_Array() {
		
		int[]a= {5,0,1,5,9,2,10,12,9};
		int b[]= {};
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				b[i]=a[i];
			}
		}
		
		
	}
		
		
	}

