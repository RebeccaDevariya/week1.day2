package week1.day2;

public class Calculator {
	public static void main(String[] args)   {

		Calculator calc = new Calculator();
		
		System.out.println(calc.add(2, 4, 6));
		System.out.println(calc.sub(2, 4));
		System.out.println(calc.mul(2, 4));
		System.out.println(calc.divide(4,2));
	}
	
	public int add(int num1,int num2,int num3) {
		return num1+num2+num3;
	}
	
	public int sub(int num1,int num2) {
		return num1-num2;
	}
	
	public double mul(double num1,double num2) {
		return num1*num2;
	}
	
	public float divide(float num1,float num2) {
		return num1/num2;
	}

}
