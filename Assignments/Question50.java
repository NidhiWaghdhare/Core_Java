<<<<<<< HEAD
/*50.	Explain the importance of toString() and equals() method of the Object class and override them on class Employee(empId,name,salary). 
 a. Create class for main method(say XYZ),and accept five employees information and store in an array. Also ensure if entered empId already exist or not 
 (use equals method).  b. Display all employee info using toString method.*/

 import java.util.*;
 class EmpDemo{
		int empId;
		String name;
		double salary;
	 EmpDemo(int empId,String name,double salary){
		 this.empId=empId;
		 this.name=name;
		 this.salary=salary;
		 
	 }

 @Override
 public String toString(){
	 return empId+"  "+name+"  "+salary;
 }
  }
  public class Question50{
	  public static void main(String args[]){
		   EmpDemo[] arr=new EmpDemo[5];
	 System.out.println("Enter Employee Information");
	  Scanner sc = new Scanner(System.in);
	  for(int i=0;i<arr.length;i++){
		  System.out.println("Enter Employee id");
		  int empId=sc.nextInt();
		  int flag=0;
		  for(int j=0;j<i;j++){
			  if(arr[j].empId == empId){
				  System.out.println("Employee ID already exsist");
				  i--;
				  flag=1;
				  break;
			  }
		  }
		  if(flag==1){
			  continue;
		  }
		  System.out.println("Enter Employee name");
		  String name=sc.next();
		  System.out.println("Enter the Salary of employee");
		  double salary = sc.nextDouble();
		  EmpDemo d = new EmpDemo(empId,name,salary);
		  arr[i]=d;
	  }
	  for(EmpDemo e : arr){
		  System.out.println(e);
	  }
		  
	  }
  }
	 
  
=======
/*50.	Explain the importance of toString() and equals() method of the Object class and override them on class Employee(empId,name,salary). 
 a. Create class for main method(say XYZ),and accept five employees information and store in an array. Also ensure if entered empId already exist or not 
 (use equals method).  b. Display all employee info using toString method.*/

 import java.util.*;
 class EmpDemo{
		int empId;
		String name;
		double salary;
	 EmpDemo(int empId,String name,double salary){
		 this.empId=empId;
		 this.name=name;
		 this.salary=salary;
		 
	 }

 @Override
 public String toString(){
	 return empId+"  "+name+"  "+salary;
 }
  }
  public class Question50{
	  public static void main(String args[]){
		   EmpDemo[] arr=new EmpDemo[5];
	 System.out.println("Enter Employee Information");
	  Scanner sc = new Scanner(System.in);
	  for(int i=0;i<arr.length;i++){
		  System.out.println("Enter Employee id");
		  int empId=sc.nextInt();
		  int flag=0;
		  for(int j=0;j<i;j++){
			  if(arr[j].empId == empId){
				  System.out.println("Employee ID already exsist");
				  i--;
				  flag=1;
				  break;
			  }
		  }
		  if(flag==1){
			  continue;
		  }
		  System.out.println("Enter Employee name");
		  String name=sc.next();
		  System.out.println("Enter the Salary of employee");
		  double salary = sc.nextDouble();
		  EmpDemo d = new EmpDemo(empId,name,salary);
		  arr[i]=d;
	  }
	  for(EmpDemo e : arr){
		  System.out.println(e);
	  }
		  
	  }
  }
	 
  
>>>>>>> ae468cf60ee122f27d44e0ed45e48a119273508f
  