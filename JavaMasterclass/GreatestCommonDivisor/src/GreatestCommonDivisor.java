public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(81,153));
    }




    public static int getGreatestCommonDivisor(int first, int second){


        int div = 0;
        if (first < 10 || second <10 ){
            return -1;
        }

        if (first==second){
            return first;
        }

        do{
            if(first>second){
            first= first -second;
            div= first;

        }
            if (second>first){
                second=second-first;
                div = second;
            }



        } while (first != second );
        return div;



    }



}
