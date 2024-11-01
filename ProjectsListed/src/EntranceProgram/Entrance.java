package EntranceProgram;

public class Entrance {
    // create a program that simulates a sign at the entrance of Mesozoic Eden
    // the sign is simulated by printing output to the console
    // the sign should display a welcome message, the opening and closing hours
    // and a short safety message

    public static void main(String[] args) {
        System.out.println("Welcome to Mesozoic Eden!");
        String openingHours = "10:00 AM";
        String closingHours = "10:00 PM";

        System.out.println("We open at " + openingHours + " and close at " + closingHours + ".");
        System.out.println("Please be safe :)");
    }
}