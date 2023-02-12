package oop4;

public class Calculator implements AdvCalc, BasicCalc{
	//Implements keyword for interface
	//Extends keyword for java class

	public static void main(String[] args) {
		

	}

	@Override
	public void add(int a, int b) {
		int sum= a+b;
		System.out.println(sum);
		
	}

	@Override
	public void sub(int a, int b) {
		int sub= a-b;
		System.out.println(sub);
		
	}

	@Override
	public void multiple(int a, int b) {
		int mul= a*b;
		System.out.println(mul);
		
	}
		
		public void div(int a, int b) {
			int div= a/b;
			System.out.println(div);
		
	}

}
