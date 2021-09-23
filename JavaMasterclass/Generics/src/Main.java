public class Main {

    public static void main(String[] args) {
        FootballPLayer joe = new FootballPLayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPLayer> adelaideCrows = new Team<>("Adeleide Crows");
        adelaideCrows.addPlayer(joe);
     //   adelaideCrows.addPlayer(pat);
     //  adelaideCrows.addPlayer(beckham);

        Team<BaseballPlayer> BaseballTeam = new Team<>("Chicago Cubs");
        BaseballTeam.addPlayer(pat);
        Team<SoccerPlayer> brokenTeam = new Team<>("This won't work");
        brokenTeam.addPlayer(beckham);


    }
}
