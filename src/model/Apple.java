package model;

public class Apple extends Entity {

    private String colour;

    public Apple(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "   Apple has colour " + colour + ", its weight is " + weight + " g";
    }
}
