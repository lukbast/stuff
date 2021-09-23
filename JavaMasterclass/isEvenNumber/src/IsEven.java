public class IsEven {

    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 69;
        int count = 0;

        do {
            if (isEvenNumber(number)){
                System.out.println(number);
                number ++;
                count ++;
            } else number ++;

            if (count ==5){
                break;
            }

        } while (number <= finishNumber);



    }

    public static boolean isEvenNumber(int number){

        if(number % 2 == 0){
            return true;
        } else return false;

    }




}
