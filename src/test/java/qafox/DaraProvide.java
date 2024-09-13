package qafox;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DaraProvide {

	
	@Test(dataProvider = "studetaails",dataProviderClass = studetal.class)
	public void student(String st1,String st2,String st3) {
		System.out.println("student1 "+st1+" \nstudent2 "+st2+" \nstudent3 "+st3);
		System.out.println();
		System.out.println();
	}
	
	
}
