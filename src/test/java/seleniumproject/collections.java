package seleniumproject;

import java.text.DateFormat;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class collections {
public static void main(String[] args) {
	collections c=new collections();
	 c.list();
}
	public void list() {
		LinkedList<Student> stu=new LinkedList<Student>();
		stu.add(new Student(10));
		stu.add(new Student(15));
		stu.add(new Student(23));
		
		Iterator it=stu.iterator();
		while(it.hasNext()) {
		  it.next();
//	System.out.println(stu);
		}
		
	}
	
	@Test
	public void treeSet() {
		TreeSet<String> ts=new TreeSet<String>();
	//	ts.add(null);
		ts.add("ll");
		ts.add("lla");
		ts.add("jll");
		ts.add("nll");
		System.out.println(ts);
		
	}
	@Test
	public void LinkedLists() {
		LinkedList<String> ts=new LinkedList<String>();
		ts.add(null);
		ts.add("ll");
		ts.addFirst("ppp");
		ts.addLast("ppp");
		ts.getFirst();
		
		System.out.println(ts);
	}
	@Test
	public void LinkedSets() {
		LinkedHashSet<String> ts=new LinkedHashSet<String>();
		ts.add(null);
		ts.add(null);
		ts.add("ll");
		
		System.out.println(ts);
	}
	
	@Test
	public void HashMapa() {
		HashMap<String,Integer> ts=new HashMap<String,Integer>();
		ts.put(null,1);
		ts.put(null,2);
		ts.put("ll",3);
		System.out.println(ts);
	}
	
	@Test
	public void LinkedHashMapa() {
		LinkedHashMap<String,Integer> ts=new LinkedHashMap<String,Integer>();
		ts.put(null,1);
		ts.put(null,2);
		ts.put("ll",3);
		System.out.println(ts);
	}
	@Test
	public void HashTablee() {
		Hashtable<String,Integer> ts=new Hashtable<String,Integer>();
		ts.put(null,1);
		ts.put(null,2);
		ts.put("ll",3);
		System.out.println(ts);
	}
	   
	
}
