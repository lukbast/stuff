nums = []
number = ''
entry = input('Give me two numbers')


def append_nums():
    global number
    global nums
    if number:
        nums.append(float(number))
        number = ''


for character in entry:
    try:
        number += str(int(character))
    except TypeError:
        append_nums()
    except ValueError:
        append_nums()

append_nums()

try:
    print(nums[0]/nums[1])
except ZeroDivisionError:
    print("Can't divide by zero")
except MemoryError:
    print("resulting number is to large to fit in this device's memory")
except IndexError:
    print("Didn't found 2 numbers in provided string")
