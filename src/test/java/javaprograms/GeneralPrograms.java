package javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import org.testng.annotations.Test;

public class GeneralPrograms {
	
	public static void fib(String n){
	      int v=0,c=0,num=0;;
	      for(char cc:n.toCharArray()) {
	     if("aeiouAEIOU".indexOf(cc)!=-1){
	         v++;
	     }else if(Character.isLetter(cc)){
	         c++;
	     }else if(Character.isDigit(cc)) {
	    	 num++;
	     }
	     
	      }
	      System.out.println(c+" "+v+" "+num);
	    }
    
    public static void main(String[] args) {
       fib("automation");
       
    }
    
    //largestin array
    @Test
    public void larArray() {
    	int in[]= {12,0,9,100,99};
    	int lar=in[0];
    	int sla=in[0];
    	
    	for(int la:in) {
    		if(la>lar) {
    			
    			lar=la;
    			
    		//	break;
    			System.out.println(lar);
    		}
    		
    	}
    	
    }
    
    
    
    
    //merge two string
    @Test
    public void mergeArrays() {
    int a1[]= {1,2,3};
    int a2[]= {1,2,3};
    int m[]=new int[a1.length+a2.length];
    System.arraycopy(a1, 0, m, 0, a1.length);
    System.arraycopy(a2,0,m,a1.length,a2.length);
    System.out.println(Arrays.toString(m));
    }
    
    @Test
    public void assendingOrder() {
    	int []in= {12,0,5,3,10,9};
  Arrays.sort(in);
  System.out.println(Arrays.toString(in));
//  for(Integer s:in) {
//    	System.out.println(s);
//    }
  }
    
	@Test
public void reverseString(){
	String str="jabvaprogram";
	StringBuffer sb=new StringBuffer();
	for(int i=str.length()-1;i>=0;i--) {
		//System.out.print(str.charAt(i));
		sb.append(str.charAt(i));
			}
	System.out.println(sb);
//	StringBuilder sb=new StringBuilder(str);
//	System.out.println(sb.reverse().toString());
}
	@Test
	public void armstrong() {
		ArrayList<Integer> ar = null;
		int n=153,r,temp;
		temp=n;
		int sum=0;
		while(n>0) {
			
			r=n%10;
			sum=sum+r;
			n=n/10;
			
			//System.out.println(r);
		 ar=new ArrayList<Integer>();
		ar.add(r);
		Iterator it=ar.iterator();
		while(it.hasNext()) {
		System.out.println(	it.next());
		}
		
		int ss= ar.indexOf((ar.indexOf(0)+ar.indexOf(ar.size()))/2);
		System.out.println( ar.get(ss));		}
//		
		System.out.println(sum);
		
	}
}
