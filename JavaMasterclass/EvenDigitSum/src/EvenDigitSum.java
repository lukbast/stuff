public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }



    public static int getEvenDigitSum(int number){

        if (number<0){
            return -1;
        }

        int sum = 0;

        do {
            int lastDigit = number %10;
            if(lastDigit % 2 == 0){
                sum= sum + lastDigit;
                number= number/10;
            } else number=number/10;


        } while (number >0);

        return sum;
    }

}
