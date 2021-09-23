class Song:
    """Class to represent a song
    
    Attributes:
        title (str): title of the song
        duration: (int): The duration of the song in seconds
    """

    def __init__(self, title, duration=0):
        """Song init method

        :param title: (str) Initializes the 'title' attribute
        :param duration: (Optional[int]: Initial value for the 'duration')
        """
        self.title = title
        self.duration = duration

    def get_title(self):
        return self.title

    name = property(get_title)


class Album:
    """Class to represents an Album, using it's track list

    Attributes:
        name (str): The name of the album.
        year (int): The year album was released
            If not specified, the artist will default to an artist with the name
            'Various Artist'.
        tracks (List[Songs]): A list of the songs on the album

    Methods:
        add_song: Used to add a new song to the album's track list

    """

    def __init__(self, name: str, year: int):
        self.name = name
        self.year = year
        self.tracks = []

    def add_song(self, title: str, position=None) -> None:
        """Adds a song to the tracks list

        :param title: (str): A title of song to add.
        :param position: [Optional(int)]: If specified song will be added to that position
            in the track list - inserting it between other songs if necessary.
            Other wise song will be added to end of list
        """

        song_found = find_object(title, self.tracks)
        if song_found is None:
            song_found = Song(title)
            if position is None:
                self.tracks.append(song_found)
            else:
                self.tracks.insert(position-1, song_found)


class Artist:
    """Class to represents an Artist

    Attributes:
        name (str) - Name of an artist
        albums [list(albums)] - A list of the albums by this artist,
            included in this collection
    Methods:
        add_album: Use to add a new album to the artist's albums list
    """

    def __init__(self, name):
        self.name = name
        self.albums = []

    def add_album(self, album: Album):
        """Add a new album to the list"""
        self.albums.append(album)

    def add_song(self, name, year, title):
        """Add a new song to the collection of albums
        This song will add the song to an album in the collection.
        A new album will be added to the collection if it doesn't already exists

        :param name: (str): The name of the album
        :param year: (int): Year of the album's release
        :param title: (str): Title of the song
        """
        album_found = find_object(name, self.albums)
        if album_found is None:
            print(name + 'Not found')
            album_found = Album(name, year)
            self.add_album(album_found)
        else:
            print("Found album " + name)

        album_found.add_song(title)


def find_object(field, object_list):
    """Check 'object_list' to see if an object with a 'name' attribute
    equal to 'field' exists, return it if so."""
    for item in object_list:
        if item.name == field:
            return item
    return None


def load_data(file_dir):

    artist_list = []

    with open(file_dir, 'r') as albums:
        for line in albums:
            artist_f, album_f, year_f, song_f = tuple(line.strip("\n").split('\t'))
            year_f = int(year_f)

            new_artist = find_object(artist_f, artist_list)
            if new_artist is None:
                new_artist = Artist(artist_f)
                artist_list.append(new_artist)

            new_artist.add_song(album_f, year_f, song_f)

    return artist_list


def create_checkfile(artist_list):
    """Create as check file form the object data for comparison with the original file"""
    with open('checkfile.txt', 'w') as checkfile:
        for new_artist in artist_list:
            for new_album in new_artist.albums:
                for new_song in new_album.tracks:
                    print('{0.name}\t{1.name}\t{1.year}\t{2.title}'.format(new_artist, new_album, new_song),
                          file=checkfile)


if __name__ == '__main__':
    artists = load_data('albums.txt')
    print(f"There are {len(artists)} artists")

    create_checkfile(artists)

    artists = load_data('checkfile.txt')
    print(f"There are {len(artists)} artists")
