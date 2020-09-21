/*34.	Create a class Circle that has two data members, one to store the radius and another to store area and three methods first init()
 method to input radius from user, second calculateArea() method to calculate area of circle and third display() method to display values of radius and area.
 Create class CircleDemo ( main class) that creates the Circle object and calls init(), calculateArea() and display() methods.*/
 import java.util.*;
 class Circle{
	 private double radius;
	 private double area;
	 private double PI=3.14;
	 
	 void init(double radius){
		 this.radius=radius;
		 
	 }
	 void calculateArea(){
		this.area = PI*(radius * radius);
		 
	 }
	 
	 void display(){
		System.out.println("Area of circle is  "+area);
	 }
 }
 
 class Question34{
	 public static void main(String args[]){
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the radius of a Circle");
		 Circle c = new Circle();
		 double radius=sc.nextDouble();
		 c.init(radius);
		 c.calculateArea();
		 c.display();
		 
	 }
 }