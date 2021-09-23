public class inchesToCenti {

    public static void main(String[] args) {
feetAndInchesToCentimeters(100);
    }


        public static double feetAndInchesToCentimeters(double feet, double inches){

        if ((feet < 0) || (inches < 0) || (inches >12) ){
            return -1;
            }

        double centis = ((feet * 12 * 2.54 ) + feet * 2.54);
            System.out.println(feet+ " feet and "+inches+" inches is equal to "+centis+ " centimeters.");
            return centis;

    }

    public static double feetAndInchesToCentimeters(double inches) {

        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double leftInches = (int) inches % 12;
        System.out.println(inches+ " inches is equal to " +feet + " feet and " +leftInches+ " inches.");
        return feetAndInchesToCentimeters(feet,leftInches);
    }
}
