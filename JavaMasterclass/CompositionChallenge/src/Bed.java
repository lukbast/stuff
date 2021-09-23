public class Bed {

    private String materialOfFrame;
    private Dimensions dimensions;
    private Mattress mattress;


    public Bed(String materialOfFrame, Dimensions dimensions, Mattress mattress) {
        this.materialOfFrame = materialOfFrame;
        this.dimensions = dimensions;
        this.mattress = mattress;
    }


    public String getMaterialOfFrame() {
        return materialOfFrame;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Mattress getMattress() {
        return mattress;
    }

}
