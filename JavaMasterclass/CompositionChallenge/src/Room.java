public class Room {

    private Bed bed;
    private TV tv;
    private Carpet carpet;
    private TableWithChairs tableWithChairs;
    private Commode commode;


    public Room(Bed bed, TV tv, Carpet carpet, TableWithChairs tableWithChairs, Commode commode) {
        this.bed = bed;
        this.tv = tv;
        this.carpet = carpet;
        this.tableWithChairs = tableWithChairs;
        this.commode = commode;
    }


    public Bed getBed() {
        return bed;
    }

    public TV getTv() {
        return tv;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public TableWithChairs getTableWithChairs() {
        return tableWithChairs;
    }

    public Commode getCommode() {
        return commode;
    }

    private boolean isDarkOutside(){
        int hour = 22;
        if(hour>21 || hour <=7){
        return true;
        } return false;
    }

    public void enterTheRoom(){
        if (isDarkOutside()){

        switchOnTheLights();
        }
    }

    private void switchOnTheLights(){
        System.out.println("Lights turned on");
    }




}
