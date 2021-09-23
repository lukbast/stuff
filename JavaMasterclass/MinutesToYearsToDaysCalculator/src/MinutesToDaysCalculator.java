public class MinutesToDaysCalculator {

    public static void main(String[] args) {
printYearsAndDays(34335556556l);

    }


    public static void printYearsAndDays(long minutes){
        if (minutes<0){
            System.out.println("Invalid Value");
        } else {
            long years = minutes / (365 * 24 * 60);
            long days = (minutes % (365 * 24 * 60)) / 1440;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");

        }


    }




}
