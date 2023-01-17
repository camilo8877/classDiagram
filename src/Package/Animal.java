
package Package;


public class Animal {
    
    public String gender, color, kind;
    private String food;

    public Animal(String gender, String color, String kind, String food) {
        this.gender = gender;
        this.color = color;
        this.kind = kind;
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
    
    
    
    
}
