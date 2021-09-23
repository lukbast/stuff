import random
import timeit


def quick__sort():
    global arr

    def quick_sort(array, low, high):
        if len(array) == 1:
            return array
        if low < high:

            # pi is partitioning index, arr[p] is now
            # at right place
            pi = partition(array, low, high)

            # Separately sort elements before
            # partition and after partition
            quick_sort(array, low, pi - 1)
            quick_sort(array, pi + 1, high)

    def partition(array, low, high):

        i = (low-1)         # index of smaller element
        pivot = array[high]     # pivot

        for j in range(low, high):

            # If current element is smaller than or
            # equal to pivot
            if array[j] <= pivot:

                # increment index of smaller element
                i = i+1
                array[i], array[j] = array[j], array[i]

        array[i + 1], array[high] = array[high], array[i + 1]
        return i+1

    quick_sort(arr, 0, len(arr)-1)


for x in range(1, 100):
    arr = [random.randint(1, 1000000) for i in range(1, 100000)]
    result = timeit.timeit(quick__sort, globals=globals(), number=1)
    print(result)
