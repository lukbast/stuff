public class Switch {

    public static void main(String[] args) {

        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);

        char Letter = 'C';

        switch (Letter) {
            case 'A':
                System.out.println("Letter was A.");
                break;

            case 'B':
                System.out.println("Letter was B");
                break;

            case 'C':
                System.out.println("Letter was C");
                break;

            case 'D':
                System.out.println("Letter was D");
                break;

            case 'E':
                System.out.println("Letter was E");
                break;

            default:
                System.out.println("Letter wasn't either A, B, C, D or E");


        }
    }

        public static void printDayOfTheWeek(int day){

        switch(day) {

            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid number of day");

        }

        if (day==0){
            System.out.println("Sunday");
        } else if (day==1){
            System.out.println("Monday");
        } else if (day==2){
            System.out.println("Tuesday");
        } else if(day==3){
            System.out.println("Wednesday");
        } else if (day==4){
            System.out.println("Thursday");
        } else if (day==5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else System.out.println("Invalid number of day");




    }



}
