public class Commode {

    private Dimensions dimensions;
    private String material;
    private String colour;
    private int numberOfDrawers;
    private Drawer drawer;

    public Commode(Dimensions dimensions, String material, String colour, int numberOfDrawers, Drawer drawer) {
        this.dimensions = dimensions;
        this.material = material;
        this.colour = colour;
        this.numberOfDrawers = numberOfDrawers;
        this.drawer = drawer;
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

    public int getNumberOfDrawers() {
        return numberOfDrawers;
    }

    public Drawer getDrawer() {
        return drawer;
    }



}
