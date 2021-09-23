def factorial(n):
    if n <= 1:
        return 1
    else:
        return n * factorial(n-1)


try:
    print(factorial(996))
    print('Program successfully executed')

except RecursionError:
    print("This program can't calculate numbers that large")
    print('Program terminating')
except ZeroDivisionError:
    print('Are you stupid or something')
