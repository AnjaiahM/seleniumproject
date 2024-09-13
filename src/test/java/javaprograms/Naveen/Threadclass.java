package javaprograms.Naveen;

public class Threadclass implements Runnable {      //extends Thread

	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Threadclass th=new Threadclass();
		Thread t=new Thread(th);
				t.start();
		
	}
}
