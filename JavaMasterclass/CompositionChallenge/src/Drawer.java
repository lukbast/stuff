

public class Drawer {

    private String colour;
    private Dimensions dimensions;
    private String material;

    public Drawer(String colour, Dimensions dimensions, String material) {
        this.colour = colour;
        this.dimensions = dimensions;
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getMaterial() {
        return material;
    }
}
