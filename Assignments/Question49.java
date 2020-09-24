/* 49.	Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. create abstract method calcTax().
 a. Create class Employee(empId,name,salary) and implement Taxable to calculate incomeTax on yearly salary.
 b. Create class Product(pid,price,quantity) and implement Taxable to calculate salesTax on unit price of product.
 c. Create class for main method(Say XYZ), accept employee information and a product information from user and print income tax and sales tax respectively.*/
 import java.util.*;
 
 interface taxable{
	 double saleTax=00.7;
	 double incomeTax =0.10;
	 void calcTax();
 }
 
 class Employee implements taxable{
	 int empId;
	 int salary;
	 String name;
	 Employee(){}
	 
	 Employee(int empId,int salary,String name){
		 this.empId=empId;
		 this.salary=salary;
		 this.name = name;
	 }
	 
	 public void calcTax(){
		 double incomeTax1= salary * incomeTax;
		System.out.println("Income Tax "+incomeTax1);
	 }
 }
 
 class Product  implements taxable{
	 int pId;
	 int price;
	 int quantity;
	 Product(){}
	 
	 Product(int pId,int price,int quantity){
		 this.pId=pId;
		 this.price=price;
		 this.quantity = quantity;
	 }
	 
	 public void calcTax(){
		 double saleTax1=(price * quantity) * saleTax;
		 System.out.println("SaleTax "+saleTax1);
	 }
 }
 
 class Question49{
	 public static void main(String args[]){
		 taxable t=new Employee(1,15000,"shruti");
		 taxable t1=new Product(1,400,5);
		 t.calcTax();
		 t1.calcTax();
	 }
 }