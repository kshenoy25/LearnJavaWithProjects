package DinosaurProfileGenerator;

public class ProfileGenerator {
    public static void main(String[] args) {

        // create a profile for your dinosaur
        // include the following
        // name
        // age
        // species
        // diet (carnivore or herbivore)
        // weight

        String myDinoName = "Vino";
        int myDinoAge = 12; // in years
        String species = "Velociraptor";
        String myDinoDiet = "Carnivore";
        double myWeight = 36; // in pounds

        System.out.println("Hi! Meet " + myDinoName + ", a " + myDinoAge + "-year-old "
                + species + ". As a " + myDinoDiet + ", " + myDinoName + " has a stellar weight of "
                + myWeight + " pounds.");

    }
}
