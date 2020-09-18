//04.	Write a program that initializes 2 byte type of variables. Add the values of these variables and store in a byte type of variable.
// [Note: primitive down casting is required in this program ]
import java.util.Scanner;
class Question4{
				public static void main(String args[]){
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter first number");
				int n1 = sc.nextInt();
				System.out.println("Enter second number");
				int n2 =sc.nextInt();
				int add = n1+n2;
				byte sum = (byte)add;
				System.out.println("Sum is "+sum);
				
				
				
				}
} 