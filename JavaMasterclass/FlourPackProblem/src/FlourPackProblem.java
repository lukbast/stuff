public class FlourPackProblem {


    public static boolean canPack(int bigCount,int smallCount,int goal) {

        int big = bigCount * 5;

        int divgoal = goal / 5;

        // int small=smallCount;

        if (bigCount < 0 || smallCount < 0 || goal < 0) {

            return false;}

        if (big < goal) {

            if ((big + smallCount) >= goal) {

                return true;}



        }

        if (big >= goal) {

            if ((divgoal * 5 + smallCount) >= goal) {

                return true;}



        }

        return false;}


}
