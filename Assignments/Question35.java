/*35.	Create a class MathOperation that has four static methods. add() method that takes two integer numbers as parameter and returns the sum of the numbers.
 subtract() method that takes two integer numbers as parameter and returns the difference of the numbers. multiply() method that takes two integer numbers
 as parameter and returns the product. power() method that takes two integer numbers as parameter and returns the power of first number to second number. */
 import java.util.*;
class MathOperation{
	private int n1;
	private int n2;
	static void add(int n1,int n2){
		int sum = n1+n2;
		System.out.println("Addition of two number is "+sum);
	}
	static void subtract(int n1,int n2){
		int sub = n1-n2;
		System.out.println("Difference of two number is  "+sub);
	}
	static void multiply(int n1,int n2){
		int mul=n1*n2;
		System.out.println("Multiplication of two number is "+mul);
	}
	static void power(int n1,int n2){
		double pow=Math.pow(n1,n2);
		System.out.println("Power is "+pow);
	}
}

class Question35{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		MathOperation m = new MathOperation();
		System.out.println("Enter the first Number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second Number");
		int num2 = sc.nextInt();
		m.add(num1,num2);
		m.subtract(num1,num2);
		m.multiply(num1,num2);
		m.power(num1,num2);
		
	}
}
