import os


def create_paths_list(root: str, extension: str) -> list:
    """
    Takes a directory's path as a string and using its nested function
    returns a list of relatives paths of files that match provided extension.

    :param root: (str) path of directory to scan
    :param extension: (str) relative paths of files with that extension
     will be returned in a list
    :return: (list) list of paths of files that match provided extension
    """

    paths_list = []
    no_permission =[]

    def _find_mechanism(inner_root: str, ext: str) -> None:
        nonlocal paths_list

        try:
            if os.listdir(inner_root):
                for dir_ in os.listdir(inner_root):
                    if os.path.isdir(os.path.join(inner_root, dir_)):
                        _find_mechanism(os.path.join(inner_root, dir_), ext)
                    else:
                        if ext in dir_:
                            paths_list.append(os.path.abspath(os.path.join(inner_root, dir_)))
        except PermissionError:
            no_permission.append(os.path.abspath(os.path.join(inner_root)))

    _find_mechanism(root, extension)
    return [paths_list, no_permission]


list_of_crap = create_paths_list("""C:\\Users\\Łukasz\\""", 'Fear')
for item in list_of_crap[0]:
    print(item)

print('*'*80)

print('No permission to scan following locations')


for item in list_of_crap[1]:
    print(item)


