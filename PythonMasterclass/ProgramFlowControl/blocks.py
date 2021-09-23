for i in range(1, 10):
    print('No. {} squared is {:3} and cubed is {:4} '.format(i, i ** 2, i ** 3))
print('*' * 80)

tree1 = 'Oak'
tree2 = 'Cherry'

if tree1 == tree2:
    print('The trees are the same')
else:
    print('The trees are different')

#######################################################

x = 5
y = 7

if x < y:
    print('x is smaller than y')
elif x > y:
    print('X ks greater than y')
else:
    print('x equals y')
