/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 

 * @CSE 1001 Fund Software, Spring 2021

 * @Date:

 * @Description: 

 * **************************************************************************/
 import java.util.*;

public class AndOrWithMethods{
 public static void main(String[] args){
   
   Scanner user = new Scanner(System.in);
   int row, columun;
   System.out.println("Enter n: ");
   row = user.nextInt();
   System.out.println("Enter m: ");
   columun = user.nextInt();
   
   //num = ran.nextInt(13 - 1 + 1 ) + 1;
   
    int[][] First = RandomArray(row,columun);
	int[][] Second = RandomArray(row,columun);
				
		
		System.out.println("Frist 2d Array: ");
		System.out.println("");
		Pfunction(First);
		
		System.out.println("Second 2d Array: ");
		System.out.println("");
		Pfunction(Second);
		
		int [][] Third = AndArrays(First,Second);
		System.out.println("Third 2d Array: ");
		System.out.println("");
		Pfunction(Third);
		
		int [][] Fourth = OrArrays(First,Second);
		System.out.println("Fourth 2d Array: ");
		System.out.println("");
		Pfunction(Fourth);
		
		int [][] NFirst = NegationArray(First);
		System.out.println("\"Negation\" of the first Array: ");
		System.out.println("");
		Pfunction(NFirst);
		
		int [][] NSecond = NegationArray(Second);
		System.out.println(" \"Negation\" of the Second Array: ");
		System.out.println("");
		Pfunction(NSecond);
	
		int[][] result = OrArrays(AndArrays(First,Second),AndArrays(NegationArray(First),Second));
		System.out.println("The result of (A1 and A2) or (~A1 and A2) is:");
		System.out.println("");
		Pfunction(result);
		
		
		
		
		
		   
  }
  
  
  
  public static int[][] RandomArray(int x, int y){
	  int [][] New = new int[x][y];
	  Random ran = new Random();
	  for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
				
				New[i][j] = ran.nextInt(1 - 0 + 1 ) + 0;
				
			}
               
		}
		
		return New;
  }
  
  public static void Pfunction(int [][] x){
	   for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j]);
            }
			System.out.println(" ");
        }
				System.out.println("");
  }
	  
	  
  
   public static int[][] AndArrays(int [][] x, int[][]y){
	   
	   int r = x.length;
	   int c = x[1].length;
	   
		int[][] New = new int[r][c];
		
	    for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
				if(x[i][j] == 0 || y[i][j] == 0){
					New[i][j] = 0;
				}else{
					New[i][j] = 1;
				}
			}
               
		}
		
		return New;
  }
  
  public static int[][] OrArrays(int [][] x, int[][]y){
	   
	   int r = x.length;
	   int c = x[1].length;
	   
		int[][] New = new int[r][c];
		
	    for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
				if(x[i][j] == 1 || y[i][j] == 1){
					New[i][j] = 1;
				}else{
					New[i][j] = 0;
				}
			}
               
		}
		
		return New;
  }
  public static int[][] NegationArray(int [][] x){
	   
	   int r = x.length;
	   int c = x[1].length;
	   
		int[][] New = new int[r][c];
		
	    for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
				if(x[i][j] == 1){
					New[i][j] = 0;
				}else{
					New[i][j] = 1;
				}
			}
               
		}
		
		return New;
  }
 }