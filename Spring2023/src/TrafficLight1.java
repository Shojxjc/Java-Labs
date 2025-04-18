import java.util.Scanner;

public class TrafficLight1{
 public static void main(String[] args){
  Scanner user = new Scanner(System.in);
  String light;
  int lightcase = 69;
  
  System.out.println("Enter light color : ");
  light = user.nextLine();
   
    switch(light) {
    case "red":
      System.out.println("Stop");
      break;
    case "yellow":
      System.out.println("Slow");
      break;
	case "green":
	  System.out.println("go");
	  break;
    default:
      System.out.println("Invalid output");
  }
 
 
 
 
 
  }
 }