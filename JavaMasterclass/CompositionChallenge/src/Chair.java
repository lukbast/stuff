public class Chair {

    private Dimensions dimensions;
    private String material;
    private String colour;

    public Chair(Dimensions dimensions, String material, String colour) {
        this.dimensions = dimensions;
        this.material = material;
        this.colour = colour;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }
}
