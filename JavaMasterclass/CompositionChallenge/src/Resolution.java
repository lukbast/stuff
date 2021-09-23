public class Resolution {

    private int x;
    private int y;


    public Resolution(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getResolution(){
        return y*x;
    }

}
