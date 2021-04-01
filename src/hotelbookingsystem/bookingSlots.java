package hotelbookingsystem;

import java.util.ArrayList;

public class bookingSlots extends HotelBookingSystem {

    static String[] room1Times = new String[3];
    static String[] room2Times = new String[3];
    static String[] room3Times = new String[3];
    static String[] room4Times = new String[3];
    static String[] room5Times = new String[3];

    static int slotCount = 0;
    static int output = 0;
    static boolean finished = false;
    static public ArrayList<String> foodOrdered = new ArrayList<>();
    static String roomSlot;
    static boolean room1Booked = false;
    static boolean room2Booked = false;
    static boolean room3Booked = false;
    static boolean room4Booked = false;
    static boolean room5Booked = false;
    static String userEmail;
    static String surname;
    static String roomID;
    static String resourcesWanted;
    static ArrayList<String> resources = new ArrayList<>();
    static ArrayList<String> refreshments = new ArrayList<>();
    static int deliveryCount = 0;
    static String deliveryTime;

    static boolean roomCorrectlyBooked = false;
    static boolean canBook = true;

    public static void bookingRooms() {
        System.out.println("Welcome to booking a room");
        System.out.println("We provide 5 room capacitys:");
        System.out.println("Room 1 : 2 people (no disabled access)");
        System.out.println("Room 2 : 4 people (no disabled access)");
        System.out.println("Room 3 : 8 people (no disabled access)");
        System.out.println("Room 4 : 15 people (disabled access)");
        System.out.println("Room 5 : 50 people (no disabled access)");
        System.out.println("");

        if (slotCount == 0) {
            room1Times[0] = "1.Morning";
            room1Times[1] = "2.Afternoon";
            room1Times[2] = "3.All day";
            room2Times[0] = "1.Morning";
            room2Times[1] = "2.Afternoon";
            room2Times[2] = "3.All day";
            room3Times[0] = "1.Morning";
            room3Times[1] = "2.Afternoon";
            room3Times[2] = "3.All day";
            room4Times[0] = "1.Morning";
            room4Times[1] = "2.Afternoon";
            room4Times[2] = "3.All day";
            room5Times[0] = "1.Morning";
            room5Times[1] = "2.Afternoon";
            room5Times[2] = "3.All day";
        }

        while (true) {
            resources.clear();
            refreshments.clear();

            System.out.println("Which room would you like to book?");

            if (room1Booked == false) {
                System.out.println("1. Room 1");
            } else {
                System.out.println("Booked");
            }
            if (room2Booked == false) {
                System.out.println("2. Room 2");
            } else {
                System.out.println("Booked");
            }
            if (room3Booked == false) {
                System.out.println("3. Room 3");
            } else {
                System.out.println("Booked");
            }
            if (room4Booked == false) {
                System.out.println("4. Room 4");
            } else {
                System.out.println("Booked");
            }
            if (room5Booked == false) {
                System.out.println("5. Room 5");
            } else {
                System.out.println("Booked");
            }

            int userChoice = input.nextInt();

            switch (userChoice) {
                case 1:

                    if (room1Times[0].equals("Booked") && room1Times[1].equals("Booked")) {
                        System.out.println("Sorry all the slots for Room 1 are booked");
                        room1Booked = true;
                        break;
                    } else {
                        canBook = true;
                        roomOne();
                        break;
                    }
                case 2:
                    if (room2Times[0].equals("Booked") && room2Times[1].equals("Booked")) {
                        System.out.println("Sorry all the slots for Room 2 are booked");
                        room2Booked = true;
                        break;
                    } else {
                        canBook = true;
                        roomTwo();
                        break;
                    }
                case 3:
                    if (room3Times[0].equals("Booked") && room3Times[1].equals("Booked")) {
                        System.out.println("Sorry all the slots for Room 3 are booked");
                        room3Booked = true;
                        break;
                    } else {
                        canBook = true;
                        roomThree();
                        break;
                    }

                case 4:
                    if (room4Times[0].equals("Booked") && room4Times[1].equals("Booked")) {
                        System.out.println("Sorry all the slots for Room 4 are booked");
                        room4Booked = true;
                        break;
                    } else {
                        canBook = true;
                        roomFour();
                        break;
                    }

                case 5:
                    if (room5Times[0].equals("Booked") && room5Times[1].equals("Booked")) {
                        System.out.println("Sorry all the slots for Room 5 are booked");
                        room5Booked = true;
                        break;
                    } else {
                        canBook = true;
                        roomFive();
                        break;
                    }

            }

            System.out.println("Finished booking?");
            String finished = input.next();

            if (finished.equalsIgnoreCase("y")) {
                break;
            }

        }
        HotelBookingSystem.menu();

    }

