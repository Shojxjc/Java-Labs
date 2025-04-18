/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 

 * @CSE 1001 Fund Software, Spring 2021

 * @Date:

 * @Description: 

 * **************************************************************************/
 import java.util.*;

public class AndOr{
 public static void main(String[] args){
   
   Scanner user = new Scanner(System.in);
   Random ran = new Random();
   int row, columun;
   System.out.println("Enter n: ");
   row = user.nextInt();
   System.out.println("Enter m: ");
   columun = user.nextInt();
   
   //num = ran.nextInt(13 - 1 + 1 ) + 1;
   
    int[][] First = new int[row][columun];
	int[][] Second = new int[row][columun];
	int[][] Third = new int[row][columun];
	int[][] Fourth = new int[row][columun];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columun; j++) {
				
				First[i][j] = ran.nextInt(1 - 0 + 1 ) + 0;
				
			}
               
		}
		
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columun; j++) {
				
				Second[i][j] = ran.nextInt(1 - 0 + 1 ) + 0;
				
			}
               
		}
		
		for (int i = 0; i < row; i++) {
            for (int j = 0; j < columun; j++) {
				if(First[i][j] == 0 || Second[i][j] == 0){
					Third[i][j] = 0;
				}else{
					Third[i][j] = 1;
				}
			}
               
		}
		
		for (int i = 0; i < row; i++) {
            for (int j = 0; j < columun; j++) {
				if(First[i][j] == 1 || Second[i][j] == 1){
					Fourth[i][j] = 1;
				}else{
					Fourth[i][j] = 0;
				}
			}
               
		}
		
		System.out.println("Frist 2d Array: ");
		System.out.println("");
		Pfunction(First);
		
		System.out.println("Second 2d Array: ");
		System.out.println("");
		Pfunction(Second);
		
		System.out.println("Third 2d Array: ");
		System.out.println("");
		Pfunction(Third);
		
		System.out.println("Fourth 2d Array: ");
		System.out.println("");
		Pfunction(Fourth);
		
		   
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
 }