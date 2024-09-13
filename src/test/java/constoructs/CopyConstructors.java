package constoructs;

public class CopyConstructors {
int a=10;int b=15;
	
	public CopyConstructors() {
		
	}
	
	public CopyConstructors(CopyConstructors  con) {
		a=con.a;
		b=con.b;
	}
	public void vvv() {
		CopyConstructors();
	}
	private void CopyConstructors() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		CopyConstructors con=new CopyConstructors();


		System.out.println(con.a+" "+con.b);
		
		System.out.println("/n");
		System.out.println(" After updating....");
		con.a=50;con.b=60;
		
		System.out.println(con.a+" "+con.b);
		
		CopyConstructors con2=new CopyConstructors() ;
		
		System.out.println(con2.a+" "+con2.b);
		
		
		System.out.println("Reinitialization...After  ");
		
		
		CopyConstructors con3=new CopyConstructors(con);
		System.out.println(con3.a+"  "+con3.b);
		System.out.println();
			
	}

}
