/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 

 * @CSE 1001 Fund Software, Spring 2021

 * @Date:

 * @Description: 

 * **************************************************************************/
 import java.util.*;

public class reFibonacci{
 public static void main(String[] args){
   int answer = 0;
   Scanner user = new Scanner(System.in);
   System.out.println("Enter an integer: ");
   answer = fib(user.nextInt(),0,1);
   System.out.println(answer);
   
  }
  
  public static int fib(int n, int a, int b){
	if(n ==1){
		return a;
	}else{
		return fib(n-1,b,a+b);
  }
 }
}
