/*03.	Find the result of following expressions. You need to determine the primitive data type of the variable by looking carefully the given expression
 and initialize variables by any random value.
A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]
*/

class Question3{
				public static void main(String args[]){
					int x=2;
					//A. y = x2 + 3x - 7 (print value of y) 
					int y= x*2+3*x-7;
					System.out.println("Value of Y is " +y);
					//B. y = x++ + ++x (print value of x and y) 
					y= x++ + ++x;
					System.out.println("Value of x is "+x+ " Value of y is " + y);
					//C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
					int z = x++ - --y - --x  +  x++;
					System.out.println("Value of X is "+x+" Value of Y is "+y+" Value of Z is "+z);
					//D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]
				}
}