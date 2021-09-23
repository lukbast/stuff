public class Floor {


    private double width;
    private double length;

    public Floor(double width, double length){
        if(width<0){
            this.width=0;
        }
        this.width=width;
        if(length<0){
            this.length=0;
        }
        this.length=length;
    }

    public double getArea(){
        double area= width*length;
        return area;
    }




}
