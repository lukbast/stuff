
name = input('Please, tell me your name...')

while not name:
    name = input("Please, tell me your name or I won't shut up ")

age = int(input('Now tell me your age'))
if 18 < age < 31:
    print('Welcome to holiday party')
elif age:
    print('''Sorry I don't want you in my party''')
