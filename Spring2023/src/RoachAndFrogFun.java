/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 14

 * @CSE 1001 Fund Software, Spring 2021

 * @Date: 2-28-2023

 * @Description: Roaches and frogs yuck

 * **************************************************************************/
 import java.util.Scanner;


public class RoachAndFrogFun{
 public static void main(String[] args) { 
  Scanner keyboard = new Scanner(System.in);
  
  System.out.println("Enter the Growth rate of the roachs: ");
  double R_GROWTH_RATE = keyboard.nextDouble();
  System.out.println("Enter the One Bug volume of the roachs: ");
  double ONE_BUG_VOLUME = keyboard.nextDouble();
  
  
  System.out.println("Enter the Reproductive rate of the frogs: ");
  double F_GROWTH_RATE = keyboard.nextDouble();
  System.out.println("Enter the Volume of an individual frog: ");
  double ONE_Frog_VOLUME = keyboard.nextDouble();
  
  System.out.println("Enter Number of roaches per week that an individual frog can consume");
  double Consume = keyboard.nextDouble();
  
  double houseVolume, R_population, F_population, totalBugVolume, totalFrogVolume;
  System.out.print("Enter total house volume (cubic feet):");        
  houseVolume = keyboard.nextDouble();
  System.out.print("Enter initial number of roaches:");
  R_population = keyboard.nextDouble();
  System.out.print("Enter initial number of Frogs:");
  F_population = keyboard.nextDouble();
  System.out.println();
  System.out.println("House volume:" + houseVolume + " cubic feet");
  System.out.println("Initial Roach population:" + R_population);
  System.out.println("Initial Frog population:" + F_population);   
  System.out.println();
  totalBugVolume = R_population * ONE_BUG_VOLUME;
  totalFrogVolume = F_population * ONE_Frog_VOLUME;
  
  int countWeeks = 0;
  totalBugVolume = R_population * ONE_BUG_VOLUME;
  totalFrogVolume = F_population * ONE_Frog_VOLUME;
  
  while (totalBugVolume + totalFrogVolume < houseVolume) {
   F_population = F_population + (F_GROWTH_RATE * F_population);
   totalFrogVolume = F_population * ONE_Frog_VOLUME;

   R_population = (R_population + (R_GROWTH_RATE * R_population))- (Consume * F_population);
   if(R_population < 0){
	 R_population = 0;  
   }
   totalBugVolume = R_population * ONE_BUG_VOLUME;
   
   countWeeks = countWeeks + 1;
   
   
   System.out.println("It is week " + countWeeks);
   System.out.println("there are " + R_population + " roaches currently");
   System.out.println("The roaches have a volume of" + totalBugVolume);
   System.out.println("there are " + F_population + " Frogs currently");
   System.out.println("The Frogs have a volume of " + totalFrogVolume);
  }
  
  System.out.println("The house will be filled in " + countWeeks + " weeks.");
  System.out.println("There will be " + (int)R_population + " roaches.");
  System.out.println("There will be " + (int)F_population + " Frogs.");
  System.out.println("They will fill " + (int)(totalBugVolume+totalFrogVolume) + " cubic feet.");
}
}