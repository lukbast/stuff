public class isPalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));

    }


    public static boolean isPalindrome (int number){

        int reverse =0;


        if (number < 0){
            number = number * -1;

        }

        int procesedNumber = number;

        do {
            reverse = reverse*10;
            reverse = reverse + (procesedNumber % 10);
            procesedNumber = procesedNumber / 10;
        } while (procesedNumber > 0);

        if (number == reverse){
            return true;
        } return false;

    }




}
