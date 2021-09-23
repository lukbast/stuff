

public class FeetAndInchesToCentimeters {
    public static void main(String[] args) {
        double centi = calcFeetAndInchesToCentimeters(10,11 );
        System.out.println(centi);

    }





    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet < 0) || (inches >12 && inches < 0   )){
            return -1;}
        else return ((feet * 12 * 2.54) + inches * 2.54 );




    }
}
