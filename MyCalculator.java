package week1.day2;

public class MyCalculator {
	public static void main(String[] args)   {

		Calculator calc = new Calculator();
		
		System.out.println(calc.add(2, 4, 6));
		System.out.println(calc.sub(2, 4));
		System.out.println(calc.mul(2, 4));
		System.out.println(calc.divide(4,2));
	}
	
}
