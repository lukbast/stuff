options = ['0 - Quit', '1 - Learn Java', '2 - Learn c++', '3 - Learn Python',
           '4 - Eat something', "5 - Go to gym", '6 - Walk a dog']
choice = ""

while choice != "0":
    if choice not in range(0, len(options)):
        for i in range(1, len(options)):
            print(options[i])
        else:
            print(options[0])
    else:
        print(f'Your choice -> {choice}')
    choice = int(input())
