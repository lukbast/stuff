user_input = input('PLease enter 3 numbers split with "," ')

split_input = user_input.split(',')

ints = []

for val in split_input:
    ints.append(int(val))

result = ints[0] + ints[1] - ints[2]

print(result)
