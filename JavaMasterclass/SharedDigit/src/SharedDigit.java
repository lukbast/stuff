public class SharedDigit {


    public static void main(String[] args) {
        System.out.println(hasSharedDigit(23,56));
    }

    public static boolean hasSharedDigit(int A, int B){

        if (A < 10  || B > 99 ){
            return false;
        }

        int firstA = 0;
        int firstB = 0;
        int secondA = 0;
        int secondB = 0;

        secondA= A % 10;
        secondB= B % 10;

        firstA = (A/10) %10;
        firstB = (B/10) %10;

        if (firstA == firstB || firstA == secondB || secondA == secondB || secondA == firstB  ){
            return true;
        } else return false;


    }
}
