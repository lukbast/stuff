public class Point {

    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        double a = Math.sqrt(((x - 0) * (x - 0)) + ((y - 0) * (y - 0))) ;
        return (a);
    }

    public double distance(int x, int y) {

        double a = Math.sqrt(((this.x - x) * (this.x - x)) + ((this.y - y) * (this.y - y)));
        return (a);
    }

    public double distance(Point point) {
        return distance(point.getX(), point.getY());
    }


}