    public static void roomOne() {

        System.out.println("You have chosen room 1");

        System.out.println("Would you like to book the room for the:");
        for (int i = 0; i < room1Times.length; i++) {
            System.out.println(room1Times[i]);
        }
        int timeChoice = input.nextInt();

        if (room1Times[timeChoice - 1].equals("Booked") || (room1Times[timeChoice - 1]).equals("Unavailable")) {
            System.out.println("That room is booked");
            canBook = false;
        }

        if (canBook == true) {
            switch (timeChoice) {
                case 1:
                    System.out.println("You have chosen the morning");
                    room1Times[0] = "Booked";
                    room1Times[2] = "Unavailable";
                    roomSlot = "Morning";

                    break;
                case 2:
                    System.out.println("You have chosen the afternoon");
                    room1Times[1] = "Booked";
                    room1Times[2] = "Unavailable";
                    roomSlot = "Afternoon";

                    break;

                case 3:
                    System.out.println("You have chosen all day");
                    room1Times[0] = "Booked";
                    room1Times[1] = "Booked";
                    room1Times[2] = "Booked";
                    roomSlot = "All Day";
                    break;

            }

            if (room1Times[0].equals("Booked") && room1Times[1].equals("Booked")) {
                room1Booked = true;

            }

            roomID = "Room1";
            System.out.println("What is your surname?");
            surname = input.next();

            while (true) {
                System.out.println("What is your email?");
                userEmail = input.next();
                output = checkEmail();

                if (output == 0) {
                    System.out.println("that is not a correct email");
                } else {
                    break;
                }
            }

            System.out.println("Would you like any resources with your room? (y/n)");
            resourcesWanted = input.next();

            if (resourcesWanted.equalsIgnoreCase("y")) {
                resources = resourcesAvailable();
            } else {
                resources.add("No resources");
            }

            System.out.println("Would you like any refreshments with your room? (y/n)");
            String refreshmentsWanted = input.next();

            if (refreshmentsWanted.equalsIgnoreCase("y")) {
                refreshments = orderRefreshments.refreshments();

                if (roomSlot.equals("All Day")) {
                    System.out.println("When would you like your refreshments delivered? Morning (m) or Afternoon (a)");
                    String choice = input.next();

                    if (choice.equalsIgnoreCase("m")) {
                        deliveryTime = "Morning";
                    } else {
                        deliveryTime = "Afternoon";
                    }

                } else {
                    deliveryTime = roomSlot;
                }

                deliveryDetails delivery = new deliveryDetails(roomID, userEmail, deliveryTime, refreshments);
                allDeliveries.add(delivery);

            } else {
                refreshments.add("No refreshments");

            }

            rooms Room = new rooms(roomID, surname, userEmail, roomSlot, resources, refreshments, deliveryTime);

            roomsBooked.add(Room);

            

            System.out.println("Room details:");
            System.out.println(Room.toString());
            HotelBookingSystem.writingFiles(roomsBooked);

        }
    }

