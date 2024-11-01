package DinoMealPlanner;

public class DinoMealPlanner {
    public static void main(String[] args) {
        // create a dino meal planner
        // declare the weight of the dino and the proportion of its weight it needs to eat per day
        double dinoWeight = 2000; // in kilograms
        double dailyProportion = 0.5; // 5% of its body weight

        // calculate how much daily food needed
        double dailyFood = dinoWeight * dailyProportion;

        // calculate the number of feedings per day
        int feedingPerDay = 2;

        // calculate how much food needed to serve per feeding
        double foodPerFeeding = dailyFood / feedingPerDay;

        System.out.println("Our " + dinoWeight + "kg dinosaur needs to eat " + dailyFood + "kg daily, which means we need to serve " + foodPerFeeding + "kg per feeding.");



    }
}
