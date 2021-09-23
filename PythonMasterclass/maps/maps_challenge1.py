text = 'what have the romans ever done'
import timeit


def capitals_comp():
    global text
    capitals = [char.upper() for char in text]


def capitals_map():
    global text
    capitals = list(map(str.upper, text))


def words_comp():
    global text
    capitals = [word.upper() for word in text.split(' ')]


def words_map():
    global text
    capitals = list(map(str.upper, text.split(" ")))


result1 = timeit.timeit(capitals_comp, globals=globals(), number=1000000)
result2 = timeit.timeit(capitals_map, globals=globals(), number=1000000)
result3 = timeit.timeit(words_comp, globals=globals(), number=1000000)
result4 = timeit.timeit(words_map, globals=globals(), number=1000000)
print(result1)
print(result2)
print(result3)
print(result4)
