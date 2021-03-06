package sofkataller01;

import java.util.ArrayList;

/**
 *
 * @author Dario Garcia
 */
public class Fruit {
    
    public String name;
 
    private float averageWeight;
  
    public ArrayList<String> colors;

    public Fruit() {
    }

    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
    
    
}

