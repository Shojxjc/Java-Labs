import java.util.Scanner;

public class TrafficLight2{
 public static void main(String[] args){
  Scanner user = new Scanner(System.in);
  String light;
  int lightcase = 69;
  
  System.out.println("Enter light color : ");
  light = user.nextLine();
  light = light.toUpperCase();
   
    switch(light) {
    case "RED":
      System.out.println("Stop");
      break;
    case "YELLOW":
      System.out.println("Slow");
      break;
	case "GREEN":
	  System.out.println("Go");
	  break;
    default:
      System.out.println("Invalid output");
  }
 
 
 
 
 
  }
 }