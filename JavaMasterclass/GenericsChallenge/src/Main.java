import java.util.Collections;

public class Main {



    public static void main(String[] args) {
        SoccerTeam team1 = new SoccerTeam("team1");
        VolleyballTeam team2 = new VolleyballTeam("team2");
        SoccerTeam team3 = new SoccerTeam("team3");

        League<SoccerTeam> soccerLeague= new League<>("SoccerLeague");
        soccerLeague.addTeam(team1);
//        SoccerLeague.addTeam(team2);
        soccerLeague.addTeam(team3);




        soccerLeague.matchResult(team1,team3,1,0);
        soccerLeague.matchResult(team1,team3,1,1);
        soccerLeague.matchResult(team1,team3,1,4);
        soccerLeague.matchResult(team1,team3,69,4);

        System.out.println("Team 1 - "+team1.getWins()+" "+team1.getLoses()+" "+team1.getTies()+" "+team1.getPlayedGames());
        System.out.println("team 3 - "+team3.getWins()+" "+team3.getLoses()+" "+team3.getTies()+" "+ team3.getPlayedGames());









    }

}
