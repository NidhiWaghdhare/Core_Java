<<<<<<< HEAD
//56.	Write a program to convert very first character of every word in uppercase in a String.

class Question56{
	public static void main(String args[]){
		String str = "nidhi waghdhare";
		String arr[] = str.split(" ");
		String s = "";
		for(int i=0;i<arr.length;i++){
			char ch=arr[i].charAt(0);
			ch=Character.toUpperCase(ch);
			
			if(i==arr.length-1)
				s=s+ch+arr[i].substring(1);
			else
				s=s+ch+arr[i].substring(1)+" ";
		}
		System.out.println(s);
	}
=======
//56.	Write a program to convert very first character of every word in uppercase in a String.

class Question56{
	public static void main(String args[]){
		String str = "nidhi waghdhare";
		String arr[] = str.split(" ");
		String s = "";
		for(int i=0;i<arr.length;i++){
			char ch=arr[i].charAt(0);
			ch=Character.toUpperCase(ch);
			
			if(i==arr.length-1)
				s=s+ch+arr[i].substring(1);
			else
				s=s+ch+arr[i].substring(1)+" ";
		}
		System.out.println(s);
	}
>>>>>>> ae468cf60ee122f27d44e0ed45e48a119273508f
}