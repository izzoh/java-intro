import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Initialize the input reader
        System.out.println("Please enter your name:");
        String author = scanner.nextLine(); // Read a text line into a variable
        int number; // Initialize the variable outside the loop

        do { // Do the following code
            System.out.println("Please enter a number:");
            number = scanner.nextInt(); // Read a real number into a variable

            /*
             * Make sure the age is above 0 and below 110
             * */

            if (number > 18 && number < 111) {
                System.out.println("Hello " + author + " the age is above 18 years");
            } else if (number < 18 && number > 0) {
                System.out.println("Hello " + author + " the age is below 18 years");
            } else if (number == 18) {
                System.out.println("Hello " + author + " the age is 18");
                System.out.println("Hello " + author + " you were born in:"+getYear(number));
            } else if (number == -1) {
                System.out.println("Exiting");
            } else {
                System.out.println("Number should be between 1-110");
            }
        } while (number != -1); // Until this condition is met
    }


    private static int getYear(int age){
        Date date = new Date(); // Get today's date
        Calendar calendar = Calendar.getInstance(); // Get a calender object
        calendar.setTime(date); // Set the calendar date to today

        int year = calendar.get(Calendar.YEAR); // Get the current year

        int birthYear = year - age; // Find the birth year based on age

        return birthYear;
    }
}
