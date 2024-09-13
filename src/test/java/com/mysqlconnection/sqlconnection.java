package com.mysqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class sqlconnection {
	public static String scenario;
	public static String username;
	public static String password;
	
	public static WebDriver driver;
public static void main(String[] args) throws SQLException, ClassNotFoundException, InterruptedException {
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anjaiahmartha", "root", "Anjaiahmartha@369");
if(con.isClosed()) {
	System.out.println("Connection is not established");
}else {
	System.out.println("Connection is established successfully");
}
Statement s = con.createStatement();
ResultSet rs= s.executeQuery("select * from credentials");
while(rs.next()) {
	scenario=rs.getString("scenario");
	username=rs.getString("username");
	 password=rs.getString("password");
System.out.println(scenario+" "+username+" "+password);
ArrayList<String> ar=new ArrayList<String>();
ar.add(scenario);
for(String a:ar) {
	 System.out.println(a);
	 driver=new ChromeDriver();

	 driver.get("https://www.google.com");
	 driver.manage().window().maximize();driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 WebElement search=driver.findElement(By.xpath("(//textarea)[1]"));
	 search.sendKeys(a);
	 search.sendKeys(Keys.ENTER);
	 driver.quit();
	 Thread.sleep(5000);
}

}

 rs=s.executeQuery("select * from credentials where username='000'");
 while(rs.next()) {
	 scenario=rs.getString("scenario");
	 username=rs.getString("username");
	 password=rs.getString("password");
	 System.out.println(scenario+" "+username+" "+password);
	
	
 }
 
 

 
 
 
 
 
 
////Make a connection to the database
////Connection con = DriverManager.getConnection(dbUrl,username,password); 
////load the JDBC Driver using the code 
//Class.forName("com.mysql.jdbc.Driver"); 
////send queries to the database 
//Statement stmt = con.createStatement(); 
////Once the statement object is created use the executeQuery method to execute the SQL queries 
//stmt.executeQuery("select *  from employee;"); 
//ResultSet rs = null;
////Results from the executed query are stored in the ResultSet Object. While loop to iterate through all data 
//while(rs.next()){
// String myName = rs.getString(1);
//} 
////close the db connection 
//con.close();
}
}
