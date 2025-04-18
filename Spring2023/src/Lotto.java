/**************************************************************************

 * @By: Joshua Cajuste
 * @Lab: 11

 * @CSE 1001 Fund Software, Spring 2021

 * @Date: 2-16-23

 * @Description: 

 * **************************************************************************/

import java.util.Scanner;

public class Lotto{
 public static void main(String[] args){
  Scanner user = new Scanner(System.in);
  
  System.out.println("Please enter 3 interger");

  int x, y, z;

  x = user.nextInt();
  y = user.nextInt();
  z = user.nextInt();

  if(x == y || x == z || y == z){
   if(x == y && x == z){
    System.out.println("$100");
   }else{
     System.out.println("$50");
    }
  }else{
    System.out.println("$0");
  }
 }
}
