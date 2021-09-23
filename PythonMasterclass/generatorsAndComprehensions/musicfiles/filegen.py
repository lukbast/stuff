import os

root = 'music'
for path, directories, files in os.walk(root, topdown=True):
    if files:
        print(path)
        first_split = os.path.split(path)
        print('Album - ' + first_split[1])
        second_split = os.path.split(first_split[0])
        print('Artist - ' + second_split[1])
        for f in files:
            song_details = f[:-5].split(' - ')
            print(song_details)
        print('*'*40)

