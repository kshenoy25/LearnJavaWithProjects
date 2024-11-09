package DinoTracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Dinosaur {
    String name;
    int age;
    String species;
    int enclosure;

    public Dinosaur(String name, int age, String species, int enclosure) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.enclosure = enclosure;
    }
}

public class DinoTrackerNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Dinosaur> dinosaurs = new ArrayList<>();

        // Populating the list with user input for names and species
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name for Dinosaur " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter species for Dinosaur " + (i + 1) + ": ");
            String species = scanner.nextLine();

            int age = (i + 1) * 2;  // Sample age data
            int enclosure = i + 1;

            dinosaurs.add(new Dinosaur(name, age, species, enclosure));
            System.out.println(); // Print a blank line for readability
        }

        // Displaying the details
        System.out.println("\nDinosaur Details:");
        for (Dinosaur dino : dinosaurs) {
            System.out.println("Name: " + dino.name + ", Age: " + dino.age + ", Species: " + dino.species + ", Enclosure: " + dino.enclosure);
        }

        // Calculating and displaying average age
        int totalAge = 0;
        for (Dinosaur dino : dinosaurs) {
            totalAge += dino.age;
        }
        double averageAge = (double) totalAge / dinosaurs.size();
        System.out.println("\nAverage age: " + averageAge);

        scanner.close(); // Closing the scanner after use
    }
}