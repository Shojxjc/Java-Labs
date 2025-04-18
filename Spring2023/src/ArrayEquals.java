/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 18

 * @CSE 1001 Fund Software, Spring 2021

 * @Date:3-21-23

 * @Description: 

 * **************************************************************************/
 import java.util.Scanner;

public class ArrayEquals{
 public static void main(String[] args){
 
 Scanner user = new Scanner(System.in);
 int size, input, compare;
 compare = 0;
   
   System.out.println("Enter list length : ");
   size = user.nextInt();
   int[] A = new int[size];
   System.out.println("Enter the first list : ");
   for(int i = 0; i < size; i++){
	input= user.nextInt();
	A[i] = input;
   }
   
   int[] B = new int[size];
   System.out.println("Enter the Second list : ");
   for(int i = 0; i < size; i++){
	input= user.nextInt();
	B[i] = input;
   }
   
   
   for(int i = 0; i < size; i++){
	   if(A[i] == B[i]){
		   compare++;
	   }
   }
   
   if(compare == size){
	 System.out.println("The list are equal");  
   }else {
	  System.out.println("The list are not equal"); 
   }
   
   
  }
 }