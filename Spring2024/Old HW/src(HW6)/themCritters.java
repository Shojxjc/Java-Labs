public class themCritters {

   public char disgust;
   public int cy;
   public int cx;

   public themCritters(char c, int y, int x) {

      disgust = c;
      cy = y;
      cx = x;

   }

   public void printThemcirts(){
      System.out.println("bug " + disgust + ": at (" + cx + "," + cy + ")");
   }

}
