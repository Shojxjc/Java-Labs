/**************************************************************************

 * @By: Joshua Cajuste
 * @Lab: 11

 * @CSE 1001 Fund Software, Spring 2021

 * @Date: 2-16-23

 * @Description: screws over kim

 * **************************************************************************/

import java.util.Scanner;

public class kim{
 public static void main(String[] args){
  Scanner user = new Scanner(System.in);
  int speed, day;

  System.out.println("Please enter the speed Kim was going");
  speed = user.nextInt();
  
  System.out.println("Please enter a 1 if its kims birthday and a 0 if it is not");
  day = user.nextInt();


  if(day == 0){

   if(speed >= 81){
    System.out.println("$200");
   }else if(speed >= 60 && speed <= 81){
    System.out.println("$100");
   }else{
    System.out.println("$01");
   }
  }

if(day == 1){

   if(speed >= 87){
    System.out.println("$200");
   }else if(speed >= 65 && speed <= 86){
    System.out.println("$100");
   }else{
    System.out.println("$0");
   }
  }
  
 }
}




