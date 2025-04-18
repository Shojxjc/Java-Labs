import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Setting up scanner
        
        System.out.println("Select a product to purchase:");
        System.out.println("    1 - book $15");
        System.out.println("    2 - bag  $5");
        System.out.println("    3 - ball $10");
        System.out.println("    4 - cancel");
        System.out.print("Select an option: ");
        
        int option = in.nextInt();
        in.close(); // Close scanner when done using it

        int total = 0;

        if (option == 1) {
            total += 15;                     // What is += ? Ask the GSA if you can't figure it out!
        } else if (option == 2){
            total += 5;
        } else if (option == 3){
            total += 10;
        } else if (option == 4){
            System.out.print("Unknown option: " + option);
            System.exit(0); // Exit program 
        } else {
            System.exit(0); // Exit program 
        }

        System.out.print("Your total is: $" + total);
    }
}