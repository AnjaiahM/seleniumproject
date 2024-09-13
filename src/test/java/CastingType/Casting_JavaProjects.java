package CastingType;
import org.testng.annotations.Test;

public class Casting_JavaProjects {

	@Test
	public void pritypeCasting() {
		
		int in=10;
		double do1=in;   //Automatic type conversion or implicit type casting
		System.out.println(in+" "+do1);
		
		in=(int) do1;  //Explicit type convert
		
		System.out.println(in +" "+do1);
		
	}
	
	
}
