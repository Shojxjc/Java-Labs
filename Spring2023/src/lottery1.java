/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 20

 * @CSE 1001 Fund Software, Spring 2021

 * @Date: 3-30-23

 * @Description: 

 * **************************************************************************/
 import java.util.Scanner;

public class lottery1{
 public static void main(String[] args){
   
   Scanner user = new Scanner(System.in);
   int numtickets;
  
   System.out.println("Enter ticket number: ");
   numtickets = user.nextInt();
   int [][] tickets = new int[numtickets][5];
   
   for(int i = 0; i < tickets.length; i++){
	   System.out.print("Enter ticket #" + (i+1) + " (5 numbers, range 1 - 99):");
	   for(int j = 0; j < 5; j++){
		   tickets[i][j] = user.nextInt();
		   
	   }
   }
		   
   System.out.println("Your tikcets are: ");
   for(int a = 0; a < tickets.length; a++){
	   System.out.print("Ticket " + (a+1) +  ": ");
	   for (int b = 0; b < 5; b ++){
		   System.out.print(tickets[a][b] + " ");
	   }
	   System.out.println(" ");
   }
   
   System.out.println("Total cost: $" + (numtickets*2));
   
  }
 }