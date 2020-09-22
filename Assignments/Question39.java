/*39.	Create class Product with three data members (pid, price, quantity) and parameterized constructor that takes values for all three data members.  
Create a main method in different class (say ProductDemo) and perform following task:
a. Accept information for five Product objects from user and store objects in an array
b. Find pid of product with highest price. 
c. Create a static method (with array of product’s object as argument) in Product class to calculate and return total amount spent on all products.
 ( amount spent on single product = price of product * quantity of product )
*/

import java.util.*;
class Product{
	int pid;
	int price;
	int quantity;
	static double total;
	
	Product(int pid,int price,int quantity){
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	
	static double totalAmount(Product ar[]){
		for(int i=0;i<ar.length;i++){
			total +=ar[i].price * ar[i].quantity;
		}
		return total;
	}
}

class Question39{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int max=0;
		System.out.println("Enter the count of product objects");
		int count = sc.nextInt();
		Product ar[] = new Product[count];
		for(int i=0;i<ar.length;i++){
			System.out.println("Enter the PID");
			int pid = sc.nextInt();
			System.out.println("Enter the Price");
			int price = sc.nextInt();
			System.out.println("Enter the Quantity");
			int quantity =sc.nextInt();
			if(max < price){
				max=price;
			}
			Product p = new Product(pid,price,quantity);
			ar[i] = p;
			
		}
		for(Product a : ar){
			System.out.println(a.pid+ "  "+a.price+"  "+a.quantity);
		}
		System.out.println("Highest price pid: "+max);
		System.out.println("Total amount spent oon all products : "+Product.totalAmount(ar));
	}
}