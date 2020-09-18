//06.	Write a program that takes radius of a circle as input. Read the entered radius using Scanner class.
// Then calculate and print the area and circumference of the circle.

import java.util.Scanner;
class Question6{
				public static void main(String srgs[]){
					Scanner r=new Scanner(System.in);
					System.out.println("Enter the radius of a Circle:");
					int rad = r.nextInt();
					float PI=3.14F;
					//Area of Circle
					float area = 2*PI*rad*rad;
					System.out.println("Area of Circle is "+area);
					//Circumference of Circle
					float Circumfernce=2*PI*rad;
					System.out.println("Circumference of Circle is "+Circumfernce);
					
				}
}