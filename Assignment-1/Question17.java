//17.	Write a program to reverse a given number.

import java.util.*;
class Question17{
				public static void main(String args[]){
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter any numbers");
					int num = sc.nextInt();
					int reversed = 0;
					while(num != 0) {
					int digit = num % 10;
					reversed = reversed * 10 + digit;
					num /= 10;
					}

					System.out.println("Reversed Number: " + reversed);
					
			}
}