/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 17

 * @CSE 1001 Fund Software, Spring 2021

 * @Date: 3 - 9 -2023

 * @Description: 

 * **************************************************************************/
 import java.util.Scanner;

public class Numbers{
 public static void main(String[] args){
   Scanner user = new Scanner(System.in);
   int arraysize;
   double sum, product;
   double mean, AD;
   sum = 0;
   product = 1;
   AD = 0;
   
   
   
   System.out.println("How many values: "); 
   arraysize = user.nextInt();
   int[] hello = new int[arraysize];
   
   System.out.println("Enter values: ");
   for(int i = 0; i < hello.length; i ++){
	   hello[i] = user.nextInt();
   }
      System.out.print(" The values input were: " );
   
   
   for(int i = 0; i < hello.length; i ++){
	   System.out.print(hello[i] + " ");
	   sum = sum + hello[i];
	   product = product * hello[i];
   }
   System.out.println(" ");
   mean = sum/hello.length;
   
   for(int i = 0; i < hello.length; i ++){
	   AD = AD + Math.abs(hello[i] - mean);
   }
   AD = AD/hello.length;
	
   System.out.println("Sum is : " + sum);
   System.out.println("Product is : " + product);
   System.out.println("Mean is : " + mean);
   System.out.println("Average distance from the mean : " + AD);
  }
 }