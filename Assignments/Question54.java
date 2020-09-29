//54.	Write a program to reverse the given String.

import java.util.*;
class Question54{
	public static void main(String args[]){
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String s ="";
		for(int i=str.length()-1;i>=0;i--){
			s += str.charAt(i);
		}
		System.out.println(s);
	}
}