/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 

 * @CSE 1001 Fund Software, Spring 2021

 * @Date:

 * @Description: 

 * **************************************************************************/

import java.util.Scanner;
 import java.util.Random;

public class DrawNcards1{
 public static void main(String[] args){
   Scanner user = new Scanner(System.in);
   Random ran = new Random();
   int suite, num, loopy;
   String[] Suite = {"Clubs", "Diamonds", "Hearts", "Spades"};
   String[] Num = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
   
   System.out.println("How many card would you like: ");
   loopy = user.nextInt();
   
   for(int i = 0; i < loopy; i++){
	suite = ran.nextInt(3 - 0 + 1 ) + 0;
	num = ran.nextInt(12 - 0 + 1 ) + 0;
    System.out.println(Num[num] + " of " + Suite[suite]);
   }	
      
  }
 }