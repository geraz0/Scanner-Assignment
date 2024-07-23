import java.util.Scanner;

public class Superhero {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the hero's name
        System.out.println("Let's write a story about a superhero.");
        System.out.println("Who is the hero of our story?");
        String heroName= scanner.nextLine();

        // Prompt the user for the hero's superpower
        System.out.println("What is their superpower?");
        String superPower = scanner.nextLine();

        // Output the story using the gathered inputs
        System.out.println("Here is the story:");
        System.out.println("There once was a superhero named " + heroName + " ,who had the power of " + superPower + ".");
        System.out.println("As they grew older, " + heroName + " saw that the world needed them.");
        System.out.println(heroName + " used their ability to " + superPower + " to save the world.");

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}

