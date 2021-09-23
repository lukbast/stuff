import os


def list_directories(s):

    def list_dir(d):
        nonlocal tab_count
        files = os.listdir(d)
        for file in files:
            curr_dir = os.path.join(d, file)
            if os.path.isdir(curr_dir):
                print('\t' * tab_count + file)
                tab_count += 1
                list_dir(curr_dir)
                tab_count -= 1
            else:
                print('\t' * tab_count + file)

    tab_count = 0
    if os.path.exists(s):
        print("List of directory " + s)
        list_dir(s)
    else:
        print(f"Directory {s} not exist ")


list_directories('c:\\Users\\Łukasz\\Desktop')
