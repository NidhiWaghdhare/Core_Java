<<<<<<< HEAD
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
=======
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
>>>>>>> ae468cf60ee122f27d44e0ed45e48a119273508f
}