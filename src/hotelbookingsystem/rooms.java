package hotelbookingsystem;

import java.util.ArrayList;

public class rooms {

    private String roomID;
    private String surname;
    private String email;
    private String timeBooked;
    private ArrayList<String> resources = new ArrayList<>();

    private ArrayList<String> refreshments = new ArrayList<>();
    private String deliveryTime;

    public rooms(String roomID, String surname, String email, String timeBooked, ArrayList resources, ArrayList refreshments, String deliveryTime) {
        this.roomID = roomID;
        this.surname = surname;
        this.email = email;
        this.timeBooked = timeBooked;
        this.resources = resources;
        this.refreshments = refreshments;
        this.deliveryTime = deliveryTime;

    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getTimeBooked() {
        return timeBooked;
    }

    public void setTimeBooked(String timeBooked) {
        this.timeBooked = timeBooked;
    }

    public ArrayList getResources() {
        return resources;
    }

    public void setResources(ArrayList resources) {
        this.resources = resources;
    }

    

    public ArrayList getRefreshments() {
        return refreshments;
    }

    public void setRefreshments(ArrayList refreshments) {
        this.refreshments = refreshments;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    @Override
    public String toString() {
        return roomID + ", " + surname + ", " + email + ", " + timeBooked + ", " + resources + ", " + refreshments + ", " + deliveryTime;
    }

}
