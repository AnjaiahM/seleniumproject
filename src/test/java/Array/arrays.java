package Array;

import java.util.Arrays;

import org.testng.annotations.Test;

public class arrays {

	
	
	@Test
	public void finalArray() {
		final int[] a=new int[] {2,5,9};
		//a=new int[] {5,9,10};
		
		a[0]=10;
		for(int aa:a) {
			System.out.println(aa);
		}
		System.out.println( Arrays.toString(a));
	}
	
	@Test
	public void arrayStoreException() {
		
		arrayStore();
	}
	
	
	public String[] arrayStore() {
		String []in=new String[3];
		in[0]=Integer.toString(2);
		in[1]="a";
		in[2]="30";
	//	System.out.println(in);
		
		
		return in;
	}
	
	@Test
	public void twoDimArray() {
		int a[][]= {
				{1,2},
				{3,6},
				{5,10}
		};
		
		for(int arr[]:a) {
			for(int aa:arr) {
				System.out.print(aa+" ");
			}
			System.out.println();
		}
		Object[]p= {12,"anj"};
		System.out.println(p);
		
	}
}
