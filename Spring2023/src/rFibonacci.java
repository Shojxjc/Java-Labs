/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 

 * @CSE 1001 Fund Software, Spring 2021

 * @Date:

 * @Description: 

 * **************************************************************************/
 import java.util.*;

public class rFibonacci{
 public static void main(String[] args){
   int answer = 0;
   Scanner user = new Scanner(System.in);
   System.out.println("Enter an integer: ");
   answer = fib(user.nextInt());
   System.out.println(answer);
   
  }
  
  public static int fib(int n){
	if(n ==1){
		return 0;
	}else if(n==2){
		return 1;
	}else{
		return fib(n-1) + fib(n-2);
  }
 }
}
