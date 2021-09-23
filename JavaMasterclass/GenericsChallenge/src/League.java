import java.util.*;

public class League <T extends Team> implements List<T> {

    private String name;
    ArrayList<T> teamList= new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<T> getTeamList() {
        return teamList;
    }

    public void  addTeam(T team){
        if(teamList.contains(team)){
            System.out.println(team.getName()+"  already exists on the list");
        } else teamList.add(team);
    }


    public void matchResult(T ourTeam , T enemy, int ourScore, int enemyScore) {
        if (ourScore > enemyScore) {
            ourTeam.setWins(ourTeam.getWins() + 1);
        } else if(enemyScore>ourScore){
            ourTeam.setLoses(ourTeam.getLoses()+1);
        } else
            ourTeam.setTies(ourTeam.getTies()+1);

        ourTeam.setPlayedGames(ourTeam.getPlayedGames()+1);

        if(enemy!=null){
            matchResult(enemy,null,enemyScore,ourScore);
        }


    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}












