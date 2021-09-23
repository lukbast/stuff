import java.util.ArrayList;

public class Album {

    private String artist;
    private String name;
    private ArrayList<Song> albumList;

    public Album(String artist, String name) {
        this.artist = artist;
        this.name = name;
        this.albumList = new ArrayList<Song>();
    }

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getAlbumList() {
        return albumList;
    }

    private Song findMechanism(String name){
        for (Song checkedSong: this.albumList){
           if (checkedSong.getTitle().equals(name))
           {
                return checkedSong;
            }
        }
        return null;
    }

    public void addToAlbum(String title, double duration){
        if (findMechanism(title)==null){
            this.albumList.add(new Song(title,duration));
            System.out.println("Song "+title+" : "+duration+" successfully added to album.");
        } else System.out.println("Song "+title+" : "+duration+" already exist in album.");
    }

    public Song getSongFromAlbum(String title){
        Song song = findMechanism(title);
        if (song!=null){
            return song;
        } else System.out.println("Song doesn't exist");
        return null;
    }

    }// end of Album class
