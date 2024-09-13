package keywords;

import org.testng.annotations.Test;

public class keymain {

	@Test
	public void dispValues() {
		thiskey tk=new thiskey(5, 6);
		tk.returnObject().  returnValues();
		tk.passObject1();
	}
	
	
	
	
	
private keymain(){
		System.out.println("private con");
	}

@Test
public void privateCon() {
	
	keymain km=new keymain();
	km.dispValues();
	
}

}
