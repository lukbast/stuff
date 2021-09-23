def fibonacci(n: int):
    start = 1
    current, previous = 0, 1
    while start <= n+1:
        yield current
        current, previous = current + previous, current
        start += 1


def odd_sequence():
    odd = 1
    while True:
        yield odd
        odd += 2


def pi_series():
    odds = odd_sequence()
    approx = 0
    while True:
        approx += (4 / next(odds))
        yield approx
        approx -= (4 / next(odds))
        yield approx


approx_pi = pi_series()

for x in range(20000000):
    print(next(approx_pi))
