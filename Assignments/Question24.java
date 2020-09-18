//24.	Write a program to search an element in the array.

import java.util.*;
class Question24{
				public static void main(String args[]){
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the size of array");
				int n=sc.nextInt();
				int arr[]=new int[n];
				System.out.println("Enter the array element");
				for(int i=0;i<arr.length;i++){
					arr[i]=sc.nextInt();
				}
				
				System.out.println("Enter the number that you want to search in array:");
				int num =sc.nextInt();
				int flag=0;
				for(int i=0;i<arr.length;i++)
				{
					if(arr[i]==num){
					System.out.println("The number "+num+" found at a index location:"+i);
					flag=1;
					}
				}
				if(flag==0)
				{
					System.out.println("the number is not found");
				}
					
					
				}
}