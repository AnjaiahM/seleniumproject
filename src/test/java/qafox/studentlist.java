package qafox;

import org.testng.annotations.DataProvider;

public class studentlist {
	@DataProvider(name="stulist")
	public String[][] studentList() {
		String[][] a= {
				{"rob","stela","keopp"},
				{"bok","cehjj","celss"},
				{"nnbvl","nnh","llk"}
			};
		return a;
	}
	
}
