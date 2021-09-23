public class TableWithChairs {

    private String material;
    private String colour;
    private Dimensions dimensions;
    private int numberOfChairs;
    private Chair chair;

    public TableWithChairs(String material, String colour, Dimensions dimensions, int numberOfChairs, Chair chair) {
        this.material = material;
        this.colour = colour;
        this.dimensions = dimensions;
        this.numberOfChairs = numberOfChairs;
        this.chair = chair;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getNumberOfChairs() {
        return numberOfChairs;
    }

    public Chair getChair() {
        return chair;
    }
}
