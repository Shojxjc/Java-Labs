/*
*hey hey hey
*Author:  Iam Joshua Cajuste, jcajuste2022@my.fit.edu
* Course:  CSE 1002, Fall 2023
* Project: mystery
*
*/
 import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CurrentDateInSpanish {
    public static void main(String[] args) {
        // Create a Date object to represent the current date and time
        Date currentDate = new Date();

        // Create a SimpleDateFormat object with the desired Spanish date format
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss", new Locale("es", "ES"));

        // Format the current date in Spanish
        String formattedDate = sdf.format(currentDate);

        // Print the formatted date
        System.out.println("Fecha y hora actual en español: " + formattedDate);
    }
}

