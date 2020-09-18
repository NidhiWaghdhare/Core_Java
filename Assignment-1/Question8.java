//08.	Write a program to find the simple interest. Take the principle amount, rate of interest and time from user using Scanner class.

import java.util.Scanner;
class Question8{
				public static void main(String args[]){
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter the priciple amount,rate of interest and time");
					float Pamount =sc.nextFloat();
					float rate = sc.nextFloat();
					float time = sc.nextFloat();
					float finalamount = Pamount*(1+rate*time);
					System.out.println("Simple interest is "+finalamount);
				}
}