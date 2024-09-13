package com.java.privateconstructors;

public class privateconstructor {

	private int a;
	public int b=15;
	
	private privateconstructor() {
		this.a=30;
	}
	
	public static int pricon() {
		privateconstructor pc=new privateconstructor();
		
		return pc.a;
	}
	
	class acc extends privateconstructor{
		
		acc(){
			super();
		}
		int n=110;
		public int ii() {
	
		acc c=new acc();
		
		return privateconstructor.this.a;
		
		}	
		
	}
	
	public static void main(String[] args) {
		privateconstructor oo=new privateconstructor();
		System.out.println(oo.pricon());
		
	}
	
}
