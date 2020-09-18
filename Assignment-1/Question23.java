//23.	Write a program to reverse the array elements.

import java.util.*;
class Question23{
				public static void main(String args[]){
					Scanner sc = new Scanner(System.in);
					int arr[]=new int[5];
					System.out.println("Enter the array Elements");
					for(int i=0;i<arr.length;i++){
						arr[i]=sc.nextInt();
					}
					System.out.print("Reverse of Array is");
					for(int i = arr.length -1;i>=0;i--){
						System.out.print(" "+arr[i]);
					}
				}
}