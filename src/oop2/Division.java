package oop2;

import oop1.Addition;

public class Division extends Addition {
	//this method is constructor-same as class name
	public Division() {
		int x= 10;
		int y= 6;
	}
	
	
	
	
	
	
	void division(int a,int b) {
		int div=a/b;
		System.out.println(div);
	}
	
	void division(double a,double b) {
		double div=a/b;
		System.out.println(div);
		
	}
	public static void main(String[] args) {
		Division m1= new Division();
		
        //(100,100,50)/10
		m1.add(100, 100, 50);
		
       int m2=m1.add(100, 100, 50);
       m1.division(m2, 10);
       
		

	}

}
