import os


def find_files(root: str, extension: str):
    if not os.path.isdir(root):
        print("There's not such a directory")
        return -1
    for path, directory, files in os.walk(root):
        if files:
            for file in files:
                if extension in file:
                    yield os.path.abspath(os.path.join(path,  file))


list_of_shiet = find_files('functions', '.py')

for x in list_of_shiet:
    print(x)

