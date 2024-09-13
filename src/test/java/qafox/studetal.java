package qafox;

import org.testng.annotations.DataProvider;

public class studetal {

	@DataProvider(name="studetaails")
	public String[][]  stulist2_palce() {
		String [][] list2= {
				
				{"sooll","india","sctionA"},
				{"mango","USA","sctionB"},
		};
		return list2;
	}
	
}
