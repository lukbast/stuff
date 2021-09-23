public class Main {

    public static void main(String[] args) {

        Bed bed = new Bed("WoodOak",new Dimensions(1500,2500,90), new Mattress(new Dimensions(1480,2400,50),"bestOne"));
        TV tv = new TV("LG","42069", "LED",69,new Resolution(1920, 1080),"AndroidTV" );
        Carpet carpet= new Carpet(new Dimensions(2000,2000,5),"GreatestPossible","NicelyLookingOne");
        TableWithChairs tableWithChairs =
                new TableWithChairs("WoodOak","brown",
                        new Dimensions(1,2,3),4,new Chair(new Dimensions(1,2,4),"WoodOak","brown"));
        Commode commode=new Commode(new Dimensions(1500,600,1200),"CrappyWoodFromIKEA","LightBrown",3,
                new Drawer("LightBrown", new Dimensions(1480,590,300),"CrappyWoodFromIKEA"));


        Room room =new Room (bed,tv,carpet,tableWithChairs,commode);

        room.enterTheRoom();
        room.getTv().playAMovie();


    }//ends Main method

}//ends Main class



