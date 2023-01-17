
package Package;

import java.util.ArrayList;


public class Fruit {
    
    public String name;
    public ArrayList<String> colors;
    private float averageWeight;

    public Fruit(String name, ArrayList<String> colors, float averageWeight) {
        this.name = name;
        this.colors = colors;
        this.averageWeight = averageWeight;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
    
    
    

   
    
    
    
    
}
