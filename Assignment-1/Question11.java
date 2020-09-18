//11.	Write a program to swap two numbers without using third variable.

import java.util.Scanner;
class Question11{
				public static void main(String args[]){
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter value of a");
					int a = sc.nextInt();
					System.out.println("Enter value of b");
					int b = sc.nextInt();
					a=a+b;
					b=a-b;
					a=a-b;
					System.out.println("After Swapping the value of a is "+a+" Value of b is "+b);
				}
}