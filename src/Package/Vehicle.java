
package Package;


public class Vehicle {
    
    protected float id;
    public String color, tradeMark;
    private float speed;

    public Vehicle(float id, String color, String tradeMark, float speed) {
        this.id = id;
        this.color = color;
        this.tradeMark = tradeMark;
        this.speed = speed;
    }

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
    
    
    
    
    
    
}
