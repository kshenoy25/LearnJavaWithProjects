package NestedForLoopDinoMealPlanner;

public class DinoMealPlanner {
    public static void main(String[] args) {
        // calculate the meal portions and feeding times for each dinosaur

        int tRexMeal = 100;
        int stegMeal = 200;

        for (int time = 0; time < 24; time++) {
            if (time == 8 || time == 14 || time == 20) {
                System.out.println("It's " + time + ":00 - Feeding time for T-Rex with " + tRexMeal + "kg of food.");
            }
            if (time == 7 || time == 11 || time == 15 || time == 19) {
                System.out.println("It's " + time + ":00 - Feeding time for Stegosaurus with " + stegMeal + "kg of food.");
            }
        }
    }
}
