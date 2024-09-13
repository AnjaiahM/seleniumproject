package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Streams {

	@Test
	public void streams() {
		
		ArrayList<Object> srr=new ArrayList<Object>();
		srr.add("Arotech");
		srr.add(10);
		srr.add("Adrea");
		srr.add("premass");
		srr.add("Arodha");
		int c=0;
		for(int i=0;i<srr.size();i++) {
			if(srr.get(i).toString().startsWith("A")) {
				c++;
			}
		}
		System.out.println(c);
	}
	
	@Test
	public void streamtext() {
		
		ArrayList<Object> srr=new ArrayList<Object>();
		srr.add("Arotech");
		srr.add(10);
		srr.add("Adrea");
		srr.add("premass");
		srr.add("Arodha");
		
		//srr.stream().filter(p->p.toString().length()>=5).limit(2)      .forEach(s->System.out.println(s));
		srr.stream().filter(p->p.toString().length()>=5).sorted().map(p->p.toString().toUpperCase())      .forEach(s->System.out.println(s));
//	Long ll=	srr.stream().filter(p->p.toString().startsWith("A")).count();
//	System.out.println(ll);
		
	}
	
	
	@Test
	public void streamMethod() {
		
		Long lll=Stream.of("Arjentina","America","Spain","Australia","India").filter(p->p.startsWith("A")).count();
		System.out.println(lll);
		
		Stream.of("Arjentina","America","Spain","Australia","India").filter(p->{
			p.startsWith("A");
			return true;
		}).count();
		
	}
	
	@Test
	public void cancatStream() {

 List<String> arr1= Arrays.asList("sanity","regression","webdriver","smoketesting");
 ArrayList<String> arr2=new ArrayList<String>();
 arr2.add("sapota");
 arr2.add("mango");
 arr2.add("guava");
		// (ArrayList<String>) Arrays.asList("sapota","mango","guava");
 Stream.concat(arr1.stream(), arr2.stream()).filter(p->p.endsWith("a")).limit(0)   .forEach(p->System.out.println(p));;
 //System.out.println(endstream);
 Stream<String> lll=Stream.concat(arr1.stream(), arr2.stream());
// Long l=lll.sorted().map(p->p.toUpperCase()).filter(p->p.length()>5).count();//  .forEach(p->System.out.println(p));
//System.out.println(l);
 List<String> pl= arr1.stream() .collect(Collectors.toList());
System.out.println(pl.get(0));
boolean flag=lll.anyMatch(p->p.equalsIgnoreCase("regression"));
Assert.assertTrue(flag);
	}
	
	
	@Test
	public void printUniqueNumber() {
		
		 List<Integer> lii= Arrays.asList(2,3,9,12,2,9,5,3,5);
//		Set<Integer> li= lii.stream().collect(Collectors.toSet());
//		System.out.println(li);
		 
		List<Integer> lop= lii.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(lop);
		
		//lii.stream().forEach(p->p/2==0);
	}
}
