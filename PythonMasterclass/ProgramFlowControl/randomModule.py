import random

# a = 1
# b = 1000
# answer = random.randint(a, b)
# count = 0
# guess = None
#
# while answer != guess:
#     guess = int(input(f"Please guess number between {a} and {b}. Enter 0 to quit "))
#     count += 1
#     if guess == 0:
#         break
#     elif guess > answer:
#         print('Guess lower')
#     elif guess < answer:
#         print('Guess higher')
# print(f'Great job, you beat the final boss. It took you {count} turns')

low = 1
high = 33554431

answer = random.randint(low, high)
print(answer)
guess = None
count = 0

while answer != guess:
    guess = low + (high-low)//2
    count += 1
    if guess < answer:
        low = guess
    elif guess > answer:
        high = guess

print(guess)
print(count)
