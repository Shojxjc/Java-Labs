/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 20

 * @CSE 1001 Fund Software, Spring 2021

 * @Date: 3-30-23

 * @Description: 

 * **************************************************************************/
 import java.util.Scanner;
 import java.util.Random;
 import java.util.Arrays;

 public static void main(String[] args){
   
   Scanner user = new Scanner(System.in);
   Random ran = new Random();
   int numtickets;
   System.out.println("Enter ticket number: ");
   numtickets = user.nextInt();
   int [][] tickets = new int[numtickets][5];
   
   for(int a = 0; a < tickets.length; a++){
	   System.out.print("Enter ticket #" + (a+1) + " (5 numbers, range 1 - 99):");
	   for(int b = 0; b < 5; b++){
		   tickets[a][b] = user.nextInt();
		   
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
   I
   System.out.println("The winning ticket is : ");nt(99 - 
   
   int[] win = {(ran.nextInt(99 - 1 + 1 ) + 1), (ran.next1 + 1 ) + 1), (ran.nextInt(99 - 1 + 1 ) + 1), (ran.nextInt(99 - 1 + 1 ) + 1), (ran.nextInt(99 - 1 + 1 ) + 1)};
   for(int i = 0; i < 5; i ++){
	   System.out.print(win[i] + " ");
   
   }
   
   for(int a = 0; a < tickets.length; a ++){
   Arrays.sort(win);
	   Arrays.sort(tickets[a]);
  }
   }
	   
 }   
