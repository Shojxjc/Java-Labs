import java.util.ArrayList;
import java.util.Collections;
public class Board {

   char [][] layout;
   int playerY;
   int playerX;
   int goalpY;
   int goalpX;
   boolean isTheGameDone = false;
   ArrayList<themCritters> omlrtb = new ArrayList<>();
   
   // makes the board
   public Board(char [][] c) {
      layout = c;
      for (int i = 0; i < layout.length; i++) {
         for (int r = 0; r < layout[i].length; r++) {
            char cp = layout[i][r];
            if (cp == 'T') {
               playerY = i;
               playerX = r;
            } else if(cp == 'I') {
               goalpY = i;
               goalpX = r;               
            } else if(cp != '#' && cp != ' ') {
               themCritters newthingy = new themCritters(cp, i, r);
               // newthingy.printThemcirts();
               omlrtb.add(newthingy);

            }
         }
      }
      // orgianzes the buggs
      Collections.sort(omlrtb, (p1, p2) -> Character.compare(p1.disgust, p2.disgust));
      // for(themCritters bob: omlrtb){
      //    bob.printThemcirts();
      // }
      // // ArrayList<int[]> cheats = fastestPath(playerY, playerX, goalpY, goalpX);
      // for (int[] balls : cheats){
      //    System.out.printf("(%d,%d) ", balls[1], balls[0]);
      // }
      // System.out.println();
   }

   // le movement
   public void never(){
      char attemplt = layout[playerY-1][playerX];
      if(attemplt == 'I') {
         // checks fo if at tower
         isTheGameDone = true;
         System.out.println();
         System.out.println("Tron reaches I/O Tower");
         layout[playerY][playerX] = ' ';
         printBoard();
         return;
      }
      if(attemplt != ' '){
         // checks if a move can be made
         return;
      }
      layout[playerY-1][playerX] = 'T';
      layout[playerY][playerX] = ' ';
      playerY = playerY -1;
   }  

   public void eat(){
      char attemplt = layout[playerY][playerX+1];
      if(attemplt == 'I') {
         isTheGameDone = true;
         System.out.println();
         System.out.println("Tron reaches I/O Tower");
         layout[playerY][playerX] = ' ';
         printBoard();
         return;
      }
      if(attemplt != ' '){
         return;
      }
      layout[playerY][playerX+1] = 'T';
      layout[playerY][playerX] = ' ';
      playerX = playerX + 1;

   }
   
   public void soggy(){
      char attemplt = layout[playerY+1][playerX];
      if(attemplt == 'I') {
         isTheGameDone = true;
         System.out.println();
         System.out.println("Tron reaches I/O Tower");
         layout[playerY][playerX] = ' ';
         printBoard();
         return;
      }
      if(attemplt != ' '){
         return;
      }
      layout[playerY+1][playerX] = 'T';
      layout[playerY][playerX] = ' ';
      playerY = playerY + 1;
   }

   public void waffles(){
      char attemplt = layout[playerY][playerX-1];
      if(attemplt == 'I') {
         isTheGameDone = true;
         System.out.println();
         System.out.println("Tron reaches I/O Tower");
         layout[playerY][playerX] = ' ';
         printBoard();
         return;
      }
      if(attemplt != ' '){
         return;
      }
      layout[playerY][playerX-1] = 'T';
      layout[playerY][playerX] = ' ';
      playerX = playerX -1;
   }
   // end of le movement

