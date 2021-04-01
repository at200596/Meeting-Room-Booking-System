package hotelbookingsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class orderRefreshments extends bookingSlots {

    static String[] allRefreshments = new String[5];
    static boolean refreshmentsPicked = false;
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> refreshments = new ArrayList<>();
    static int refreshmentsCount = 0;
    

    public static ArrayList refreshments() {
        refreshmentsCount = 0;
        refreshmentsPicked = false;

        allRefreshments[0] = "Water";
        allRefreshments[1] = "Coffee";
        allRefreshments[2] = "Bagels";
        allRefreshments[3] = "Sandwiches";
        allRefreshments[4] = "Pastries";

        while (refreshmentsPicked == false) {
            System.out.println("These are the refreshments we have available:");
            for (int i = 0; i < allRefreshments.length; i++) {
                System.out.println(i + 1 + ". " + allRefreshments[i]);
            }

            System.out.println("Please enter the number of the refreshments you would like");
            System.out.println("Enter 0 when finished");
            int userChoice = input.nextInt();

            if (userChoice == 0) {
                refreshmentsPicked = true;
            } else {
                if (allRefreshments[userChoice - 1].equals("Selected")) {
                    System.out.println("You have already selected this!");

                } else {
                    switch (userChoice) {
                        case 1:
                            allRefreshments[0] = "Selected";
                            refreshments.add("Water");
                            break;
                        case 2:
                            allRefreshments[1] = "Selected";
                            refreshments.add("Coffee") ;
                            break;
                        case 3:
                            allRefreshments[2] = "Selected";
                            refreshments.add("Bagels");
                            break;
                        case 4:
                            allRefreshments[3] = "Selected";
                            refreshments.add("Sandwiches");
                            break;
                        case 5:
                            allRefreshments[4] = "Selected";
                            refreshments.add("Pastries");
                            break;
                    }
                }
            }

        }

        return refreshments;

    }

//    public static String[] resourcesAvailable() {
//        int resourcesCount = 0;
//        boolean resourcesPicked = false;
//
//        System.out.println("These are the resources we have available:");
//        String[] allResources = new String[3];
//        allResources[0] = "Pens and Paper";
//        allResources[1] = "Projector";
//        allResources[2] = "Whiteboard";
//
//        while (resourcesPicked == false) {
//
//            System.out.println("1. " + allResources[0]);
//            System.out.println("2. " + allResources[1]);
//            System.out.println("3. " + allResources[2]);
//            System.out.println("Enter 0 when finished");
//            int userChoice = input.nextInt();
//
//            if (userChoice == 0) {
//                resourcesPicked = true;
//            } else {
//
//                if (allResources[userChoice - 1].equals("Selected")) {
//                    System.out.println("You have already selected this!");
//
//                } else {
//
//                    switch (userChoice) {
//                        case 1:
//                            resources[0] = "Pens and Paper";
//                            allResources[0] = "Selected";
//                            break;
//                        case 2:
//                            resources[resourcesCount] = "Projector";
//                            allResources[1] = "Selected";
//                            break;
//                        case 3:
//                            resources[resourcesCount] = "Whiteboard";
//                            allResources[2] = "Selected";
//                            break;
//                    }
//                }
//            }
//
//        }
//
//        return resources;
//
//    }
}
