/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 

 * @CSE 1001 Fund Software, Spring 2021

 * @Date:

 * @Description: 

 * **************************************************************************/
 import java.util.*;

public class LiquidVolume {
 public static void main(String[] args){
   
   Scanner user = new Scanner(System.in);
   int cups, rcups, gallons, quarts, pints;
   System.out.println("Enter an interger between 1 and 99: ");
   cups = user.nextInt();
   
   System.out.println(cups + " cups is: ");
   
   rcups = cups;
   gallons = cups/16;
   cups = cups%16;
   quarts = cups/4;
   cups = cups%4;
   pints = cups/2;
   cups = cups%2;
   
   System.out.println(gallons + " gallons");
   System.out.println(quarts + " quarts");
   System.out.println(pints + " pints");
   System.out.println(cups + " cups");
   
   
  }
 }