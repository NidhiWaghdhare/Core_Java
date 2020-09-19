//30.	Create an integer type 2-D array of size [3X3]. Take the elements from the user and then calculate the sum of the elements present in the diagonal.
import java.util.*;
class Question30{
				public static void main(String args[]){
					Scanner sc = new Scanner(System.in);
					int a[];
					int b[];
					int c[];
					int sum=0;
					int arr[][] = new int[3][3];
					System.out.println("Enter the elements of an array:");
					for(int i=0;i<arr.length;i++){
						for(int j=0;j<arr[i].length;j++){
							arr[i][j]=sc.nextInt();
						}
						
					}
					for(int ar[]:arr){
						for(int e:ar){
							System.out.print(" "+e);
						}
						System.out.println(" ");
					}
				for(int i=0;i<arr.length;i++)
				{ 
				for(int j=0;j<arr[i].length;j++)
				{ 
					if(i==j) //this condition checks for diagonal
				{
				sum = sum + arr[i][j];
				}
				}
				}
 
				System.out.printf("SUM of DIAGONAL elements of the matrix = "+sum) ;
				}
}