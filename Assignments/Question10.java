//10.	Write a program to convert temperature from Fahrenheit to Celsius. Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]

import java.util.Scanner;
class Question10 {
				public static void main(String args[]){
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter the temperature in Fahrenheit");
					float f = sc.nextFloat();
					float Cel = 5*(f-32)/9;
					System.out.println("Temperature is "+Cel+" Celsius");
				}
}
