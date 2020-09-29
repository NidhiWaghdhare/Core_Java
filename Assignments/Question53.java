<<<<<<< HEAD
/*53.	Input data exactly in the following format, and print sum of all integer values. “67, 89, 23, 67, 12, 55, 66”.  
 (Hint use String class split method and Integer class parseInt method) .*/
 
 
 public class Question53{
	 public static void main(String args[]){
		String str ="67 89 23 67 12 55 66";
		String arr[] = str.split(" ");
		
		int sum=0;
		for(int i=0;i<arr.length;i++){
			int a = Integer.parseInt( arr[i]);
			sum +=a; 
			
		}
		System.out.println("Sum is "+sum);
		System.out.println();
	 }
=======
/*53.	Input data exactly in the following format, and print sum of all integer values. “67, 89, 23, 67, 12, 55, 66”.  
 (Hint use String class split method and Integer class parseInt method) .*/
 
 
 public class Question53{
	 public static void main(String args[]){
		String str ="67 89 23 67 12 55 66";
		String arr[] = str.split(" ");
		
		int sum=0;
		for(int i=0;i<arr.length;i++){
			int a = Integer.parseInt( arr[i]);
			sum +=a; 
			
		}
		System.out.println("Sum is "+sum);
		System.out.println();
	 }
>>>>>>> ae468cf60ee122f27d44e0ed45e48a119273508f
 }