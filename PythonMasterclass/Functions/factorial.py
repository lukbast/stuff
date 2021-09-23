def factorial(n: int) -> int:
    """
    Calculate !n.

    :param n: positive number
    :return: result of !n
    """
    result = 1
    for i in range(1, n+1):
        result *= i
    else:
        return result


for i in range(0, 36):
    print(f'{i}: {factorial(i)}')
