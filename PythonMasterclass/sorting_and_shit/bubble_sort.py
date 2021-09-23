import random
import timeit
arr = [random.randint(1, 1000000) for i in range(1, 100000)]


def bubble_sort():
    global arr
    is_sorted = False

    while not is_sorted:
        is_sorted = True
        for j in range(0, len(arr)-1):
            if arr[j] > arr[j+1]:
                temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
                is_sorted = False


result = timeit.timeit(bubble_sort, globals=globals(), number=1)
print(result)

