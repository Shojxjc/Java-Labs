/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 

 * @CSE 1001 Fund Software, Spring 2021

 * @Date:

 * @Description: 

 * **************************************************************************/

import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int count = in.nextInt();

        recursiveCountdown(count);
    }

    public static void recursiveCountdown(int count) {

        // System.out.println("Start recursiveCountdown");

        if (count >= 0) {
           System.out.println(count);
           recursiveCountdown(count-1);
        }

        // System.out.println("End recursiveCountdown");
    }
}