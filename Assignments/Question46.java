//46.	Create a program to demonstrate the use of instanceof operator or secure reference down casting.

class Person{
	void getDetails()
	{
		System.out.println("Person's Details");
	}
	void getJob(){
		System.out.println("Person's Job");
	}
}

class Employee extends Person{
	void getJob(){
		System.out.println("Employee's Job");
	}
	void getDept(){
		System.out.println("Employee's Department");
	}
}

class Question46{
	public static void main(String args[]){
		Person ar[] = {new Employee(),new Person()};
		for(Person a :ar){
			if(a instanceof Employee){
				Employee e = (Employee)a;//down casting 
				e.getDept();
			}
		}
	}
}