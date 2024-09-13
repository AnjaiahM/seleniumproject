package javaprograms.Naveen;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class duplicare {

	
	@Test
	public void duplicate_Ele() {
		String arr[]= {"india","aus","usa","india","indo","usa"};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					System.out.println(arr[j]);
				}
			}
		}
		
		
		Set<String> dupset=new HashSet<String>();
		for(String ar:arr) {
			if(dupset.add(ar)) {
				System.out.println(ar);
			}
		}
		
	Set<String> hh=	Arrays.asList(arr).stream().filter(e->!dupset.add(e)).collect(Collectors.toSet());
	System.out.println(hh);
	}
	
	@Test
	public void isduplicateChar() {
		String dup="klpoutr";
		char[] ch=dup.toCharArray();
		boolean isnot=false;
		for(int i=0;i<ch.length;i++) {
			boolean b=false;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]){
					
					b=true;
					break;
				}
				
			}
			if(b==false) {
				System.out.println(ch[i]);
				isnot=true;
			}
			
		}
		if(!isnot) {
			System.out.println("no dup");
		}
	}
}
