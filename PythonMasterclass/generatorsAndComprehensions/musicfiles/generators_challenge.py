import os
import id3reader


def find_files(root: str, extension: str):
    """
    Takes a directory's path as a string and yields
    absolute path of files that match provided extension.

    :param root: (str) path of directory to scan
    :param extension: (str) relative paths of files with that extension
     will be returned in a list
    """
    if not os.path.isdir(root):
        print("There's not such a directory")
        return -1
    for path, directory, files in os.walk(root):
        if files:
            for file in files:
                if extension in file:
                    yield os.path.abspath(os.path.join(path,  file))


invalid_files = []
music_files = find_files('music', '.emp3')
for f in music_files:
    try:
        id3r = id3reader.Reader(f)
        print("Artist: {}, Album: {}, Track: {}, Title: {}".format(
            id3r.get_value('performer'),
            id3r.get_value('album'),
            id3r.get_value('track'),
            id3r.get_value('title')))
    except (OSError, id3reader.Id3Error):
        invalid_files.append(f)

if invalid_files:
    print('Unsupported files:')
    for file in invalid_files:
        print(file)
