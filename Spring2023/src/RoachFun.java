/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 14

 * @CSE 1001 Fund Software, Spring 2021

 * @Date: 2-28-2023

 * @Description: Roaches everywhere

 * **************************************************************************/
 import java.util.Scanner;


public class RoachFun{
 public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);
  System.out.println("Enter the Growth rate of the roachs: ");
  double GROWTH_RATE = keyboard.nextDouble();
  System.out.println("Enter the One Bug volume of the roachs: ");
  double ONE_BUG_VOLUME = keyboard.nextDouble();
  double houseVolume, population, totalBugVolume;
  System.out.print("Enter total house volume (cubic feet):");        
  houseVolume = keyboard.nextDouble();
  System.out.print("Enter initial number of roaches:");
  population = keyboard.nextDouble();
  System.out.println();
  System.out.println("House volume:" + houseVolume + " cubic feet");
  System.out.println("Initial population:" + population);       
  System.out.println();
  totalBugVolume = population * ONE_BUG_VOLUME;
  
  int countWeeks = 0;
  totalBugVolume = population * ONE_BUG_VOLUME;
  while (totalBugVolume < houseVolume) {
   population = population + (GROWTH_RATE * population);
   totalBugVolume = population * ONE_BUG_VOLUME;
   countWeeks = countWeeks + 1;
   System.out.println("there are " + population + " roaches currently");
   System.out.println("The oraches have a volume of" + totalBugVolume);
   System.out.println("It is week " + countWeeks);
  }
  
  System.out.println("The house will be filled in " + countWeeks + " weeks.");
  System.out.println("There will be " + (int)population + " roaches.");
  System.out.println("They will fill " + totalBugVolume + " cubic feet.");
}
}