import java.util.Scanner;

public class Main {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in); // Initialize the input reader

        System.out.println("Please enter your name:");
        String name = scanner.nextLine(); // Read a text line into a variable

        System.out.println("Please enter your age:");
        int age = scanner.nextInt(); // Read a real number into a variable

        // Create an object of type Person
        Person person = new Person(name,age);

        System.out.println(person.printPerson());
    }
}
