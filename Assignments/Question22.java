//22.	Sort a ten element array in descending order.

import java.util.*;
class Question22{
				public static void main(String args[]){
					Scanner sc = new Scanner(System.in);
					int arr[] = new int[10];
					int array=0;
					System.out.println("Enter the 10 Elements");
					for(int i=0;i<arr.length;i++){
						arr[i]=sc.nextInt();
					}
					Arrays.sort(arr);
					for(int i=arr.length -1;i>=0;i--){
						System.out.print(arr[i]+" ");
					}
					
				}
}