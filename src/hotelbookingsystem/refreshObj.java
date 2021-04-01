
package hotelbookingsystem;


public class refreshObj {
    private int deliveryID;
    private String deliveryTime;
    private String[] refreshments;

    public refreshObj(int deliveryID, String deliveryTime, String[] refreshments) {
        this.deliveryID = deliveryID;
        this.deliveryTime = deliveryTime;
        this.refreshments = refreshments;
    }

    public int getDeliveryID() {
        return deliveryID;
    }

    public void setDeliveryID(int deliveryID) {
        this.deliveryID = deliveryID;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String[] getRefreshments() {
        return refreshments;
    }

    public void setRefreshments(String[] refreshments) {
        this.refreshments = refreshments;
    }

    @Override
    public String toString() {
        return "refreshObj{" + "deliveryID=" + deliveryID + ", deliveryTime=" + deliveryTime + ", refreshments=" + refreshments + '}';
    }
    
    
    
    
}
