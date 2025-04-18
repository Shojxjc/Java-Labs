/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 

 * @CSE 1001 Fund Software, Spring 2021

 * @Date:

 * @Description: 

 * **************************************************************************/
 import java.util.*;

public class Searches{
 public static void main(String[] args){
   
   Scanner user = new Scanner(System.in);
   Random ran = new Random();
   int al, f1, f2, searchz, ss, bs;
   
   System.out.println("Enter Array Length: ");
   al = user.nextInt();
   System.out.println("Enter Number of Searches: ");
   searchz = user.nextInt();
   int[] ohboi = new int[al];
   for(int i = 0; i < al; i++){
	   ohboi[i] = ran.nextInt(999999 - 0 + 1 ) + 0;   
   }
   Arrays.sort(ohboi);
   ss = 0;
   bs = 0;
   
   for (int i = 0; i < searchz; i++){
	   if(sequentialSearch(ohboi)){
		   ss++;
	   }
	   if(binarySearch(ohboi)){
		   bs++;
	   }
	   
   }
   
    
	System.out.println("===========================================");
	System.out.println("Peforming " + searchz + " Random Sequential Searches");
	System.out.println("Total Number of Successful Searches: " + ss);
	System.out.println("===========================================");
	System.out.println("Peforming " + searchz + " Random Binary Searches");
	System.out.println("Total Number of Successful Searches: " + bs);
   
   
  }
  
  public static boolean sequentialSearch (int [] x){
	 Random ran = new Random();
	 int y = ran.nextInt(999999 - 0 + 1 ) + 0; 
	
	for(int i = 0; i < x.length; i++){
		if(x[i] == y){
			return true;
		}
	}
	return false;
	}
  
  public static boolean binarySearch (int [] x){
	  Random ran = new Random();
	  int y = ran.nextInt(999999 - 0 + 1 ) + 0; 
	  
		int left = 0;
        int right = x.length - 1;
		int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (x[mid] == y) {
                return true;
            } else if (x[mid] < y) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false; 
  }
  
  
  public static void Pfunction(int [] x){
	   for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
		System.out.println(" ");
  }
 }