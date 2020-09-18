//18.	Program to check whether number is prime or not.

import java.util.*;
class Question18{
				public static void main(String args[]){
				Scanner sc =  new Scanner(System.in);
				System.out.println("Enter any number");
				int num = sc.nextInt();
				int f=0;
				for(int i=2;i<=num/2;i++){
					if(num%i==0)
					{
							f=1;
							break;
					}
				}
				if(f==1){
					System.out.println("It is  Not  Prime");
				}
				else
				{
					System.out.println("It is Prime");
				}
					
				}
	
}