//55.	Write a program to count no of words in the String.

import java.util.*;
class Question55{
	public static void main(String args[]){
		System.out.println("Enter the String");
		Scanner sc =new Scanner(System.in);
		String str = sc.nextLine();
		String arr[]=str.split(" ");
		int count=0;
		for(int i=0;i<arr.length;i++){
			count++;
		}
		System.out.println("No of Words in a string are "+count);
	}
}