   public void advancegamestate() {
      // prints board moves bugg all the shin dig
      printBoard();
      System.out.println();
      for (themCritters bug : omlrtb) {
          ArrayList<int[]> shortestPath = fastestPath(bug.cy, bug.cx, playerY, playerX);
  
          System.out.printf("Bug %c: ", bug.disgust);
  
          if (shortestPath.isEmpty()) {
              System.out.println("Cannot find a path to Tron.");
              continue;
          }
  
          int [] cp = shortestPath.get(0);
          int[] fm = shortestPath.get(1);
          int deltaY = cp[1] - fm [1];
          int deltaX = cp[0] - fm[0];

          if (deltaY == 1) {
              System.out.print("l ");
          } else if (deltaY == -1) {
              System.out.print("r ");
          } else if (deltaX == 1) {
              System.out.print("u ");
          } else if (deltaX == -1) {
              System.out.print("d ");
          } else {
              System.out.println("Invalid movement.");
          }
  
          System.out.printf("%d ", shortestPath.size()-1);
  
          for (int[] position : shortestPath) {
              System.out.printf("(%d,%d) ", position[1], position[0]);
          }
  
          System.out.println("");
      }
  
      for (themCritters bug : omlrtb) {
          if (bug.cy == playerY && bug.cx == playerX) {
              isTheGameDone = true;
              System.out.println("A bug has reached Tron!");
              break;
          }
      }
  }

  // my fastates path  method
  public ArrayList<int[]> fastestPath(int startY, int startX, int goalY, int goalX) {
   int[][] distances = new int[layout.length][layout[0].length];
   boolean[][] visited = new boolean[layout.length][layout[0].length];
   int[][][] parent = new int[layout.length][layout[0].length][2]; // Store parent coordinates

   // Initialize distances to infinity
   for (int i = 0; i < layout.length; i++) {
       for (int j = 0; j < layout[i].length; j++) {
           distances[i][j] = Integer.MAX_VALUE;
       }
   }

   // Initialize priority queue manually (simple implementation)
   ArrayList<int[]> pq = new ArrayList<>();
   pq.add(new int[]{startY, startX, 0}); // Start node
   distances[startY][startX] = 0; // Distance to start node is 0

   while (!pq.isEmpty()) {
       int minDistIndex = 0;
       int minDist = Integer.MAX_VALUE;
       // Find the node with minimum distance
       for (int i = 0; i < pq.size(); i++) {
           int[] node = pq.get(i);
           if (node[2] < minDist) {
               minDist = node[2];
               minDistIndex = i;
           }
       }

       int[] curr = pq.remove(minDistIndex);
       int y = curr[0];
       int x = curr[1];
       int dist = curr[2];

       if (visited[y][x]) continue; // Skip if already visited
       visited[y][x] = true;

       // Explore neighbors prioritizing up, down, left, right
       int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
       for (int[] dir : dirs) {
           int ny = y + dir[0];
           int nx = x + dir[1];
           if (isValid(ny, nx) && layout[ny][nx] != '#' && dist + 1 < distances[ny][nx]) {
               distances[ny][nx] = dist + 1;
               pq.add(new int[]{ny, nx, dist + 1}); // Add to queue
               parent[ny][nx] = new int[]{y, x}; // Store parent coordinates
           }
       }
   }

   // Reconstruct the shortest path
   ArrayList<int[]> path = new ArrayList<>();
   int y = goalY;
   int x = goalX;
   while (y != startY || x != startX) {
       path.add(new int[]{y, x});
       int[] p = parent[y][x];
       y = p[0];
       x = p[1];
   }
   path.add(new int[]{startY, startX}); // Add start node
   Collections.reverse(path); // Reverse to get correct order
   return path;
   }

  private boolean isValid(int y, int x) {
      return y >= 0 && y < layout.length && x >= 0 && x < layout[0].length;
  }

  private final int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // Up, down, left, right


   public void printBoard() {

      System.out.print("  ");
      for(int i = 0; i < layout[0].length; i ++){
         System.out.print(i);
      }
      System.out.println();
      for (int i = 0; i < layout.length; i++) {
         System.out.print(i + " ");
         for (int r = 0; r < layout[i].length; r++) {
            if (layout[i][r] != ' ') {               
               System.out.print(layout[i][r]);
            } else {
               System.out.print(" ");
            }
         }
         System.out.println();
      }

   }



}
