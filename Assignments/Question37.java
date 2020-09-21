/*37.	Create a class Person with properties (name and age) with following features. 
a.	Default age of person should be 18.
b.	A person object can be initialized with name and age.
c.	Method to display name and age of person
Create another class PersonDemo ( main class ) that demonstrates the functionalities of Person class by creating Person object and calling methods.
*/
import java.util.*;
class Person{
	private int age=18;
	private String name;
	
	Person(int age,String name){
		this.age=age;
		this.name=name;
	}
	void display(){
		
		System.out.println("Age of the Person is "+age+ " \nName of a person is "+name);
	}
}

class Question37{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age and Name");
		int age=sc.nextInt();
		String name = sc.next();
		Person p = new Person(age,name);
		p.display();
	}
}