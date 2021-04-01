package hotelbookingsystem;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HotelBookingSystem {
    //hotelBooking
    
    static String folderDirectory = System.getProperty("user.dir") + "/meetingRoomDetails.txt";
    static Scanner input = new Scanner(System.in);
    static String[] roomsAvailable = new String[5];
    static int count = 0;
    static int choice = 0;
    static ArrayList<rooms> roomsBooked = new ArrayList<>();
    static ArrayList<refreshObj> refreshBooked = new ArrayList<>();
    static int deliveryID = 123;
    static ArrayList<deliveryDetails> allDeliveries = new ArrayList<>();

    public static void main(String[] args) {

        if (count == 0) {
            roomsAvailable[0] = "1. Room 1";
            roomsAvailable[1] = "2. Room 2";
            roomsAvailable[2] = "3. Room 3";
            roomsAvailable[3] = "4. Room 4";
            roomsAvailable[4] = "5. Room 5";
        }

        menu();

    }

    public static void menu() {
        
        //password for deliveries: hotelDeliveries89$
        //password for cleaning staff: cleaningTimes301@
        

        System.out.println(folderDirectory);
        System.out.println("---------------------------------------------");
        System.out.println("**********Welcome to Ailise's Meeting Rooms**********");
        System.out.println("How can I help you today?");
        System.out.println("1 - Book a Room");
        System.out.println("2 - View my Room");
        System.out.println("3 - Delivery Staff");
        System.out.println("4 - Cleaning Staff");
        System.out.println("0 - Exit");
        int userChoice = input.nextInt();

        switch (userChoice) {
            case 1:
                bookingSlots.bookingRooms();
                break;
            case 2:
                viewingRoom();
                break;
            case 3:
                deliveryStaff();
                break;
            case 4:
                cleaningStaff();
                break;
            case 0:
                break;
        }

    }

    public static void viewingRoom() {

        if (roomsBooked.isEmpty()) {
            System.out.println("No rooms have been booked");
        } else {
            int output = searchForRoom();

            if (output == -1) {
                System.out.println("Sorry we could not find the room you are searching for");
            } else {
                System.out.println(roomsBooked.get(output));

            }
        }
        menu();

    }

    public static int searchForRoom() {

        System.out.println("Please enter your email address");
        String userEmail = input.next();

        System.out.println("Please enter your surname");
        String userLName = input.next();

        for (int i = 0; i < roomsBooked.size(); i++) {
            if ((userEmail.equalsIgnoreCase(roomsBooked.get(i).getEmail())) && (userLName.equalsIgnoreCase(roomsBooked.get(i).getSurname()))) {
                return i;
            }

        }
        return -1;
    }

    public static void writingFiles(ArrayList<rooms> roomsBooked) {

        try {
            FileWriter writeToFile = new FileWriter(folderDirectory, true);
            PrintWriter printToFile = new PrintWriter(writeToFile);
            for (int i = 0; i < roomsBooked.size(); i++) {
                printToFile.println(roomsBooked.get(i).toString());
                printToFile.println("hi");
            }
            printToFile.close();
            writeToFile.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }

    public static void deliveryStaff() {
        while (true) {
            System.out.println("Please enter the password in order to view deliveries");
            String enterPassword = input.next();

            if (enterPassword.equals("hotelDeliveries89$")) {
                System.out.println("Correct Password");
                if (allDeliveries.isEmpty()) {
                    System.out.println("There are no deliveries");
                    break;
                } else {
                    System.out.println("Here are all the deliveries needed:");
                    for (int i = 0; i < allDeliveries.size(); i++) {
                        System.out.println(allDeliveries.get(i));

                    }
                }
                break;
            } else {
                System.out.println("Incorrect Password");
                System.out.println("Try again? y/n");
                String choice = input.next();
                if (choice.equalsIgnoreCase("n")) {
                    break;
                }
            }
        }
        menu();
    }

    public static void cleaningStaff() {
        while (true) {
            System.out.println("Please enter the password in order to view cleaning schedule");
            String enterPassword = input.next();

            if (enterPassword.equals("cleaningTimes301@")) {
                System.out.println("Correct Password");
                if (roomsBooked.isEmpty()) {
                    System.out.println("No rooms have been booked");
                } else {
                    System.out.println("Here is the rooms that require cleaning:");
                    for (int i = 0; i < roomsBooked.size(); i++) {
                        System.out.println(roomsBooked.get(i).getRoomID() + ", " + roomsBooked.get(i).getTimeBooked());
                    }
                }
                break;
            } else {
                System.out.println("Incorrect Password");
                System.out.println("Try again? y/n");
                String choice = input.next();
                if (choice.equalsIgnoreCase("n")) {
                    break;
                }
            }
        }
        menu();

    }

//    public static ArrayList<rooms> readingFiles() {
//
//        ArrayList<rooms> roomList = new ArrayList<>();
//        String lineFromFile;
//        try {
//            BufferedReader read = new BufferedReader(new FileReader(folderDirectory));
//            while ((lineFromFile = read.readLine()) != null) {
//                String[] roomDetails = lineFromFile.split(", ");
//
//                rooms a = new rooms(roomDetails[0], roomDetails[1], roomDetails[2], roomDetails[3], roomDetails[4], roomDetails[5], roomDetails[6], roomDetails[7]);
//                roomsBooked.add(a);
//            }
//            read.close();
//
//        } catch (Exception e) {
//            System.out.println("Error: " + e);
//        }
//        return roomsBooked;
//    }
}
