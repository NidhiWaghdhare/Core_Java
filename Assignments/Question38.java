/*38.	Create a class Employee with three data members (empNo, salary and totalSalary) and following features.
a.	Only parameterized constructor. [Do not overload the constructor]
b.	totalSalary always represents salary total of all the employees created.
c.	empNo should be auto incremented.
d.	display total employees and totalSalary using a method.
Create another class EmployeeDemo (main class) that creates some Employee objects and calls Employee method to display no. of employees and total of 
their salaries.
*/

import java.util.*;
class Employee{
		static int empNo=1;
		static float totalSalary;
		float sal;
		static int count;
	
	Employee(float sal){
		this.empNo=empNo++;
		this.sal=sal;
		totalSalary+=sal;
		count++;
	}
	void show(){
		System.out.println("Total employees "+count);
		System.out.println("Total Salary employees "+totalSalary);
		
		
	}
	
}

class Question38{
	public static void main(String args[]){
		Employee e1 =new Employee(100000);
		Employee e2 =new Employee(52000);
		Employee e3 =new Employee(60000);
		Employee e4 =new Employee(80000);
		e4.show();
		//e3.show();
		//e2.show();
		//e1.show();
	}
}