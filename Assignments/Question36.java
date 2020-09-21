/*36.	Create a class MathOperation containing overloaded methods ‘multiply’ to calculate multiplication of following arguments. 
a.	 two integers 
b.	 three floats 
c.	 all elements of array 
d.	one double and one integer 
*/

import java.util.*;
class MathOperation{
	int num1;
	int num2;
	float f1,f2,f3;
	int num3;
	double d1;
	void multiply(int i , int j){
		int mul = i*j;
		System.out.println("Multiplication of two numbers are "+mul);
	}
	static void multiply(float a,float b,float c){
		float mul = a*b*c;
		System.out.println("Multiplication of three numbers are "+mul);
	}
	
	static void multiply(int arr[]){
		int mul=1;
		for(int x:arr){
			mul=mul*x;
		}
		System.out.println("SMultiplication of elements of the array ::"+mul);
	}
	static void multiply(double i,int j){
		double mul = i*j;
		System.out.println("Multiplication of two numbers are "+mul);
	}
}

class Question36{
	public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
		MathOperation m = new MathOperation();
		System.out.println("Enter the firt number");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number");
		int n2 = sc.nextInt();
		m.multiply(n1,n2);
		System.out.println("Enter the firt number");
		float f1 = sc.nextFloat();
		System.out.println("Enter the second number");
		float f2 = sc.nextFloat();
		System.out.println("Enter the third number");
		float f3 = sc.nextFloat();
		m.multiply(f1,f2,f3);
		System.out.println("Enter the elements in Array");
		int[] arr={2,3,5};
		m.multiply(arr);
		System.out.println("Enter the firt number");
		double d1= sc.nextDouble();
		System.out.println("Enter the second number");
		int n3 = sc.nextInt();
		m.multiply(d1,n3);
	}
}
