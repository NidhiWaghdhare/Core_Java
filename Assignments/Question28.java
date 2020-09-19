//28.	Initialize one String type of array and print the elements using for each loop.
import java.util.*;
class Question28{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int s = sc.nextInt();
		System.out.println("Enter the array elements of string");
		String arr[]=new String[s];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.next();
		}
		for(String ar:arr){
			System.out.print(" "+ar);
		}
		
	}
}