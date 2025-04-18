/*

  Author: Joshua cajuste
  Email: Jcajuse2022@my.fit.edu
  Course: Data Structures
  Section: 23
  Description of this file: skip list fit bit

 */

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) throws IOException {

      final Path uri = Paths.get(args[0]);
      final Scanner fie = new Scanner (uri, "US-ASCII");
      SkipList am2 = new SkipList();

      while (fie.hasNextLine()) {
        String inputy = fie.nextLine();
        System.out.print(inputy + " ");
        String [] orders = inputy.split(" ");

        switch (orders[0]) {
          case "AddActivity":
            int time1 = Integer.parseInt(orders[1]);
            String Activity1 = orders[2];
            am2.put(time1, Activity1);
            System.out.println(" ");
            break;
          case "RemoveActivity":
              int time2 = Integer.parseInt(orders[1]);
              am2.remove2(time2);
              System.out.println(" ");
            break;
          case "GetActivity":
            int time3 = Integer.parseInt(orders[1]);
            if(am2.get(time3).key == time3){
              System.out.println(am2.get(time3).value);
            }else {
              System.out.println("none");
            }
            
            break;
          case "GetActivitiesBetweenTimes":
            int startTime = Integer.parseInt(orders[1]);
            int endTime = Integer.parseInt(orders[2]);
            am2.subMap(startTime, endTime);
            System.out.println();
            break;
          case "GetActivitiesForOneDay":
            int ttttime = Integer.parseInt(orders[1]);
            am2.subMapbyDay(ttttime);
            System.out.println();
            break;
          case "GetActivitiesFromEarlierInTheDay":
            Integer date = Integer.parseInt(orders[1]);
            am2.subMapto(date);
            System.out.println();
            break;
          case "PrintSkipList":
            System.out.println();
            am2.PrintSkipList();
            break;
        
          default:
            break;
        }
      }

      fie.close();
	
  }
}
