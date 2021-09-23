package com.jpm.packagechallenge;

public class Series {

    public static int nSum(int n){
        int sum=0;
        for (int i=1; i<=n; i++){
            sum= sum+i;
        }
        return sum;
    }


    public static int factorial(int n){
        int previous=1;
        for (int i =1; i<=n; i++){
        int now =previous*i;
        previous=now;
        }
        return previous;
    }

    public   static int fibonacci(int n){
        int result=0;
        if(n==0){
            return 0;
        } else if (n==1){
            return 1;
        } else {
            int first =0;
            int second =1;
            for(int i =2; i<=n;i++){
                result=first+second;
                first=second;
                second=result;
            }

        }
        return result;
    }







}
