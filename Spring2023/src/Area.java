/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 21

 * @CSE 1001 Fund Software, Spring 2021

 * @Date:4/4/2023

 * @Description: 

 * **************************************************************************/
 import java.util.*;

public class Area{
 public static void main(String[] args){
   
   Scanner user = new Scanner(System.in);
   int height, base, width, radius;
   String shape;
   System.out.println("Would you like to calculate the area of a circle, triangle, or rectangle: ");
   shape = user.nextLine();
   shape = shape.toUpperCase();
   
   switch(shape){
	   case "CIRCLE":
	   System.out.println("Enter the radius: ");
	   radius = user.nextInt();
	   System.out.println("Total area: " + circle(radius) + " square inches");
	   break;
	   case "TRIANGLE":
	   System.out.println("Enter the base: ");
	   base = user.nextInt();
	   System.out.println("Enter the height: ");
	   height = user.nextInt();
	   System.out.println("Total area: " + triangle(base,height) + " square inches");
	   break;
	   case "RECTANGLE":
	   System.out.println("Enter the height: ");
	   height = user.nextInt();
	   System.out.println("Enter the width: ");
	   width = user.nextInt();
	   System.out.println("Total area: " + rectangle(height,width) + " square inches");
	   break;
   }	     
  }
  
  public static double circle(int x){
	  return (Math.PI * (x*x));
  }
  public static double triangle(int x, int y){
	  return ((x/2) * y);
  }
  public static double rectangle(int x, int y){
	  return (x*y);
  }
 }