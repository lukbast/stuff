public class Carpet {

    private Dimensions dimensions;
    private String material;
    private String colourPattern;


    public Carpet(Dimensions dimensions, String material, String colourPattern) {
        this.dimensions = dimensions;
        this.material = material;
        this.colourPattern = colourPattern;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getMaterial() {
        return material;
    }

    public String getColourPattern() {
        return colourPattern;
    }
}
