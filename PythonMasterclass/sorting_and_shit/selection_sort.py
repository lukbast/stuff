import random
import timeit

arr = [random.randint(1, 1000000) for i in range(1, 100000)]


def selection_sort():
    global arr
    for i in range(1, len(arr)):
        temp = arr[i]
        j = i-1
        while j >= 0 and temp < arr[j]:
            arr[j+1] = arr[j]
            j -= 1
        arr[j+1] = temp


result = timeit.timeit(selection_sort, globals=globals(), number=1)
print(result)
