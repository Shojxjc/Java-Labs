/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 13

 * @CSE 1001 Fund Software, Spring 2021

 * @Date:2-23-2023

 * @Description: tells wheter an interger is even or odd

 * **************************************************************************/
 import java.util.Scanner;

public class Odd{
 public static void main(String[] args){
   Scanner user = new Scanner(System.in);
   int num;
   
    System.out.println("Enter a non-negative integer: ");
    num = user.nextInt(); 
    System.out.println("Loop Started");
	
    while (num != -1) {
        System.out.println("You entered : " + num);
		if(num%2 == 0){
		System.out.println("Number " + num + " is even");
		}else{
		System.out.println("Number " + num + " is odd");
		}
        System.out.println("Enter another non-negative integer: ");
        num = user.nextInt();        
    }
    System.out.println("Loop Ended");
   
   
  }
 }