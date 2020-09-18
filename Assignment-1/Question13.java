//13.Program to find greatest in 3 numbers. [ once using if else statement ]  

import java.util.Scanner;
class Question13{
				public static void main(String args[]){
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter 1st Number: ");
					int n1 = sc.nextInt();
					System.out.println("Enter 2nd Number: ");
					int n2 = sc.nextInt();
					System.out.println("Enter 3rd Number: ");
					int n3 = sc.nextInt();
					if(n1>n2 && n1>n3){
						System.out.println(n1+"  is greatest");
					}
					else if(n2>n1 && n2>n3){
					
						System.out.println(n2+"  is greatest");
					}
					else
						System.out.println(n3+"  is greatest");
				}
}