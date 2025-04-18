public class itsTime {


   String day;
   String trueTime;
   int startTime;
   int endTime;

   public itsTime(String d, String x) {
      // splits String into the days and times 
      day = d;
      trueTime = x;
      startTime = Integer.parseInt(x);
        
   }

   public itsTime(itsTime p) {

      // for copying purposes
      day = p.day;
      trueTime = p.trueTime;
      startTime = p.startTime;
      endTime = p.endTime;

   }

   public int returnEndTime() {
      // cacaualtes when a class ends to easier cacualte if a class overlaps
      int returnable;
      if(day.equals("MWF")) {
         returnable = startTime + 60;
         while(returnable%100 >= 60) {
            returnable -= 60;
            returnable += 100;
         }
         return returnable;
      } else {
         returnable = startTime + 90;
         while(returnable%100 >= 60) {
            returnable -= 60;
            returnable += 100;
         }
         return returnable;
      }
      
   }

   // prints the day and time 
   public void printTime() {
      System.out.print(day + trueTime + " ");
   }

}
