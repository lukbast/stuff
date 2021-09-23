public class saadsad {


        public static void main(String[] args) {
            System.out.println(getDurationString(5555));;
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



    public static String getDurationString(int seconds){

            if (seconds < 0){
                return "Invalid value";
            }
            int calcMin = seconds / 60;
            int calcSecs = seconds % 60;
        System.out.println(calcMin+"m "+calcSecs+"s");
            return getDurationString(calcMin,calcSecs);

    }

    }





