from msilib import sequence


def write_file(text: sequence, filename: str, o_type: str) -> None:
    """
    Takes list and write it to a txt file line
    :param o_type: Indicates opening mode
    :param text: List to save in txt file
    :param filename: string with name/path of a output file
    """

    with open(filename, o_type) as some_file:
        print(text, file=some_file)


def read_file(path: str) -> sequence:
    """
    Reads text from a file line by line and save it to sequence and returns it
    :param path: path to .txt file
    :return: sequence: sequence evaluated from content read from a file
    """
    with open(path, 'r') as text:
        contents = text.readline()
    return eval(contents)


# sample_text = ['Adelaide',
#                'Alice Springs',
#                'Darwin',
#                'Melbourne',
#                'Sydney']


# imelda = 'More mayhem', "Imelda May", 2011, (
#     (1, 'Pulling the Rug'), (2, 'Psychos'), (3, 'Mayhem'), (4, 'Kentish town Waltz'))
#
# write_file(imelda, 'imelda.txt')

# title, artist, year, songs = read_file('imelda.txt')
#
# print(title)
# print(artist)
# print(year)
# for i, song in enumerate(songs):
#     print(f'{song[0]}: {song[1]}')
