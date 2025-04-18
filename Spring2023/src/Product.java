/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 16

 * @CSE 1001 Fund Software, Spring 2021

 * @Date: 3 - 7 -23

 * @Description: 

 * **************************************************************************/
 import java.util.Scanner;

public class Product{
 public static void main(String[] args){
   
   Scanner user = new Scanner(System.in);
   String choice;
   int num1, num2, mun;
   boolean run;
   System.out.println("Would you like to multiply?");
   choice = user.nextLine();
   choice = choice.toUpperCase();
   mun = 0;
   if(choice.equals("YES")
	   ){
	   run = true;
   }else{
	 run = false;  
   }
   
	while(run){
	System.out.println("Enter a intger: ");
	num1 = user.nextInt();
	System.out.println("Enter a intger: ");
	num2 = user.nextInt();
	
	for(int i = 1; i <= num2; i++){
	 mun = mun + num1;
	}
	
	System.out.println(num1 + " x " + num2 + " = " + mun);
	System.out.println("Would you like to multiply?");
	String R = user.next();
	if (!R.equalsIgnoreCase("YES")) {
      run = false;
    }
	}
  }
 }