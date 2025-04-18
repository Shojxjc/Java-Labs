/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 18

 * @CSE 1001 Fund Software, Spring 2021

 * @Date:3-21-23

 * @Description: 

 * **************************************************************************/
 import java.util.Scanner;

public class ArrayEquals1{
 public static void main(String[] args){
 
 Scanner user = new Scanner(System.in);
 int size1, size2, input, compare;
 compare = 0;
   
   System.out.println("Enter first list length : ");
   size1 = user.nextInt();
   int[] A = new int[size1];
   System.out.println("Enter the first list : ");
   for(int i = 0; i < size1; i++){   
	input= user.nextInt();
	A[i] = input;
   }
   
   
   System.out.println("Enter Second list length : ");
   size2 = user.nextInt();
   int[] B = new int[size2];
   System.out.println("Enter the Second list : ");
   for(int i = 0; i < size2; i++){
	input= user.nextInt();
	B[i] = input;
   }
   
   if(A.length != B.length){
	   System.out.println("The list are not equal"); 
	   System.exit(0);
   }
   
   
   for(int i = 0; i < size1; i++){
	   if(A[i] == B[i]){
		   compare++;
	   }
   }
   
   if(compare == size2){
	 System.out.println("The list are equal");  
   }else {
	  System.out.println("The list are not equal"); 
   }
   
   
  }
 }