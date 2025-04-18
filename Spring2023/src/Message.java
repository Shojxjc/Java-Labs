/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 21

 * @CSE 1001 Fund Software, Spring 2021

 * @Date: 4/4/2023

 * @Description: 

 * **************************************************************************/
 import java.util.Scanner;

public class Message{
 public static void main(String[] args){
   
   Scanner user = new Scanner(System.in);
   String message;
   int num;
   
   System.out.println("Enter message: ");
   message = user.nextLine();
   System.out.println("Enter number: ");
   num = user.nextInt();
   OutputMessage(message, num);
  
   
  }
  
  public static void OutputMessage(String x, int y){
	
	for (int i = 0; i < y; i++){
		System.out.println(x);
	}
	
  }
 }