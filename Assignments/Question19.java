//19.	Calculate  series : 12+22+32+42+.........+n2

import java.util.*;
public class Question19{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n= sc.nextInt();
		int num=2;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			num+=10;
			if(i==n-1)
			{
				System.out.print(num);
				break;
			}
			System.out.print(num+"+");
		}
	}
}