package oop2;

import oop1.Addition;

public class Multiplication extends Addition{
	void multiple(int a,int b) {
		int m=a*b;
		System.out.println(m);
		
	}
	void multiple(double a,double b) {
		double m=a*b;
		System.out.println(m);
		
	}

	public static void main(String[] args) {
		Multiplication m1= new Multiplication();
		m1.multiple(4, 6);
        m1.multiple(9.3,7.9);
        //(100,100,100)*10
        m1.add(100, 100, 100);
        int sum6=m1.add(100,100, 100);
        m1.multiple(sum6, 10);
        m1.add(6.8, 9.3, 9.0);

	}

}
