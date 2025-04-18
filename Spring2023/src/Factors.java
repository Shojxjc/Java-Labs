/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 

 * @CSE 1001 Fund Software, Spring 2021

 * @Date:

 * @Description: 

 * **************************************************************************/
 import java.util.Scanner;

public class Factors{
 public static void main(String[] args){
   
   Scanner user = new Scanner(System.in);
   int num, div;
   System.out.println("Enter a postive intger");
   num = user.nextInt();
   System. out.println("The factors are: ");
   
   for(int i = num; i >= 1; i--){
	
    if(num%i == 0){
	 div = num/i;
     System.out.println(div);	 
	}
	
   }
   
   
  }
 }