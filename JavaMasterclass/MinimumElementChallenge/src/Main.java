import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(findMin(readIntegers(8)));
    }//end of Main method


    public static int[] readIntegers(int count){
        int[] array = new int[count];
        System.out.println("Please, go fuck yourself, err I mean give me "+count+" whole numbers.");

        for (int i=0; i<array.length; i++){
            array[i]=scanner.nextInt();
        }//end for loop

        return array;

    }//end of readIntegers method

    public static int findMin(int [] array){
        int  min = array[0];

        for (int i=1; i<array.length; i++){
            if (array[i]<min){
                min=array[i];
            }//end of if statement
        }//end of for loop

        System.out.println("Minimum of array "+Arrays.toString(array)+" is");
        return min;
    }//end of findMin method


}



