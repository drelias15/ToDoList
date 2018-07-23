import java.util.Random;
import java.util.Scanner;

public class ToDoList {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();


        String all = "";
        int lowPriority = 0;
        int mediumPriority = 0;
        int highPriority = 0;
        int itemsComplete = 0;
        int itemsNotCompleted = 0;

        String input = "";

        while(!input.equalsIgnoreCase("q")){

            int assignedPriority = rand.nextInt(3);
            String priority;
            if (assignedPriority ==0){
                priority = "low";}
            else if(assignedPriority == 1){
                priority = "medium";
            }else {
                priority = "High";
            }

            printer("Enter the item you have to do: ");
            String itemName = keyboard.next();
            printer("Enter the category of this item: ");
            String itemCategory = keyboard.next();
            printer("Your assigned priority is " + assignedPriority);
            printer("Is this item completed? (true or false): ");
            boolean isDone = keyboard.nextBoolean();

            all += itemName + "\t\t" + itemCategory + "\t\t" + priority + "\t\t" + isDone + "\n";

            switch(assignedPriority){
                case 0: lowPriority++;
                        break;
                case 1: mediumPriority++;
                        break;
                default: highPriority++;
                        break;
            }
            if (isDone==true){
                itemsComplete ++;
            }else{
                itemsNotCompleted ++;
            }


            System.out.println("Do you have another item? Enter q or quit to exit");
            input = keyboard.next();



        }
        System.out.println("\n\n" + "===============================================================" + "\n" +
                "Item Name" + "\t" + "Category" + "\t" + "Priority" + "\t" + "Done" + "\n" + all + "\n" +
                "Low-level: " + lowPriority + " Medium-Leve: " + mediumPriority + " High-Level: " + highPriority + "\n"
                    + "# of items completed: " + itemsComplete + "\n" + "# of items completed: " + itemsNotCompleted);
    }

    private static void printer (String message){
        System.out.println(message);
    }
}
