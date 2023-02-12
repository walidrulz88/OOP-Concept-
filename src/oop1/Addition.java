package oop1;

public class Addition {
	private int x;
	private int y;//global/instance variable
	
	
	protected int getX() {
		return x;
	}
	protected void setX(int x) {
		this.x = x;
	}
	protected int getY() {
		return y;
	}
	protected void setY(int y) {
		this.y = y;
	}
	void add() {
		int sum=x+y;
		System.out.println(sum);
		
	}
	public int add(int a, int b, int c) {
		int sum=a+b+c;
		return sum;
	
		
	}
	protected double add(double a, double b, double c) {
		double sum=a+b+c;
		return sum;
	}
		

	public static void main(String[] args) {
		// object creation with a new keyword
		Addition a1 = new Addition();
		a1.x=5;
		a1.y=7;
		a1.add();
		int sum3=a1.add(7, 9, 3);
		System.out.println(sum3);
		double sum2=a1.add(2.0, 9.0, 2.7);
		System.out.println(sum2);
		
		
		

	}
	

}
