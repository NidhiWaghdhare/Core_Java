//27.	Write a program to find the smallest and greatest number present in the array of integer type.

import java.util.*;
class Question27{
				public static void main(String args[]){
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the elements of an array");
				 int numbers[]=new int[10];
				for(int i=0;i<numbers.length;i++){
				numbers[i]=sc.nextInt();
				}   
				int smallest = numbers[0];
                int biggest = numbers[0];
                for(int i=0; i< numbers.length; i++)
                {
                        if(numbers[i] >= biggest)
						{
                                biggest = numbers[i];
						}
                         if (numbers[i] <= smallest)
						 {
                                smallest = numbers[i];
						 }
                       
                }
               
                System.out.println("Largest Number is : " + biggest);
                System.out.println("Smallest Number is : " + smallest);
}
}