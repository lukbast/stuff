arr = [0.7, 0.15, 0.5, 0.21, 0.617, 0.56, 0.32, 0.18, 0.7, 0.31]


def bucket_sort(arr, n):

    buckets = []

    for i in range(0, n):
        buckets.append([])

    for i in range(0, len(arr)):
        idx = int(arr[i]*n)
        buckets[idx].append(arr[i])

    sorted_arr = []

    for bucket in buckets:
        for val in bucket:
            sorted_arr.append(val)

    return sorted_arr
