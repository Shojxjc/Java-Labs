/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 

 * @CSE 1001 Fund Software, Spring 2021

 * @Date:

 * @Description: 

 * **************************************************************************/
 import java.util.*;

public class prefix{
 public static void main(String[] args){
   
   Scanner user = new Scanner(System.in);
   String word, base;
   System.out.println("Enter a word with a prefix: ");
   word = user.nextLine();
   System.out.println("Enter base word: ");
   base = user.nextLine();
   
   System.out.println("Prefix is " + word.substring(0, word.indexOf(base)));   
   
   
  }
 }