import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Author: Joshua Cajuste, Jcajuste2022@my.fit.edu
 * Course: CSE 1002, Fall 2023
 * Project: Fast Food Finder
*/


public class Finder {

   record UsCities(String citystate, double lat, double lon){
   }
   // Why the F*** is the wendys input from longitude Lattiude
   // Seriously stumped me for over 3 hours
   // Abouesltely F***in stupid dude
   // Cant beilive I skipped that over when reading the lab
   record WendysLocation(double lon, double lat, String name, String addy) { 
   }

   public static void main (final String [] args)  throws Exception {

      final Scanner user = new Scanner (System.in, "US-ASCII");
      final String wendyslink = "https://introcs.cs.princeton.edu/java/data/wendys.csv";
      final String citieslink = "https://raw.githubusercontent.com/plotly/datasets/master/us-cities-top-1k.csv";
      final URL wLink = new URL(wendyslink);
      final URL cLink = new URL(citieslink);
      final ArrayList<UsCities> underflow = new ArrayList<UsCities>();
      final ArrayList<WendysLocation> overflow = new ArrayList<WendysLocation>();

      try (final InputStream cityStream = cLink.openStream()) {
         final Scanner loc = new Scanner(new InputStreamReader(cityStream));
         String header = loc.nextLine();
         header = header + "";
         while (loc.hasNextLine()) {
            // Takes in a line from CSV
            final String theStaff = loc.nextLine();
            final String [] part = theStaff.split(",");
            for (int i = 0; i < part.length; i++) {
               part[i] = part[i].replaceAll("\\s", "");
               
            }
            // Puts info into a really really really really and I mean really really big list
            final UsCities n177013 = new UsCities(part[0].toUpperCase() + "," 
                  + part[1].toUpperCase(),
                  Double.parseDouble(part[3]), Double.parseDouble(part[4]));
            underflow.add(n177013);
         }
      }

      try (final InputStream wendysStream = wLink.openStream()) {
         final Scanner wendys = new Scanner(new InputStreamReader(wendysStream));
         while (wendys.hasNext()) {
            // Takes in a line from CSV
            final String theStaff = wendys.nextLine();
            final String[] part = theStaff.split (",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
            // Same as line 47
            final WendysLocation n177013 = new WendysLocation(Double.parseDouble(part[0]), 
                                                            Double.parseDouble(part[1]), 
                                                            part[2], part[3]);
            overflow.add(n177013);
         }
      }

      while (user.hasNextLine()) {
         // Takes in the location
         final String input = user.nextLine().toUpperCase();
         final String [] broken = input.split(",");
         String urekia = "";
         String frosty = "";
         if (broken.length >= 2) {
            for (int i = 0; i < broken.length; i++) {
               broken[i] = broken[i].replaceAll("\\s", "");
               
            }
            urekia = broken[0] + "," + broken[1];
         }
         // System.out.println(urekia); 
         // debugg statement
         
         // Checks whether its an acutal location in the us
         final boolean fraud = fraudlent(urekia, underflow);
         if (fraud) {
            System.out.printf("%s %n", "???");
         } else {
            for (final UsCities usCities : underflow) { 
               // Record Searching is usefull and akinda stupid
               if (usCities.citystate.equals(urekia)) {
                  final double x = Math.toRadians(usCities.lat);
                  final double m = Math.toRadians(usCities.lon);
                  frosty = calculatoin(x, m, overflow);
                  break;
               }
            }
            // Prints out desinated input
            System.out.printf("Closet Wendy's is at address: %s%n", frosty);
         }
      }
      user.close();
   }

   public static boolean fraudlent (final String x, final ArrayList<UsCities> balls) {
      for (final UsCities usCities : balls) {
         if (usCities.citystate.equals(x)) {
            return false;
         }
      }
      // FRAUD DETECED RETURNING TRUE
      return true;
   }

   public static String calculatoin (final double x, final double m, 
                                    final ArrayList<WendysLocation> sList) {

      String yourmum = "";
      double gCD = 0.0;
      double lowScore = Double.MAX_VALUE;
      final double earthRadiusKm = 6371.0;
      for (final WendysLocation wendysLocation : sList) {
         final double y = Math.toRadians(wendysLocation.lat);
         final double n = Math.toRadians(wendysLocation.lon);
         final double aLD = Math.abs(m - n);
         gCD = Math.acos(Math.sin(x) * Math.sin(y)
         + (Math.cos(x) * Math.cos(y) * Math.cos(aLD)));
         gCD = earthRadiusKm * gCD;
         // System.out.println(gCD);

         if (gCD < lowScore) {
            // System.out.print(lowScore + " > ")
            // System.out.println(gCD);
            lowScore = gCD;
            yourmum = wendysLocation.addy;
         }
         gCD = 0.0;
      }

      return yourmum;
   }
}
