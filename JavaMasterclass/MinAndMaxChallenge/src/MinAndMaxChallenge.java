import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int min = 0;
        boolean first = true; //raising bool flag

        do {
            System.out.println("Enter number");

            boolean ifInt = scanner.hasNextInt();



            if (ifInt){
                int number = scanner.nextInt();
                scanner.nextLine();

                if (first){
                    first = false; //detaching bool flag
                    min = number;
                    max = number;
                }

                if(number > max){
                    max=number;
                }
                if ( number < min) {
                    min=number;
                }


            } //ends ifInt validation
            else {
                System.out.println("min =" +min);
                System.out.println("max =" +max);
                break;

            } // Ends else statement

        } while(true);



    } //ends main method
} //ends class
