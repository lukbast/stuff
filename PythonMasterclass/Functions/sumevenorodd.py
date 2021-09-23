
def even(n):
    result = 0
    for i in range(0, n):
        if i % 2 == 0:
            result += i
    return result


def odd(n):
    result = 0
    for i in range(0, n):
        if i % 2 == 1:
            result += i
    return result


def sum_eo(n, t):
    if t == 'e':
        return even(n)
    if t == 'o':
        return odd(n)
    return -1


print(sum_eo(10, 'e'))
