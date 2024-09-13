package javaprograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Leapyear {

	@Test
	public void isLeap() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a year....");
		int year=s.nextInt();
		boolean isleap=false;
		if((year%4==0)&&(year%400==0 ||year%100!=0)) {
			isleap=true;
			System.out.println(year  +" is Leap year");
		}else {
			System.out.println(year+ " is not a leap year");
		}
		
	}
	
	@Test
	public void commentPrograms() {
		String filepath="C:\\Users\\AnjaiahMartha\\OneDrive\\Desktop\\commetprogram.txt";
		int commentcount=0;
		boolean iscommentline=false;
		
		
		try {
			BufferedReader buf=new BufferedReader(new FileReader(filepath));
			String line;
			while((line=buf.readLine())!=null) {
				if(iscommentline) {
					if(line.contains("*/")) {
						iscommentline=false;
					}
					commentcount++;
				}else {
					if(line.contains("//")) {
						commentcount++;
					}else if(line.contains("/*")) {
						iscommentline=true;
						commentcount++;
					}
				
				}
				
				
			}
			
			System.out.println(commentcount);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
