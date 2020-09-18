//20.	Print all prime numbers between two given numbers. [ break continue ]
import java.util.*;
class Question20{
				public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Starting range:");
				int low = sc.nextInt();
				System.out.println("Enter Ending range:");
				int high = sc.nextInt();
        while (low < high) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");

            ++low;
        }
    }
        }
					

