package javaprograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;

import org.testng.annotations.Test;

public class Javaprogramspractice {
	
	@Test
public void maxnumber_of_Array() {
	int arr[]= {10,12,100,3,0,-180};
	int max=arr[0];
	int second=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			second=max;
			max=arr[i];
			
		}
		System.out.println(max);
	}
//	
//	Arrays.sort(arr);
//	System.out.println(arr[arr.length-2]);
//	System.out.println(second);
//	
}
	@Test
public void asssending_descending() {
	int arr[]= {10,12,100,3,0,-180};
	int temp=arr[0];
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	
	
}
	@Test
public void occurencesofele() {
	int arr[]= {10,12,100,3,0,-180};
	
	Map<Integer,Integer> inmapp=new HashMap<Integer,Integer>();
	
	for(Integer ar:arr) {
		if(inmapp.containsKey(ar)) {
			inmapp.put(ar, inmapp.get(ar)+1);
		}else {
			inmapp.put(ar,1);
		}
	}
	System.out.println(inmapp);
	  for(Integer in:inmapp.keySet()) {
		  if(inmapp.get(in)>0) {
			  System.out.println(in+"  ll "+inmapp.get(in));
			  
			  
			  
			  
		  }
	  }
}
	
	
	@Test
public void removeduploicates() {
	int arr[]= {10,12,100,3,0,-180};
	Set<Integer> ppp=new HashSet<Integer>();
	
	for(int p:arr) {
		ppp.add(p);
		
	}
int arr1[]=ppp.stream().mapToInt(Integer::intValue).toArray();
Object[] pppp=  ppp.toArray();

for(Object aa:pppp) {
	System.out.println((int)aa);
}
	System.out.println(	ppp);
}
	
	public String recString(String str) {
		if (str.isEmpty()) {
            return str;
        } else {
            return recString(str.substring(1)) + str.charAt(0);
        }
		
	}
	

	@Test
public void replaceStringcharat() {
	
		
//		String ss="Stringchar";
//		System.out.println(ss.charAt(5));
//		System.out.println(ss.replace('r','g'));
//		StringBuffer sb = null ;
//		for(int i=ss.length()-1;i>0;i--) {
//			System.out.println(ss.charAt(i));
//		}
//		//System.out.println(sb);
//	System.out.println(	recString(ss));
		
		
		String sss="0000string00";
		String sd=null;
		if(sss.startsWith("[^0$]")) {
			sd=sss.replace("[0]", "");
			
			
		}
		System.out.println(sd);
		
		System.out.println(sss.replaceFirst("^0+", ""));
System.out.println(	sss.replaceAll("0+$", "").replaceAll("^0+", ""));


String special="87u8042580*&*(&*&jhcudhfuifhAHJAHAAHA";
 System.out.println( special.replaceAll("[^a-zA-Z]", ""));



}
	@Test
	public void evenLength_word() {
		String sss="ksdhf iifhafhfddnnfjdfh jdfhifhfi djfhfhefi j";
		
	//String [] s=	sss.split(" ");
		 // Splits Str into all possible tokens 
		  for (String word : sss.split(" ")) 
		 
		   // if length is even 
		   if (word.length() % 2 == 0) 
		 
		    // Print the word 
		    System.out.println(word); 
	}
	
	@Test
	public void getLastnumber_of_Array() {
		int sum=0;
		int [] digit= {132,956,285,309,996};
		
		for(int di:digit) {
			
			 int digits = (int) Math.log10(di) + 1;
		        int middleIndex = (digits - 1) / 2;
		        sum+= (di / (int) Math.pow(10, middleIndex)) % 10;
		      
			 
			
			//sum+=di%10;
		//	sum+=di/10;    
		}
		System.out.println(sum);
	}
	
	@Test
	public void getlastdigit_of_Array() {
		
		String lll="string joiner";
	System.out.println(	lll.charAt(lll.length()-1));
		String sum=null;
		String [] digit= {"sai","kj","ppo"};
		System.out.println(".............. "+String.join(lll, digit));
		
	
		for(String di:digit) {
		System.out.println(	di.charAt(0)+di.charAt(di.length()-1));
	//	System.out.println(	di.ind);
		}
		//System.out.println(sum);
	}
	
	
	
}
