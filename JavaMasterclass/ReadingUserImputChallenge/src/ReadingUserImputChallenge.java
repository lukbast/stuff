import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class ReadingUserImputChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter=0;
        int sum=0;

        do{
            int order = counter +1;
            System.out.println("Enter number " +order+":");
            boolean isAnInt= scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if (counter==10){
                    break;
                }  //ends if


            } else {
                System.out.println("Invalid Value");
            }   //ends if-else

            scanner.nextLine(); //handle end of line (enter key)


        }while(true); //endless loop (ends with break)

        System.out.println("sum = " +sum);
        scanner.close();














    } // method end

} //class end
