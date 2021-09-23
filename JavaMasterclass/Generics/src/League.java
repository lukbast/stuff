import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    public String name;
    private ArrayList<T> league = new ArrayList<>();


    public League(String name) {
        this.name = name;
    }

    private void addToLeague(T team) {
        if (league.contains(team)) {
            System.out.println("Already exists in the league");
        } else league.add(team);


    }

    public void showTable(){
        Collections.sort(league);
        for(T t : league){
            System.out.println(t.getName()+": "+t.ranking());
        }
    }

}
