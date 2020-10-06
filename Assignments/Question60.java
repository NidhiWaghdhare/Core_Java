/*60.	Create Interface StudentFee and declare following method.  getFee() throws InvalidFeeException. This method ask fees from user and throws exception 
if user enters invalid or negative fees Create class Student with members (name, fees) and implement the StudentFee Interface.*/

import java.util.*;

interface StudentFee {
	void getFee() throws Exception;
}


class InvalidFeeException extends RuntimeException{
	InvalidFeeException(String s){
		super(s);
		//System.out.println(s);
	}
}


class Student implements StudentFee {
	
	String name;
	int fee;
	
	Student(String name){
		this.name=name;
	}
	
	public void getFee() throws Exception{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fee:: ");
		try {
			int f = sc.nextInt();
			if(f < 0 ) {
				throw new Exception("invalid fee Exception");
			}
			this.fee=f;
			System.out.println("name: "+name+" "+"fee: "+fee);
			
		}
		catch(Exception e){
			throw new Exception("invalid fee Exception");
		}
		
	}
	
}


public class Question60 {

	public static void main(String[] args) {
		
		Student s = new Student("pranay");
		
		try {
			s.getFee();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}