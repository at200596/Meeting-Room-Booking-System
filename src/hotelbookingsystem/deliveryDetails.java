
package hotelbookingsystem;

import java.util.ArrayList;


public class deliveryDetails {
    private String roomID;
    private String email;
    private String deliveryTime;
    private ArrayList<String> refreshments = new ArrayList<>();

    public deliveryDetails(String roomID, String email, String deliveryTime, ArrayList refreshments) {
        this.roomID = roomID;
        this.email = email;
        this.deliveryTime = deliveryTime;
        this.refreshments = refreshments;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public ArrayList getRefreshments() {
        return refreshments;
    }

    public void setRefreshments(ArrayList refreshments) {
        this.refreshments = refreshments;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    @Override
    public String toString() {
        return "deliveryDetails{" + "roomID=" + roomID + ", email=" + email + ", deliveryTime=" + deliveryTime + ", refreshments=" + refreshments + '}';
    }
    

    
    
    
    
    
    
}
