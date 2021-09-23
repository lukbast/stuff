public class FORstatemnt {

    public static void main(String[] args) {

    int count = 0;
        for(int i=0; i<99999; i+=1 ){


            if (isPrime(i)){
                System.out.println(i);
                count = count+1;
                if (count ==1000){
                    break;
                }
            }



    }














    }

    public static boolean isPrime(int n){
       if (n==1) {
           return false;
       }

       for (int i=2; i <=n/2; i++){
           if(n % i ==0){
               return false;
           }
       }
        return true;

    }




}
