public class SumOdd {


    public static void main(String[] args) {

        System.out.println(sumOdd(545,1003450));

    }



    public static boolean isOdd(int number){

        if (number < 1){
            return false;
        } else if (number % 2 == 1 ) {
            return true;
        }else return false;
        }



       public static long sumOdd(int start, int end){

        if ((start < 0) || (end < 0 || end < start )){
            return -1;
           }
        if ((start == end) && isOdd(start) ) {
            return start;
        }
           if (start == end){
               return 0;
           }

        long sum = 0;

        for (int i = start; i <= end; i++ ){
            if (isOdd(i)){
                sum = sum + i;
            }


           }

        return sum;




       }






    }

