
package Package;


public class House {
    
    public String direction, color;
    protected float phoneNumber;

    public House(String direction, String color, float phoneNumber) {
        this.direction = direction;
        this.color = color;
        this.phoneNumber = phoneNumber;
    }

    public float getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(float phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
    
}
