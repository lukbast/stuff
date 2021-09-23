public class LastDigitChecker {

    public static boolean hasSameLastDigit(int A, int B, int C){

        if (A < 10 || A > 1000 || B < 10 || B > 1000 || C < 10 || C > 1000 ){
            return false;
        }

        int lastA = A % 10;
        int lastB = B % 10;
        int lastC = C % 10;


        if (lastA== lastB || lastA == lastC || lastC == lastB ){
            return true;
        } else return false;

    }



    public static boolean isValid(int number){

        if (number < 10 || number > 1000){
            return false;
        } return true;

    }



}