    public static void roomTwo() {
        System.out.println("You have chosen room 2");

        System.out.println("Would you like to book the room for the:");
        for (int i = 0; i < room2Times.length; i++) {
            System.out.println(room2Times[i]);
        }
        int timeChoice = input.nextInt();

        if (room2Times[timeChoice - 1].equals("Booked") || (room2Times[timeChoice - 1].equals("Unavailable"))) {
            System.out.println("That room is booked");
            canBook = false;
        }
        if (canBook == true) {
            switch (timeChoice) {
                case 1:
                    System.out.println("You have chosen the morning");
                    room2Times[0] = "Booked";
                    room2Times[2] = "Unavailable";
                    roomSlot = "Morning";
                    break;
                case 2:
                    System.out.println("You have chosen the afternoon");
                    room2Times[1] = "Booked";
                    room2Times[2] = "Unavailable";
                    roomSlot = "Afternoon";
                    break;

                case 3:
                    System.out.println("You have chosen all day");
                    room2Times[0] = "Booked";
                    room2Times[1] = "Booked";
                    room2Times[2] = "Booked";
                    roomSlot = "All Day";
                    break;

            }
            if (room2Times[0].equals("Booked") && room2Times[1].equals("Booked")) {
                room2Booked = true;

            }

            roomID = "Room2";
            System.out.println("What is your surname?");
            surname = input.next();

            while (true) {
                System.out.println("What is your email?");
                userEmail = input.next();
                output = checkEmail();

                if (output == 0) {
                    System.out.println("that is not a correct email");
                } else {
                    break;
                }
            }
            System.out.println("Would you like any resources with your room? (y/n)");
            resourcesWanted = input.next();

            if (resourcesWanted.equalsIgnoreCase("y")) {
                resources = resourcesAvailable();
            } else {
                resources.add("No resources");
            }
            System.out.println("Would you like any refreshments with your room? (y/n)");
            String refreshmentsWanted = input.next();

            if (refreshmentsWanted.equalsIgnoreCase("y")) {
                refreshments = orderRefreshments.refreshments();

                if (roomSlot.equals("All Day")) {
                    System.out.println("When would you like your refreshments delivered? Morning (m) or Afternoon (a)");
                    String choice = input.next();

                    if (choice.equalsIgnoreCase("m")) {
                        deliveryTime = "Morning";
                    } else {
                        deliveryTime = "Afternoon";
                    }

                } else {
                    deliveryTime = roomSlot;
                }

                deliveryDetails delivery = new deliveryDetails(roomID, userEmail, deliveryTime, refreshments);
                allDeliveries.add(delivery);

            } else {
                refreshments.add("No refreshments");
            }

            rooms Room = new rooms(roomID, surname, userEmail, roomSlot, resources, refreshments, deliveryTime);

            roomsBooked.add(Room);

            

            System.out.println("Room details:");
            System.out.println(Room.toString());
            HotelBookingSystem.writingFiles(roomsBooked);
        }
    }

    public static void roomThree() {
        System.out.println("You have chosen room 3");

        System.out.println("Would you like to book the room for the:");
        for (int i = 0; i < room3Times.length; i++) {
            System.out.println(room3Times[i]);
        }
        int timeChoice = input.nextInt();

        if (room3Times[timeChoice - 1].equals("Booked") || room3Times[timeChoice - 1].equals("Unavailable")) {
            System.out.println("That room is booked");
            canBook = false;
        }

        if (canBook == true) {
            switch (timeChoice) {
                case 1:
                    System.out.println("You have chosen the morning");
                    room3Times[0] = "Booked";
                    room3Times[2] = "Unavailable";
                    roomSlot = "Morning";

                    break;
                case 2:
                    System.out.println("You have chosen the afternoon");
                    room3Times[1] = "Booked";
                    room3Times[2] = "Unavailable";
                    roomSlot = "Afternoon";

                    break;
                case 3:
                    System.out.println("You have chosen all day");
                    room3Times[0] = "Booked";
                    room3Times[1] = "Booked";
                    room3Times[2] = "Unavailable";
                    roomSlot = "All Day";
                    break;

            }

            if (room3Times[0].equals("Booked") && room3Times[1].equals("Booked")) {
                room3Booked = true;

            }
            roomID = "Room3";
            System.out.println("What is your surname?");
            surname = input.next();

            while (true) {
                System.out.println("What is your email?");
                userEmail = input.next();
                output = checkEmail();

                if (output == 0) {
                    System.out.println("that is not a correct email");
                } else {
                    break;
                }
            }

            System.out.println("Would you like any resources with your room? (y/n)");
            resourcesWanted = input.next();

            if (resourcesWanted.equalsIgnoreCase("y")) {
                resources = resourcesAvailable();
            }
            System.out.println("Would you like any refreshments with your room? (y/n)");
            String refreshmentsWanted = input.next();

            if (refreshmentsWanted.equalsIgnoreCase("y")) {
                refreshments = orderRefreshments.refreshments();

                if (roomSlot.equals("All Day")) {
                    System.out.println("When would you like your refreshments delivered? Morning (m) or Afternoon (a)");
                    String choice = input.next();

                    if (choice.equalsIgnoreCase("m")) {
                        deliveryTime = "Morning";
                    } else {
                        deliveryTime = "Afternoon";
                    }

                } else {
                    deliveryTime = roomSlot;
                }

                deliveryDetails delivery = new deliveryDetails(roomID, userEmail, deliveryTime, refreshments);
                allDeliveries.add(delivery);

            } else {
                refreshments.add("No refreshments");
            }

            rooms Room = new rooms(roomID, surname, userEmail, roomSlot, resources, refreshments, deliveryTime);
            roomsBooked.add(Room);

            
            System.out.println("Room details:");
            System.out.println(Room.toString());
            HotelBookingSystem.writingFiles(roomsBooked);

        }
    }

