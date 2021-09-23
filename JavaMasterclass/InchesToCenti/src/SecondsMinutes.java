public class SecondsMinutes {

    public static void main(String[] args) {
        String lol = getDurationString(123, 50);
        System.out.println(lol);
    }

    public static String getDurationString(int minutes, int seconds){

        if (((minutes<0) || (( seconds>59) || (seconds<0) )))
        {
            return "Valid value";
        }
        int minsAndSecs = minutes * 60 + seconds;
        int calcHours = minsAndSecs / 3600;
        int calcMins = (minsAndSecs % 3600) / 60;
        int calcSecs = minsAndSecs % 60;
        return calcHours+"h "+calcMins+"m "+calcSecs+"s";




    }

}
