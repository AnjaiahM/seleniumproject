package Automationtestng;

import java.util.Date;

import javax.xml.crypto.Data;

import org.testng.annotations.Test;

public class script_Timestamp {
  @Test
  public void ExecuteScript() {
	  System.out.println(exedcutetimstamp());
  }
  public String exedcutetimstamp() {
	 
	  Date d=new Date();
	  System.out.println(d.toString());
	  return d.toString().replace(" ", "_").replace(":", "_")+"@gmail.com";
	  
  }
}
