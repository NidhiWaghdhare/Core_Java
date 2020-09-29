<<<<<<< HEAD
/*51.	Create a program that helps banks to maintain records. It should have following facilities.
 o Anybody can create current or saving account with following initial information: account number, name, balance, and branch.
 o display account detail for a particular accounts.
 o display total money deposited in bank.
 o allow deposit and  withdrawal in an account 
 . o for saving account opening balance and minimum balance must be 5000.
 o for current account opening balance and minimum balance must be 1000.
 o can not withdraw the amount from the account that makes balance less than the minimum balance. */
 
 import java.util.*;
 class Bank{
	 static int ano=1000;
	 static double totalBal;
	 String name;
	 char type;
	 String accNo;
	 double balance;
	 public Bank(String name,char type,double balance){
		 this.name=name;
		 this.type=type;
		 this.balance=balance;
		 this.accNo=type+" "+ano;
		 totalBal+=balance;
		 ano++;
	 }
	 
	 void deposit(double amt){
		 balance +=amt;
		 totalBal+=amt;
		 System.out.println(toString());
	 }
	 void withdraw(double amt){
		 double minBal=0;
		 if(this.type == 'c'){
			 minBal=1000;
		 }
		 if(this.type == 's'){
			 minBal=5000;
		 }
		 double temp=balance- amt;
		 if(temp > minBal){
			 balance -=amt;
			 totalBal -=amt;
		 }
		 else{
			 System.out.println("Insufficient balance");
		 }
		  System.out.println(toString());
	 }
	 @Override
	 public String toString(){
		 return "Bank[name=" +name+ ", type=" + type + ",accNo= " + accNo + ",balance=" +balance + "]";
	 }
 }
 
 public class Question51{
	 public static void main(String args[]){
		 Bank[] arr = new Bank[2];
		 Scanner sc = new Scanner(System.in);
		 for(int i=0;i<arr.length;i++){
			 System.out.println("Enter name");
			 String name = sc.next();
			  System.out.println("Enter Account type(C/S) ");
			 char type = sc.next().charAt(0);
			 
			  System.out.println("Enter Amount");
				double balance = sc.nextDouble();
				if(type=='c' && balance < 1000.00){
					 System.out.println("current account balance must be above 1000rs");
					 i--;
					 continue;
				}
				if(type=='s' && balance < 5000.00){
					 System.out.println("savings account balance must be above 5000rs");
					 i--;
					 continue;
				}
				Bank b=new Bank(name,type,balance);
				arr[i]=b;
			 
		 }
		 
		 while(true){
			 System.out.println("Want to Withdraw (Y/N)");
			 char ch=sc.next().charAt(0);
			 if(ch=='y'){
				 System.out.println("Enter Acc No:: ");
				 String an = sc.next();
				 for(int i=0;i<arr.length;i++){
					 if(arr[i].accNo==an){
						 System.out.println("Enter Amount");
						 double d = sc.nextDouble();
						 arr[i].withdraw(d);
					 }
				 }
			 }
			 else{
				 break;
			 }
		 }
		 System.out.println("Total Bank Balance :: "+Bank.totalBal);
	 }
=======
/*51.	Create a program that helps banks to maintain records. It should have following facilities.
 o Anybody can create current or saving account with following initial information: account number, name, balance, and branch.
 o display account detail for a particular accounts.
 o display total money deposited in bank.
 o allow deposit and  withdrawal in an account 
 . o for saving account opening balance and minimum balance must be 5000.
 o for current account opening balance and minimum balance must be 1000.
 o can not withdraw the amount from the account that makes balance less than the minimum balance. */
 
 import java.util.*;
 class Bank{
	 static int ano=1000;
	 static double totalBal;
	 String name;
	 char type;
	 String accNo;
	 double balance;
	 public Bank(String name,char type,double balance){
		 this.name=name;
		 this.type=type;
		 this.balance=balance;
		 this.accNo=type+" "+ano;
		 totalBal+=balance;
		 ano++;
	 }
	 
	 void deposit(double amt){
		 balance +=amt;
		 totalBal+=amt;
		 System.out.println(toString());
	 }
	 void withdraw(double amt){
		 double minBal=0;
		 if(this.type == 'c'){
			 minBal=1000;
		 }
		 if(this.type == 's'){
			 minBal=5000;
		 }
		 double temp=balance- amt;
		 if(temp > minBal){
			 balance -=amt;
			 totalBal -=amt;
		 }
		 else{
			 System.out.println("Insufficient balance");
		 }
		  System.out.println(toString());
	 }
	 @Override
	 public String toString(){
		 return "Bank[name=" +name+ ", type=" + type + ",accNo= " + accNo + ",balance=" +balance + "]";
	 }
 }
 
 public class Question51{
	 public static void main(String args[]){
		 Bank[] arr = new Bank[2];
		 Scanner sc = new Scanner(System.in);
		 for(int i=0;i<arr.length;i++){
			 System.out.println("Enter name");
			 String name = sc.next();
			  System.out.println("Enter Account type(C/S) ");
			 char type = sc.next().charAt(0);
			 
			  System.out.println("Enter Amount");
				double balance = sc.nextDouble();
				if(type=='c' && balance < 1000.00){
					 System.out.println("current account balance must be above 1000rs");
					 i--;
					 continue;
				}
				if(type=='s' && balance < 5000.00){
					 System.out.println("savings account balance must be above 5000rs");
					 i--;
					 continue;
				}
				Bank b=new Bank(name,type,balance);
				arr[i]=b;
			 
		 }
		 
		 while(true){
			 System.out.println("Want to Withdraw (Y/N)");
			 char ch=sc.next().charAt(0);
			 if(ch=='y'){
				 System.out.println("Enter Acc No:: ");
				 String an = sc.next();
				 for(int i=0;i<arr.length;i++){
					 if(arr[i].accNo==an){
						 System.out.println("Enter Amount");
						 double d = sc.nextDouble();
						 arr[i].withdraw(d);
					 }
				 }
			 }
			 else{
				 break;
			 }
		 }
		 System.out.println("Total Bank Balance :: "+Bank.totalBal);
	 }
>>>>>>> ae468cf60ee122f27d44e0ed45e48a119273508f
 }