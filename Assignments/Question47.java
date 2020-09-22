//47.	Create a program to demonstrate constructor chaining.

class Person{
		Person(){
			this(45);
			System.out.println("No-Args Parameter");
		}
		
		Person(int i){
			System.out.println("Args Parameter");
		}
		
}

class Employee extends Person{
	Employee(){
		this(12);
		System.out.println("No-Args Employee");
	}
	Employee(int i){
		System.out.println("Parameter Employee");
	}
}

class Question47{
	public static void main(String args[]){
		Employee e = new Employee();
	}
}