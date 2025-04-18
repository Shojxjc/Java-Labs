/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 13

 * @CSE 1001 Fund Software, Spring 2021

 * @Date:2-23-2023

 * @Description: tells if a number is even or odd

 * **************************************************************************/

import java.util.Scanner;

public class Even{
 public static void main(String[] args){
   
   Scanner user = new Scanner(System.in);
   int num, con;
   
   System.out.println("Enter a number: ");
   num = user.nextInt();
   con = num%2;
   
   if(con == 0){
    System.out.println("Number " + num + " is even");
   }else{
    System.out.println("Number " + num + " is odd");
   }
  
   
  }
 }