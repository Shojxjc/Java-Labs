/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 17

 * @CSE 1001 Fund Software, Spring 2021

 * @Date: 3 - 9 - 2023

 * @Description: 

 * **************************************************************************/
 import java.util.Scanner;

public class EvenAndOdds2{
 public static void main(String[] args){
   
   int[] myArray = { 97, 9, 52, 56, 50, 57, 52, 83, 31, 11, 93, 63, 31, 72, 52, 86, 28, 97, 70, 29, 97, 100, 99,
                68, 77, 41, 29, 90, 85, 88, 62, 43, 19, 49, 29, 77, 89, 31, 51, 53, 2, 28, 26, 95, 77, 53, 37, 35, 12,
                95, 58, 48, 15, 47, 64, 2, 34, 28, 91, 48, 49, 52, 64, 50, 19, 96, 10, 3, 63, 24, 15, 69, 29, 34, 85,
                67, 48, 19, 74, 8, 93, 62, 15, 49, 36, 91, 81, 37, 17, 88, 27, 68, 63 };
	
	int Esum, Osum, Eav, Oav, cond;
	Esum = 0;
	Osum = 0;
    
	System.out.println("Even values: ");
	for(int i = 0; i<myArray.length; i++){
		cond = myArray[i] % 2;
		if(cond == 0){
			System.out.println(myArray[i] + " is at position " + i);
			Esum = Esum + myArray[i];
		}
	}
	Eav = Esum/myArray.length;
	System.out.println("Average of even values is: " + Eav);
	System.out.println(" ");
	
	System.out.println("Odd values: ");
	for(int i = 0; i<myArray.length; i++){
		cond = myArray[i] % 2;
		if(cond == 1){
			System.out.println(myArray[i] + " is at position " + i);
			Osum = Osum + myArray[i];
		}
	}
	Oav = Osum/myArray.length;
	System.out.println("Average of odd values is: " + Oav);
	
   
  }
 }