//25.	Write the program to find the sum of even elements and sum of odd elements present in the array of integer type.

import java.util.*;
class Question25{
				public static void main(String args[]){
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter the size of an array");
					int n=sc.nextInt();
					int arr[] = new int[n];
					int OddTot=0;
					int EvenTot=0;
					System.out.println("Enter the elements of an array");
					for(int i=0;i<arr.length;i++){
						arr[i]=sc.nextInt();
					}
					for(int j=0;j<arr.length;j++){
						if(arr[j]%2==0)
						{
							EvenTot=EvenTot+arr[j];
						}
						else
						{
							OddTot=OddTot+arr[j];
						}
					}
					System.out.println("Sum Of even Eements= "+EvenTot);
					System.out.println("Sum Of odd Eements= "+OddTot);
				}
}