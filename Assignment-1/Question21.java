//21.	Program to show sum and average of 10 element array. Accept array elements from user. 
import java.util.*;
class Question21{
				public static void main(String args[]){
					Scanner sc = new Scanner(System.in);
					int arr[] = new int[10];
					int sum=0;
					System.out.println("Enter elements");
					for(int i=0;i<arr.length;i++){
						arr[i]=sc.nextInt();
						sum+=arr[i];
					}
					float average=sum/arr.length;
					System.out.println("Average of 10 element is "+average);
					
				}
}