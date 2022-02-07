
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofkataller01;

/**
 *
 * @author dinam
 */
public class vegetables {
    
    public String name;
    private int id;
    private float averageWeight;
    private float amount;

    public vegetables() {
    }

    public vegetables(String name, int id, float averageWeight, float amount) {
        this.name = name;
        this.id = id;
        this.averageWeight = averageWeight;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
    
    
}
