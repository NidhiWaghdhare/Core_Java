//16.	Write a program to print table of any entered number using loop.

import java.util.Scanner;
class Question16{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int n = sc.nextInt();
		for(int i=1;i<11;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}
		
	}
	
}