    public static void roomFour() {
        System.out.println("You have chosen room 4");

        System.out.println("Would you like to book the room for the:");
        for (int i = 0; i < room4Times.length; i++) {
            System.out.println(room4Times[i]);
        }
        int timeChoice = input.nextInt();

        if (room4Times[timeChoice - 1].equals("Booked") || room4Times[timeChoice - 1].equals("Unavailable")) {
            System.out.println("That room is booked");
            canBook = false;
        }

        if (canBook == true) {
            switch (timeChoice) {
                case 1:
                    System.out.println("You have chosen the morning");
                    room4Times[0] = "Booked";
                    roomSlot = "Morning";

                    break;
                case 2:
                    System.out.println("You have chosen the afternoon");
                    room4Times[1] = "Booked";
                    roomSlot = "Afternoon";

                    break;
                case 3:
                    System.out.println("You have chosen all day");
                    room4Times[0] = "Booked";
                    room4Times[1] = "Booked";
                    room4Times[2] = "Booked";
                    roomSlot = "All Day";
                    break;

            }

            if (room4Times[0].equals("Booked") && room4Times[1].equals("Booked")) {
                room4Booked = true;

            }
            roomID = "Room4";
            System.out.println("What is your surname?");
            surname = input.next();

            while (true) {
                System.out.println("What is your email?");
                userEmail = input.next();
                output = checkEmail();

                if (output == 0) {
                    System.out.println("that is not a correct email");
                } else {
                    break;
                }
            }

            System.out.println("Would you like any resources with your room? (y/n)");
            resourcesWanted = input.next();

            if (resourcesWanted.equalsIgnoreCase("y")) {
                resources = resourcesAvailable();
            }
            System.out.println("Would you like any refreshments with your room? (y/n)");
            String refreshmentsWanted = input.next();

            if (refreshmentsWanted.equalsIgnoreCase("y")) {
                refreshments = orderRefreshments.refreshments();

                if (roomSlot.equals("All Day")) {
                    System.out.println("When would you like your refreshments delivered? Morning (m) or Afternoon (a)");
                    String choice = input.next();

                    if (choice.equalsIgnoreCase("m")) {
                        deliveryTime = "Morning";
                    } else {
                        deliveryTime = "Afternoon";
                    }

                } else {
                    deliveryTime = roomSlot;
                }
                deliveryDetails delivery = new deliveryDetails(roomID, userEmail, deliveryTime, refreshments);
                allDeliveries.add(delivery);

            } else {
                refreshments.add("No refreshments");
            }

            rooms Room = new rooms(roomID, surname, userEmail, roomSlot, resources, refreshments, deliveryTime);

            roomsBooked.add(Room);

            

            System.out.println("Room details:");
            System.out.println(Room.toString());
            HotelBookingSystem.writingFiles(roomsBooked);

        }
    }

    public static void roomFive() {
        System.out.println("You have chosen room 5");

        System.out.println("Would you like to book the room for the:");
        for (int i = 0; i < room5Times.length; i++) {
            System.out.println(room5Times[i]);
        }
        int timeChoice = input.nextInt();

        if (room5Times[timeChoice - 1].equals("Booked") || room5Times[timeChoice - 1].equals("Unavailable")) {
            System.out.println("That room is booked");
            canBook = false;
        }

        if (canBook == true) {
            switch (timeChoice) {
                case 1:
                    System.out.println("You have chosen the morning");
                    room5Times[0] = "Booked";
                    roomSlot = "Morning";

                    break;
                case 2:
                    System.out.println("You have chosen the afternoon");
                    room5Times[1] = "Booked";
                    roomSlot = "Afternoon";

                    break;
                case 3:
                    System.out.println("You have chosen all day");
                    room5Times[0] = "Booked";
                    room5Times[1] = "Booked";
                    room5Times[2] = "Booked";
                    roomSlot = "All Day";
                    break;

            }

            if (room5Times[0].equals("Booked") && room5Times[1].equals("Booked")) {
                room5Booked = true;

            }
            roomID = "Room5";
            System.out.println("What is your surname?");
            surname = input.next();

            while (true) {
                System.out.println("What is your email?");
                userEmail = input.next();
                output = checkEmail();

                if (output == 0) {
                    System.out.println("that is not a correct email");
                } else {
                    break;
                }
            }

            System.out.println("Would you like any resources with your room? (y/n)");
            resourcesWanted = input.next();

            if (resourcesWanted.equalsIgnoreCase("y")) {
                resources = resourcesAvailable();
            }
            System.out.println("Would you like any refreshments with your room? (y/n)");
            String refreshmentsWanted = input.next();

            if (refreshmentsWanted.equalsIgnoreCase("y")) {
                refreshments = orderRefreshments.refreshments();

                if (roomSlot.equals("All Day")) {
                    System.out.println("When would you like your refreshments delivered? Morning (m) or Afternoon (a)");
                    String choice = input.next();

                    if (choice.equalsIgnoreCase("m")) {
                        deliveryTime = "Morning";
                    } else {
                        deliveryTime = "Afternoon";
                    }

                } else {
                    deliveryTime = roomSlot;
                }
                deliveryDetails delivery = new deliveryDetails(roomID, userEmail, deliveryTime, refreshments);
                allDeliveries.add(delivery);

            } else {
                refreshments.add("No refreshments");
            }

            rooms Room = new rooms(roomID, surname, userEmail, roomSlot, resources,  refreshments, deliveryTime);
            roomsBooked.add(Room);

            

            System.out.println("Room details:");
            System.out.println(Room.toString());

            HotelBookingSystem.writingFiles(roomsBooked);

        }
    }

