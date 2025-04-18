/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 

 * @CSE 1001 Fund Software, Spring 2021

 * @Date:

 * @Description: 

 * **************************************************************************/
import java.util.Scanner;

public class Factorial{
 public static void main(String[] args){
   Scanner user = new Scanner(System.in);
   int a, b;
   System.out.println("Enter a number");
   a = user.nextInt();
   b = 1;
   for(int i = 1; i <= a; i++){
    b = b * i;
   }

   System.out.print(a + "! is ");
   System.out.print(b + ", Which is ");
   if(b%2 == 0){
    System.out.println("even");
   }else{
    System.out.println("odd");
   }
  
   
   
  }
 }