package TaskAllocationSystem;

public class TaskAllocationSystem {
    public static void main(String[] args) {
        // design a program that assigns tasks to the Mesozoic Eden employees based onb their roles
        // example such as feeding, cleaning, security
        // should decide tasks based on time, employee's role, and other factors such as park's safety rating

        String role = "Security";
        int time = 12; // current time in 24-hour format
        int safetyRating = 3; // safety rating of the park

       // use a switch case
       switch (role) {
           case "Feeding":
               if (time >=7 && time <=18) {
                   System.out.println("Time to make rounds through the park.");
               } else {
                   System.out.println("Park looks good. Go help with cleaning!");
               }
               break;
           case "Cleaning":
               System.out.println("Task is to clean different sections of the park. Throw all trash and recycle!");
               break;

           case "Security":
                   if(safetyRating < 8){
                       System.out.println("Safety alert! The park safety rating has fallen! Increase security.");
                   } else {
                       System.out.println("Your task is to ensure the parks safety.");
                   }
                   break;
           case "Tour Guiding":
               if (time >= 10 && time <= 19) {
                   System.out.println("Your task is to guide the park's visitors.");
               } else {
                   System.out.println("Park looks good. Go assist with tasks.");
               }
               break;

           default:
                   System.out.println("Unknown role");
                   break;
       }


    }
}
