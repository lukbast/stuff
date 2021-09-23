import java.util.Scanner;

public class Main {

   private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }//ends of main method

    public static int[] getArray(int number){
        System.out.println("Enter "+number+" integer.\r");
        int[] values = new int[number];

        for(int i=0; i<number; i++){

            values[i] = scanner.nextInt();
        }
        return values;
    } //emd of getArray method

    public static void printArray(int[] array){

        for(int i =0; i<array.length; i++){
            System.out.println(i+"# on array - "+array[i]);
        }
    }//end of printArray Method

    public static int[] sortIntegers(int[] array){
       int[] sortedArray = new int[array.length];
       for(int i=0; i<array.length;i++){
           sortedArray[i]=array[i];
       }
       boolean flag = true;
       int temp;
       while (flag) {
           flag = false;

           for (int i = 0; i < sortedArray.length - 1; i++) {
               if (sortedArray[i] < sortedArray[i + 1]) {
                   temp = sortedArray[i];
                   sortedArray[1] = sortedArray[i + 1];
                   sortedArray[i] = temp;
                   flag = true;

               }//ends if loop
           }//ends for loo[
       }//ends while loop
        return sortedArray;

    } //ends sortIntegers method


}//ends class
