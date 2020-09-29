<<<<<<< HEAD
//52.	Input name of a person and count how many vowels it contains.  Use String class functions. 
import java.util.*;
public class Question52{
	public static void main(String args[]){
		System.out.println("Enter any string");
	Scanner sc = new Scanner(System.in);
	String str = sc.next().toLowerCase();
	int count=0;
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
			count++;
		}
		
	}
	System.out.println("Number of vowels:: "+count);
}
=======
//52.	Input name of a person and count how many vowels it contains.  Use String class functions. 
import java.util.*;
public class Question52{
	public static void main(String args[]){
		System.out.println("Enter any string");
	Scanner sc = new Scanner(System.in);
	String str = sc.next().toLowerCase();
	int count=0;
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
			count++;
		}
		
	}
	System.out.println("Number of vowels:: "+count);
}
>>>>>>> ae468cf60ee122f27d44e0ed45e48a119273508f
}