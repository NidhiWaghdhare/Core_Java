//26.	Create an array of 17 elements in 5 rows.  And calculate sum of all elements.

import java.util.*;
class Question26{
			public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int sum=0;
	System.out.println("Enter the number of rows");
	int r = sc.nextInt();
	int arr[][]=new int[r][];
	for(int i=0;i<arr.length;i++){
		System.out.println("Enter number of columns");
		int c = sc.nextInt();
		arr[i]=new int[c];
		for(int j=0;j<arr[i].length;j++){
			System.out.println("Enter element");
			arr[i][j]=sc.nextInt();
			sum=sum+arr[i][j];
			
		}
	}
	
	for(int ar[]:arr){
		for(int a:ar){
			System.out.print(" "+a);
		}
			System.out.println(" ");
	}
	System.out.println("Sum of the elements are "+sum);
}
}