import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static Album album1 = new Album("Memetalica", "Ride the Puppets");
    private static LinkedList<Song> playlist = new LinkedList<Song>();
    private static int trackCounter;
    private static ListIterator<Song> playlistIterator = playlist.listIterator();
    private static boolean foward = true;
    private static Scanner scanner= new Scanner(System.in);


    public static void main(String[] args) {

        album1.addToAlbum("asd", 1.00);
        album1.addToAlbum("qwe", 2.00);
        album1.addToAlbum("asdd", 3.00);
        album1.addToAlbum("aszxvd", 4.00);
        album1.addToAlbum("yuty", 5.00);
        album1.addToAlbum("ghfjg", 6.00);


        playlist.add(album1.getSongFromAlbum("asd"));
        playlist.add(album1.getSongFromAlbum("qwe"));
        playlist.add(album1.getSongFromAlbum("asdd"));
        playlist.add(album1.getSongFromAlbum("yuty"));
        playlist.add(album1.getSongFromAlbum("ghfjg"));
        playlist.add(album1.getSongFromAlbum("lol")); //not exist

        int choice;
        boolean quit = false;
        while (!quit) {
            printinstructions();
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    startPlayback();
                    break;
                case 2:
                    nextSong();
                    break;
                case 3:
                    previousSong();
                    break;
                case 4:
                    replaySong();
                    break;
                case 5:
                    printinstructions();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }
    }//end of main method


        private static void printinstructions(){
            System.out.println("1 - start playing");
            System.out.println("2 - next song");
            System.out.println("3 - previous song");
            System.out.println("4 - replay song");
            System.out.println("5 - show commands");
            System.out.println("6 - quit");
        }
        private static  void startPlayback(){
            if (!playlist.isEmpty()){
                trackCounter++;
                System.out.println("Now playing --> Track "+trackCounter+"."+playlistIterator.next());
            } else System.out.println("playlist is empty");
        }

        private static void nextSong() {
            if(!foward){
                if(playlistIterator.hasNext()){
                    playlistIterator.next();
                }
            }
            foward=true;
            if(playlistIterator.hasNext()){
                System.out.println("Now playing --> Track "+trackCounter+"."+playlistIterator.next().toString());
            } else System.out.println("End of playlist");
        }


        private static void previousSong(){
            if (foward){
                if (playlistIterator.hasPrevious()){
                    System.out.println("Now playing --> Track "+trackCounter+"."+playlistIterator.previous().toString());
                    trackCounter--;
                }
                foward=false;
            }
            if (playlistIterator.hasPrevious()){
                playlistIterator.previous();
            }
        }

        private static void replaySong(){
            playlistIterator.previous();
            foward=false;
        }







    }//end of main class
