//14.	Program to check that entered year is a leap year or not.

import java.util.Scanner;
public class Question14 {
   public static void main(String[] args){
      int year;
      System.out.println("Enter an Year :: ");
      Scanner sc = new Scanner(System.in);
      year = sc.nextInt();

      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println(" Leap year");
      else
         System.out.println("Not a Leap year");
   }
}
