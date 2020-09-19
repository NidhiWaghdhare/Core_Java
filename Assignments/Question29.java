//29.Write a program to print the total number of one-D arrays in a two-D array and the number of elements in every one-D array present in the two-D arrays.

import java.util.*;
class Question29{
				public static void main(String args[]){
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter number of rows:");
					int rows=sc.nextInt();
					int arr[][]=new int[rows][];
					int total=0;
					for(int i=0;i<arr.length;i++){
						System.out.println("Enter the columns for the row"+i);
						int cols=sc.nextInt();
						arr[i]=new int[cols];
						for(int j=0;i<arr[i].length;j++){
							System.out.println("Enter the column"+j+"elements");
							arr[i][j]=sc.nextInt();
						}
					}
					for(int i=0;i<arr.length;i++){
						int count=0;
						for(int j=0;j<arr[i].length;j++){
							count++;
						}
						System.out.println("total number of elements in"+i+"1-D elements="+count);
					}
					System.out.println("total no. of 2-D elements ="+rows);
				}
}