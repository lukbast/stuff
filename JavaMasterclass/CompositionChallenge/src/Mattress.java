public class Mattress {

    private Dimensions dimensions;
    private String typeOfMattress;

    public Mattress(Dimensions dimensions, String typeOfMattress) {
        this.dimensions = dimensions;
        this.typeOfMattress = typeOfMattress;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getTypeOfMattress() {
        return typeOfMattress;
    }
}
