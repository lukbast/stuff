import random
import timeit
arr = [random.randint(1, 1000000) for i in range(1, 100000)]


def quick__sort():
    global arr
    # Python code to implement Stable QuickSort.
    # The code uses middle element as pivot.

    def quick_sort(ar):

        # Base case
        if len(ar) <= 1:
            return ar

        # Let us choose middle element a pivot
        else:
            mid = len(ar)//2
            pivot = ar[mid]

            # key element is used to break the array
            # into 2 halves according to their values
            smaller, greater = [], []

            # Put greater elements in greater list,
            # smaller elements in smaller list. Also,
            # compare positions to decide where to put.
            for idx, val in enumerate(ar):
                if idx != mid:
                    if val < pivot:
                        smaller.append(val)
                    elif val > pivot:
                        greater.append(val)

                    # If value is same, then considering
                    # position to decide the list.
                    else:
                        if idx < mid:
                            smaller.append(val)
                        else:
                            greater.append(val)
            return quick_sort(smaller)+[pivot]+quick_sort(greater)
    quick_sort(arr)


for x in range(1, 100):
    arr = [random.randint(1, 1000000) for i in range(1, 100000)]
    result = timeit.timeit(quick__sort, globals=globals(), number=1)
    print(result)
