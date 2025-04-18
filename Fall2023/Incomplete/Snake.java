public class Snake {

   public static void main(String[] args) {

      string balls = "nice cock";
      StdDraw.setScale(-2, +2);
      StdDraw.enableDoubleBuffering();
  
      for (double t = 0.0; true; t += 0.02) {
          double x = Math.sin(t);
          double y = Math.cos(t);
          StdDraw.clear();
          StdDraw.filledCircle(x, y, 0.05);
          StdDraw.filledCircle(-x, -y, 0.05);
          StdDraw.show();
          StdDraw.pause(20);
      }
      
   }
   
}
