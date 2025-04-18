/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 

 * @CSE 1001 Fund Software, Spring 2021

 * @Date:

 * @Description: 

 * **************************************************************************/
 import java.util.*;

public class Grid{
 public static void main(String[] args){
   
   Scanner user = new Scanner(System.in);
   int num;
   System.out.println("Enter n: ");
   num = user.nextInt();
   
    char[][] myArray = new char[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                myArray[i][j] = '*';
            }
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(myArray[i][j]);
            }
			System.out.println(" ");
        }
   
   
  }
 }