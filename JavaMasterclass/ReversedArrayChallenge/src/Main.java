import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        reverse(readIntegers());

    }

    public static int[] readIntegers(){
        System.out.println("Length of array");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] array = new int[count];
        System.out.println("Please, give me "+count+" whole numbers.");

        for (int i=0; i<array.length; i++){
            System.out.println("Write "+(i+1)+" number");
            array[i]=scanner.nextInt();
            scanner.nextLine();
        }//end for loop

        return array;

    }//end of readIntegers method



    public static void reverse(int[] array){
        int [] reversedArray = new int[array.length];

       for (int i = 0; i<array.length; i++){
           int temp= array[i];
           reversedArray[reversedArray.length-1-i]= temp;
       }//end of for loop

        System.out.println("Initial D, I mean initial array "+ Arrays.toString(array));
        System.out.println("Reversed Array "+ Arrays.toString(reversedArray));


    }//end of reverse Method

}