    public static ArrayList resourcesAvailable() {
        int resourcesCount = 0;
        boolean resourcesPicked = false;

        System.out.println("These are the resources we have available:");
        String[] allResources = new String[3];
        allResources[0] = "Pens and Paper";
        allResources[1] = "Projector";
        allResources[2] = "Whiteboard";

        while (resourcesPicked == false) {

            for (int i = 0; i < allResources.length; i++) {
                System.out.println(i + 1 + ". " + allResources[i]);

            }
            System.out.println("Enter 0 when finished");
            int userChoice = input.nextInt();

            if (userChoice == 0) {
                resourcesPicked = true;
            } else {

                if (allResources[userChoice - 1].equals("Selected")) {
                    System.out.println("You have already selected this!");

                } else {

                    switch (userChoice) {
                        case 1:
                            resources.add("Pens and Paper");
                            allResources[0] = "Selected";
                            break;
                        case 2:
                            resources.add("Projector");
                            allResources[1] = "Selected";
                            break;
                        case 3:
                            resources.add("Whiteboard");
                            allResources[2] = "Selected";
                            break;
                    }
                    resourcesCount++;
                }
            }

        }

        return resources;

    }

    public static int checkEmail() {
        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        String email = userEmail;
        Boolean b = email.matches(EMAIL_REGEX);

        if (b == true) {
            return -1;
        } else {
            return 0;
        }

//        int emailLength = userEmail.length();
//
//        String endOfEmail = userEmail.substring(emailLength - 4, emailLength);
//
//        if ((endOfEmail.equals(".com")) && (userEmail.contains("@"))) {
//            return -1;
//        } else {
//            return 0;
//        }
    }
}

//                    System.out.println("You have chosen room 3");
//                    if (room3Times[0].equals("Booked") && room3Times[1].equals("Booked")) {
//                        System.out.println("Sorry all the rooms are booked");
//                        room3Booked = true;
//                        break;
//                    }
//
//                    roomID = "Room3";
//                    System.out.println("What is your surname?");
//                    surname = input.next();
//
//                    while (true) {
//                        System.out.println("What is your email?");
//                        userEmail = input.next();
//                        output = checkEmail();
//
//                        if (output == 0) {
//                            System.out.println("that is not a correct email");
//                        } else {
//                            break;
//                        }
//                    }
//
//                    System.out.println("Would you like to book the room for the:");
//                    for (int i = 0; i < room3Times.length; i++) {
//                        System.out.println(room3Times[i]);
//                    }
//                    timeChoice = input.nextInt();
//
//                    if (room3Times[timeChoice - 1].equals("Booked")) {
//                        System.out.println("That room is booked");
//                        break;
//                    }
//
//                    switch (timeChoice) {
//                        case 1:
//                            System.out.println("You have chosen the morning");
//                            room3Times[0] = "Booked";
//                            roomSlot = "Morning";
//                            break;
//                        case 2:
//                            System.out.println("You have chosen the afternoon");
//                            room3Times[1] = "Booked";
//                            roomSlot = "Afternoon";
//                            break;
//
//                    }
//                    if (room3Times[0].equals("Booked") && room3Times[1].equals("Booked")) {
//                        room3Booked = true;
//
//                    }
//
//                    System.out.println("Would you like any resources with your room? (y/n)");
//                    resourcesWanted = input.next();
//
//                    if (resourcesWanted.equalsIgnoreCase("y")) {
//                        resources = resourcesAvailable();
//                    }
//                    break;
