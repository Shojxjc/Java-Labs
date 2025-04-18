/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 13

 * @CSE 1001 Fund Software, Spring 2021

 * @Date: 2- 23-2023

 * @Description: provides multiples up tp 10 of number given by user

 * **************************************************************************/
 import java.util.Scanner;

public class Multiples{
 public static void main(String[] args){
   Scanner user = new Scanner(System.in);
   int num, mun, prod;
   
   System.out.println("Enter an non-negative integer: ");
   num = user.nextInt();
   while(num >=1){
	 System.out.println("Please enter a non-negative number");
	 num = user.nextInt();
   }   
   System.out.println("Number of multiples: ");
   mun = user.nextInt();
   
   for (int i = 0; i < mun+1; i++){
	prod = num*i;
    System.out.println(num + " x " + i + " = " + prod); 
   }
   
   
  }
 }