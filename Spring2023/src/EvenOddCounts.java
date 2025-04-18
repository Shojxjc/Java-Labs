/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 13

 * @CSE 1001 Fund Software, Spring 2021

 * @Date:2-23-2023

 * @Description: tells wheter an interger is even or odd

 * **************************************************************************/
 import java.util.Scanner;

public class EvenOddCounts{
 public static void main(String[] args){
   Scanner user = new Scanner(System.in);
   int num;
   int Evencount = 0;
   int Oddcount = 0;
  
    System.out.println("Enter a non-negative integer: ");
    num = user.nextInt(); 
    System.out.println("Loop Started");
	
    while (num != -1) {
        System.out.println("You entered : " + num);
		if(num%2 == 0){
		System.out.println("Number " + num + " is even");
		Evencount++;
		}else{
		System.out.println("Number " + num + " is odd");
		Oddcount++;
		}
        System.out.println("Enter another non-negative integer: ");
        num = user.nextInt();        
    }
    System.out.println("Loop Ended");
	System.out.println("Total number of even numbers: " + Evencount);
	System.out.println("Total number of odd numbers: " + Oddcount);
   
   
  }
 }