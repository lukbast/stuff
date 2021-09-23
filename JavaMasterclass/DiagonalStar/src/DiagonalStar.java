public class DiagonalStar {



    public static void printSquareStar(int number) {


        if (number < 5) {
            System.out.println("invalid Value");
        } else {

            for (int i = 1; i <= number; i++) {


                for (int k = 1; k <= number; k++) {
                    if (i == 1 || i == number || i == k || number +1 == i + k   || k==1 || k==number) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                } //end inner loop
                System.out.println();

            } //end initial loop

        } //end else
    } // end method

}

