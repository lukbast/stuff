public class Sum3and5Challenge {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;


        for (int i=1; i<1001; i++ ){
             if (i % 3 ==0  && i % 5==0){
                 System.out.println(i);
                 count++;
                 sum= sum +i;
             } if (count==5){
                System.out.println(sum);
                 break;

            }

        }




    }
}
