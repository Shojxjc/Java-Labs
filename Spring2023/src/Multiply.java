/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 

 * @CSE 1001 Fund Software, Spring 2021

 * @Date:

 * @Description: 

 * **************************************************************************/
import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = in.nextInt();

        System.out.print("Enter a number: ");
        int b = in.nextInt();

        int result = recursiveMultiply(a, b);

        System.out.print(a + " x " + b + " = " + result);

    }

    public static int recursiveMultiply(int a, int b) {
        if (a ==0 || b == 0)
            return 0;

        return a + recursiveMultiply(a,b-1);
    }
}