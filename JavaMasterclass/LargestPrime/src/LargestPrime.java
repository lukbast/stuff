public class LargestPrime {
    public static int getLargestPrime(int number) {

        if (number <= 1) {
            return -1;
        } // end if

        int originalNumber = number;
        int largestPrimeFactor = 0;
        for (int i = 2; i <= originalNumber; i++) {
            if (number % i == 0) {
                largestPrimeFactor = i;
                number /= i;
                i--;
            } // end if
        } // end for loop

        return largestPrimeFactor;

    }public static int getLargestPrime(int number) {

        if (number <= 1) {
            return -1;
        } // end if

        int originalNumber = number;
        int largestPrimeFactor = 0;
        for (int i = 2; i <= originalNumber; i++) {
            if (number % i == 0) {
                largestPrimeFactor = i;
                number /= i;
                i--;
            } // end if
        } // end for loop

        return largestPrimeFactor;

    }
}
