/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 

 * @CSE 1001 Fund Software, Spring 2021

 * @Date:

 * @Description: 

 * **************************************************************************/
 import java.util.*;

public class Locate{
 public static void main(String[] args){
   
   Scanner user = new Scanner(System.in);
   String Search = args[0];
   System.out.print("Enter word: ");
   String word = user.nextLine();
   String temp;
   int remove = word.length();
   System.out.println("First" + finding(Search,word));
   temp = Search.substring(Search.indexOf(word) + remove);
   System.out.println(temp);
   
   System.out.println("Second" + finding(temp,word));
   temp = temp.substring(Search.indexOf(word) + remove +1 );
   System.out.println(temp);
   
   System.out.println("Third" + finding(temp,word));
   temp = Search.substring(Search.indexOf(word) + remove);
   
   
   
  }
  
  public static String finding(String x, String y){
	  String result = " ";
	  int Io = x.indexOf(y);
	  result = " Occurrence - Position " + Io;
	  return result;
  }
 }