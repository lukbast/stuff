import sys


def my_range(n: int):
    start = 0
    while start < n:
        yield start
        start += 1


big_range = my_range(1000)

print('big_range in bytes is {}'.format(sys.getsizeof(big_range)))

# create a list containing all the values in big range
big_list = [*big_range]

big_list_iter = []
for val in big_range:
    big_list_iter.append(val)

print('big_list in bytes is {}'.format(sys.getsizeof(big_list)))


print('big_list_iter in bytes is {}'.format(sys.getsizeof(big_list_iter)))
