package Date_Calender;

import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;

public class datatime {

	
	@Test
	public void date() {
		Date d=new Date();
		System.out.println(d);
		
		Calendar c=Calendar.getInstance();
//		 Date ff=c.getTime();
//		System.out.println(ff);
//		 int ss=c.getFirstDayOfWeek();
//		 System.out.println(ss);
		int sep= c.get(Calendar.SEPTEMBER);
		System.out.println(sep);
	int da=	c.get(Calendar.DATE);
	System.out.println(da);
	int ear=c.get(Calendar.YEAR);
	System.out.println(ear);
	
		
	}
	
}
