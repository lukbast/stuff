def print_backwards(*args, **kwargs):
    end_character = kwargs.pop('end')
    sep_character = kwargs.pop('sep', ' ')
    for word in args[:0:-1]:
        print(word[::-1], end=sep_character, **kwargs)
    print(args[0][::-1], end=end_character, **kwargs)


with open('backwards.txt', 'w') as backwards:
    print_backwards('hello', 'darkness', 'my', 'old', 'friend', end='')