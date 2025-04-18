/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 

 * @CSE 1001 Fund Software, Spring 2021

 * @Date:

 * @Description: 

 * **************************************************************************/
 import java.util.*;

public class nrFibonacci{
 public static void main(String[] args){
   int answer = 0;
   Scanner user = new Scanner(System.in);
   System.out.println("Enter an integer: ");
   answer = nonRecursiveFib(user.nextInt());
   System.out.println(answer);
   
  }
   public static int nonRecursiveFib(int n) {
        if (n == 1)
           return 0;
        else if (n == 2)
           return 1;
        else {
           int a, b, c;
           a = 0;
           b = 1;
		   c = 0;
           for (int i=3; i<=n; i++) {
               c = a+b;
               a = b;
               b = c;
           }
           return c;
        }
 }
}