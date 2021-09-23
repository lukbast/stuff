public class BasketballLeague extends Team{
    public BasketballLeague(String name) {
        super(name);
    }

    private int wins;
    private int loses;
    private int ties;
    private int playedGames;

    public int getWins() {
        return wins;
    }

    public int getLoses() {
        return loses;
    }

    public int getTies() {
        return ties;
    }

    public int getPlayedGames() {
        return playedGames;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

    public void setPlayedGames(int playedGames) {
        this.playedGames = playedGames;
    }
}
