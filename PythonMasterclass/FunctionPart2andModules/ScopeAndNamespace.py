# recursive shit
def factorial(n):
    if n <= 1:
        return 1
    else:
        return n * factorial(n-1)


def fib(n):
    if n < 2:
        return n
    else:
        return fib(n-1) + fib(n-2)



