import java.util.Scanner;



public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){

       int sum=0;
       double counter =0;
       long roundedAvg= 0;

        Scanner scanner = new Scanner(System.in);


        do {

            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int number = scanner.nextInt();
                scanner.nextLine();
                counter ++;
                sum= sum + number;
               roundedAvg= Math.round((double)sum/counter);

            } else {

                System.out.println("SUM = " + sum + " AVG = " + roundedAvg);
                break;
            }

        }while(true); //ends while loop







    } //ends method
} //ends class
