from nestedIndexing import albums

while True:
    for i, album in enumerate(albums):
        album_title, artist, year, songs = album
        print(f'{i+1}: {artist}, {album_title}, {year}')

    inpt = int(input('Please chose album: (invalid choice exits)'))

    if inpt not in range(1, len(albums) + 1):
        break
    else:
        for lp, title in albums[inpt - 1][3]:
            print(f'{lp}: {title}')

    while True:

        inpt2 = int(input('Please chose song: (enter 0 back to albums)'))
        if inpt2 == 0:
            break
        elif inpt2 not in range(1, len(albums[inpt - 1][3]) + 1):
            print(f"Song with number {inpt2} don't exist")
            for lp, title in albums[inpt - 1][3]:
                print(f'{lp}: {title}')
        else:
            print(f'Now playing: {albums[inpt - 1][3][inpt2 - 1][1]}')
            print('*'*80)
