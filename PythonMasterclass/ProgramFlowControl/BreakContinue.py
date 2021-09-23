for i in range(0, 100, 7):
    print(i)
    if i > 0 and i % 11 == 0:
        break
print('*'*100)

for i in range(1, 21):
    if i % 3 == 0 or i % 5 == 0:
        continue
    print(i)
