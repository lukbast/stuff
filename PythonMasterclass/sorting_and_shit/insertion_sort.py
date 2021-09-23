import random
import timeit
arr = [random.randint(1, 1000000) for i in range(1, 100000)]


def insertion_sort():
    global arr
    for i in range(0, len(arr)):
        min_val = arr[i]
        min_idx = i
        for j in range(i, len(arr)):
            if arr[j] < min_val:
                min_val = arr[j]
                min_idx = j
        temp = arr[i]
        arr[i] = arr[min_idx]
        arr[min_idx] = temp


result = timeit.timeit(insertion_sort, globals=globals(), number=1)
print(result)
