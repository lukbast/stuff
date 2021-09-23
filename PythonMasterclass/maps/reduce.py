from functools import reduce

def factorial(n: int) -> int:
    def calc_shit(x, y: int) -> int:
        return x * y
    return reduce(calc_shit, range(1, n+1))


for i in range(1, 10):
    print(factorial(i))
