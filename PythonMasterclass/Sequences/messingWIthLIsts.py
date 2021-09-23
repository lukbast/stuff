data = [-3123123212, 2, 3, 4, 5, 6, 9, 56, 78, 104, 105, 110, 120, 130, 130, 150, 160,
        170, 183, 185, 187, 188, 191, 350, 360, 666, 45544545665]
min_valid = 100
max_valid = 200

end_of_slice = 0
start_of_slice = 0
for i, value in enumerate(data):
    if value >= min_valid:
        end_of_slice = i
        break
del data[:end_of_slice]

for i in range(len(data)-1, -1, -1):
    # You could go from the start but it is not very efficient,
    # It is better go backwards since you expect max values
    # in the end of sorted list
    if data[i] < max_valid:
        start_of_slice = i+1
        break

del data[start_of_slice:]

data2 = [6, 9, 56, 78, 104, -3123123212, 2, 3, 4, 5,  105, 110, 120,
         130, 130, 191, 350, 360, 666, 45544545665, 150, 160,
         170, 183, 185, 187, 188]

for i in range(len(data2)-1, -1, -1):
    if data2[i] > max_valid or data2[i] < min_valid:
        del data2[i]


# You have to delete whole portions of lists at once
# You can't mess with variable controlling the loop in Piton
# Another way is to iterate backwards (witch don't have to bo sorted btw)

# Another way is to iterate backwards using enumerate(reversed())
# also enumerate is more efficient

data3 = [6, 9, 56, 78, 104, -3123123212, 2, 3, 4, 5,  105, 110, 120,
         130, 130, 191, 350, 360, 666, 45544545665, 150, 160,
         170, 183, 185, 187, 188]

top_index = len(data3)-1
for i, val in enumerate(reversed(data3)):
    if val > max_valid or val < min_valid:
        del(data3[top_index-i])
print(data3)
