import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read a string of text
        System.out.println("Enter a string of text:");
        String text= scanner.nextLine();

        // Prompt for and read an integer with validation
        System.out.println("Enter an integer:");
        int integer;
        while (true) {
            try {
                integer = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer:");
            }
        }

        // Prompt for and read a double with validation
        System.out.println("Enter a double:");
        double doubleInput;
        while (true) {
            try {
                doubleInput = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid double:");
            }
        }

        // Prompt for and read a boolean with validation
        System.out.println("Enter a boolean value (true/false):");
        boolean booleanValue;
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                booleanValue = Boolean.parseBoolean(input);
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid boolean value (true/false):");
            }
        }

        System.out.println("Your string is " + text);

        System.out.println("Your integer is " + integer);

        System.out.println("Your double is " + doubleInput);

        System.out.println("Your boolean is " + booleanValue);

        scanner.close();

    }
}
