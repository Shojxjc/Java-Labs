/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 

 * @CSE 1001 Fund Software, Spring 2021

 * @Date:

 * @Description: 

 * **************************************************************************/
 import java.util.Scanner;
 import java.util.Random;

public class DrawCard{
 public static void main(String[] args){
   Scanner user = new Scanner(System.in);
   Random ran = new Random();
   int suite, num;
   String Num = " ";
   String Suite = " ";
   
   suite = ran.nextInt(4 - 1 + 1 ) + 1;
   num = ran.nextInt(13 - 1 + 1 ) + 1;
   
   switch(suite){
	   case 1:
	   Suite = "Clubs";
	   break;
	   case 2:
	   Suite = "Diamonds";
	   break;
	   case 3:
	   Suite = "Hearts";
	   break;
	   case 4:
	   Suite = "Spades";
	   break;
	   
   }
   
   switch(num){
	   case 1:
	   Num = "Ace";
	   break;
	   case 2:
	   Num = "Two";
	   break;
	   case 3:
	   Num = "Three";
	   break;
	   case 4:
	   Num = "Four";
	   break;
	   case 5:
	   Num = "Five";
	   break;
	   case 6:
	   Num = "Six";
	   break;
	   case 7:
	   Num = "Seven";
	   break;
	   case 8:
	   Num = "Eight";
	   break;
	   case 9:
	   Num = "Nine";
	   break;
	   case 10:
	   Num = "Ten";
	   break;
	   case 11:
	   Num = "Jack";
	   break;
	   case 12:
	   Num = "Queen";
	   break;
	   case 13:
	   Num = "King";
	   break;
	   
	   
   }
   
   System.out.println(Num + " of " + Suite);
   
   
   
  }
 }