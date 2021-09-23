import java.util.ArrayList;

public class Team<T extends Player> implements  Comparable<Team<T>>{
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName()+"  already in the team");
        } else {
            members.add(player);
            System.out.println(player.getName()+" has been added to the "+this.name+" team");
        }
    }


    public int numberOfPlayer(){
        return members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        if(theirScore>ourScore){
            this.lost++;
        } else if (theirScore<ourScore){
            won++;
        } else tied++;

        played++;

        if(opponent!=null){
            opponent.matchResult(null,theirScore,ourScore);
        }
    }

    public int ranking(){
        return (won *2) + tied;
    }

    @Override
    public int compareTo(Team<T> o) {
        if(this.ranking()>o.ranking()){
            return -1;
        } else  if ((this.ranking()<o.ranking())){
            return 1;
        } else return 0;
    }
}

