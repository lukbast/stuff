public class sumDigits {

    public static void main(String[] args) {

        System.out.println(sumOfDigits(125));
    }

    public static int sumOfDigits(int number){

        if(number <10){
            return -1;
        }

        int sum = 0;
        do {
        sum = sum + number % 10;
        number = number / 10;

        } while (number >0);

        return sum;

    }





}
