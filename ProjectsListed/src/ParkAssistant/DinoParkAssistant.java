package ParkAssistant;

import java.util.Scanner;

public class DinoParkAssistant {
    // input from the user
    Scanner scanner = new Scanner(System.in);

    // initialize arrays to store dinosaur information
    String[] dinoName = new String[10];
    int[] dinoAges = new int[10];
    int[] dinoWeights = new int[10];
    int dinoCount = 0;

    public static void main(String[] args) {

        DinoParkAssistant dinoAssistant = new DinoParkAssistant();
        dinoAssistant.start();
    }
    // main loop for the application & it will keep running until user decides to exit
    public void start(){
        while(true){
            displayMenu();
            int choice = scanner.nextInt();
            handleMenuChoice(choice);
        }
    }

    public void displayMenu(){
        System.out.println("Welcome to DinoParkAssistant");
        System.out.println("1. Add Dino");
        System.out.println("2. Check Park Hours");
        System.out.println("3. Greet Gust");
        System.out.println("4. Check Visitor Count");
        System.out.println("5. Manage Staff");
        System.out.println("6. Exit");
        System.out.println("Enter your choice: ");
    }
    public void handleMenuChoice(int choice){
        switch(choice){
            case 1:
                addDinosaur();
                break;
                case 2:
                    checkParkHours();
                    break;
                    case 3:
                        // greetGuest();
                        break;
                        case 4:
                            // checkVisitorCount();
                            break;
                            case 5:
                                // manageStaff();
                                break;
                                case 6:
                                    System.out.println("Exiting...");
                                    System.exit(0);
        }
    }
    public void addDinosaur(){
        if (dinoCount >= 10){
            System.out.println("The park is at full capacity. No more dinos can be added.");
            return;
        }
        scanner.nextLine();
        System.out.println("Enter the name of the dinosaur: ");
        dinoName[dinoCount] = scanner.nextLine();
        System.out.println("Enter the age of the dinosaur: ");
        dinoAges[dinoCount] = scanner.nextInt();
        System.out.println("Enter the weight of the dinosaur: ");
        dinoWeights[dinoCount] = scanner.nextInt();
        dinoCount++;

        System.out.println(dinoName[dinoCount -1] + " has been added to the park!");
    }
    public void checkParkHours(){
        // assuming the park is open from 8 am to 6 pm
        int currentHour = java.time.LocalTime.now().getHour();
        if (currentHour >= 8 && currentHour <= 18){
            System.out.println("The park is currently open.");
        }
        else{
            System.out.println("The park is currently closed.");
        }
    }
}
