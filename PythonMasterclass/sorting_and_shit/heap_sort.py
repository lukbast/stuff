import random
import timeit
arr = [random.randint(1, 1000000) for i in range(1, 100000)]


def heap__sort():
    global arr

    def heap_sort():
        n = len(arr)

        for i in range(int(n/2-1), -1, -1):
            heapify(arr, n, i)

        for i in range(n-1, -1, -1):
            arr[0], arr[i] = arr[i], arr[0]

            heapify(arr, i, 0)

    def heapify(arr, n, i):
        sub_root = i
        l_child = i * 2 + 1
        r_child = i * 2 + 2

        if l_child < n and arr[l_child] > arr[sub_root]:
            sub_root = l_child

        if r_child < n and arr[r_child] > arr[sub_root]:
            sub_root = r_child

        if sub_root is not i:
            arr[sub_root], arr[i] = arr[i], arr[sub_root]

            heapify(arr, n, sub_root)

    heap_sort()


result = timeit.timeit(heap__sort, globals=globals(), number=1)
print(result)
print(arr)
