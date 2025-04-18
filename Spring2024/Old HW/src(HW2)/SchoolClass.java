public class SchoolClass {

   public String name;
   public itsTime [] times = new itsTime[20];
   public itsTime trueTime = null;


   public SchoolClass(String [] inputs) {

      // intalizes class names and possible times
      name = inputs[0];
      for (int i = 1; i < inputs.length; i++) {
         if(inputs[i].length() == 7) {
            String days = inputs[i].substring(0,3);
            String timing = inputs[i].substring(3);
            itsTime coming = new itsTime(days, timing);
            times[i-1] = coming;
         } else {
            String days = inputs[i].substring(0,2);
            String timing = inputs[i].substring(2);
            itsTime coming = new itsTime(days, timing);
            times[i-1] = coming;
         }
      }

      // if on time is provided becaomes the abouslte time 
      if (timesize() == 1) {
         trueTime = times[0];
      }

   }

   public SchoolClass(String nname, itsTime p){

      // for copying purposes
      name = nname;
      trueTime = p;

   }

   // returns how many potenial times a course has
   public int timesize() {
      int i = 0;
      while(times[i] != null) {
         i++;
      }
      return i;
   }

   // returns a spefic time accorinding to i which is the index
   public itsTime timeIndex(int i){

      return times[i];

   }

   // unsed
   // public boolean overlap(SchoolClass contender) {
   //    return false;
   // }

   // formates and prints out  the class name and prints out all possbile times 
   public void printToString() {
      if(name == null) {
         return;
      }
      System.out.print(name + " ");
      for(itsTime penis : times) {
         if(penis == null) {
            System.out.println();
            return;
         }
         penis.printTime();
      }
      System.out.println();
   }

   // same as above but with the true time instead of all possible times
   public void printToStringWithTTime() {
      if(name == null) {
         return;
      }
      System.out.print(name + " " + trueTime.day + trueTime.trueTime);
      
      System.out.println();
   }

}
