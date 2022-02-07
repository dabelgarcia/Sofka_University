package sofkataller01;

/**
 *
 * @author Dario Garcia
 */
public class House {
    
    private String address;
    public String color, material;
    public int number;

    public House() {
    }

    public House(String address, String color, String material, int number) {
        this.address = address;
        this.color = color;
        this.material = material;
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}