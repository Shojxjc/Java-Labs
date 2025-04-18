/*
*hey hey hey
*Author:  Iam Joshua Cajuste, jcajuste2022@my.fit.edu
* Course:  CSE 1002, Fall 2023
* Project: mystery
*
*/
import java.util.Scanner;

public class Grades {
   public static void main (final String[] args) 0{
   
      final Scanner user = new Scanner (System.in, "US-ASCII");
      final int tc = user.nextInt();
      double[][] studentsheet = new double [tc][2];
      String fauder;
      double score;
      double mean = 0;
      String grade;
      

      for (int i = 0; i < tc; i++) {
         
         fauder = user.next();
         fauder = user.next();
         score = user.nextDouble();
         studentsheet[i][0] = score;
         mean = mean + score;
         
      }
      mean = mean/tc;

      double squaredDifferencesSum = 0;
      for (int i = 0; i < tc; i++) {
         squaredDifferencesSum += Math.pow(studentsheet[i][0] - mean, 2);
      }

      // Calculate the variance (average of squared differences)
      double variance = squaredDifferencesSum / tc;

      // Calculate the standard deviation (square root of variance)
      double standardDeviation = Math.sqrt(variance);


      System.out.println("Mean: " + mean);
      System.out.println("Variance: " + variance);
      System.out.println("Standard Deviation: " + standardDeviation);

      for (int i = 0; i < tc; i++) {
         studentsheet[i][1] = (studentsheet[i][0] - mean) / standardDeviation;
      }

      System.out.printf("%9s %9s %9s %n", "Score", "Z", "Grade");
      for (int i = 0; i < tc; i++) {
         if (studentsheet[i][1] >= 1) {
            grade = "A";
         } else if (studentsheet[i][1] >= 0) {
            grade = "B";
         } else if (studentsheet[i][1] >= -1) {
            grade = "C";
         } else if (studentsheet[i][1] >= -2) {
            grade = "D";
         } else {
            grade = "F";
         }
         System.out.printf("%9d %9.2f %9s %n", (int) studentsheet[i][0], studentsheet[i][1], grade);
      }
   }
}