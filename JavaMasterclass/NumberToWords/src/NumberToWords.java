public class NumberToWords {

    public static void main(String[] args) {

    }


    public static void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");
        } else {
            int reversed = reverse(number);
            int count = getDigitCount(number);

            int lastDigit = 0;
            int i = 0;
            do {
                lastDigit = reversed % 10;
                reversed = reversed / 10;
                i = i + 1;
                if (lastDigit == 1) {
                    System.out.println("One");
                }
                if (lastDigit == 2) {
                    System.out.println("Two");
                }
                if (lastDigit == 3) {
                    System.out.println("Three");
                }
                if (lastDigit == 4) {
                    System.out.println("Four");
                }
                if (lastDigit == 5) {
                    System.out.println("Five");
                }
                if (lastDigit == 6) {
                    System.out.println("Six");
                }
                if (lastDigit == 7) {
                    System.out.println("Seven");
                }
                if (lastDigit == 8) {
                    System.out.println("Eight");
                }
                if (lastDigit == 9) {
                    System.out.println("Nine");
                }
                if (lastDigit == 0) {
                    System.out.println("Zero");
                }


            } while (i != count);
        }

    }

    public static int reverse(int number){

        int reversed = 0;

        if (number < 0){
            number = number * -1;
            do{
                reversed = reversed*10;
                reversed = reversed + (number % 10);
                number = number /10;
            } while (number !=0);
            reversed = reversed*-1;
            return reversed;
        }

        do{
            reversed = reversed*10;
            reversed = reversed + (number % 10);
            number = number /10;
        } while (number !=0);


        return reversed;

    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        int count = 0;
        do{
        count = count + 1;
        number = number /10;
        } while (number !=0);

        return count;

    }


}
