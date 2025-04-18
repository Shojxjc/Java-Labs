/**************************************************************************

 * @by: Joshua Cajute

 * @Lab: 

 * @CSE 1001 Fund Software, Spring 2021

 * @Date:

 * @Description: 

 * **************************************************************************/
import java.util.Scanner;

public class Vowel{
 public static void main(String[] args){
   Scanner user = new Scanner(System.in);
   String userline;
   char CI;
   int u;
   
   
   System.out.println("Enter a statement");
   userline = user.nextLine();
   userline = userline.toUpperCase();
   
   for(int i = 0; i <= userline.length()-1; i++){
	u = i;  
	CI = userline.charAt(u);
	switch(CI){
	 case 'A':
	  System.out.println(CI + " is a vowel");
	 break;
	 case 'B':
	  System.out.println(CI + " is a consonant");
	 break;
	 case 'C':
	  System.out.println(CI + " is a consonant");
	 break;
	 case 'D':
	  System.out.println(CI + " is a consonant");
	 break;
	 case 'E':
	  System.out.println(CI + " is a vowel");
	 break;
	 case 'F':
	  System.out.println(CI + " is a consonant");
	 break;
	 case 'G':
	  System.out.println(CI + " is a consonant");
	 break;
	 case 'H':
	  System.out.println(CI + " is a consonant");
	 break;
	 case 'I': 
	  System.out.println(CI + " is a vowel");
	 break;
	 case 'J':
	  System.out.println(CI + " is a consonant");
	 break;
	 case 'K':
	  System.out.println(CI + " is a consonant");
	 break;
	 case 'L':
	  System.out.println(CI + " is a consonant");
	 break;
	 case 'M':
	  System.out.println(CI + " is a consonant");
	 break;
	 case 'N':
	  System.out.println(CI + " is a consonant");
	 break;
	 case 'O':
	  System.out.println(CI + "  is a vowel");
	 break;
	 case 'P':
	  System.out.println(CI + " is a consonant");
	 break;
	 case 'Q':
	  System.out.println(CI + " is a consonant");
	 break;
	 case 'R':
	  System.out.println(CI + "is a consonant");
	 break;
	 case 'S':
	  System.out.println(CI + " is a consonant");
	 break;
	 case 'T':
	  System.out.println(CI + " is a consonant");
	 break;
	 case 'U':
	  System.out.println(CI + " is a vowel");
	 break;
	 case 'V':
	  System.out.println(CI + " is a consonant");
	 break;
	 case 'W':
	  System.out.println(CI + " is a consonant");
	 break;
	 case 'X':
	  System.out.println(CI + " is a consonant");
	 break;
	 case 'Y':
	  System.out.println(CI + " is a consonant");
	 break;
	 case 'Z': 
	  System.out.println(CI + "is a consonant");
	 break;
	 default:
      System.out.println(CI + " is some other character");
	 break;	
   }   
   
  }
 }
}