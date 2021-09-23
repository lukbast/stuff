menu = [
    ['egg', 'bacon'],
    ['egg', 'sausage', 'bacon'],
    ['egg', 'spam'],
    ['egg', 'bacon', 'spam'],
    ['egg', 'bacon', 'sausage', 'spam'],
    ['spam', 'bacon', 'sausage', 'spam'],
    ['spam', 'sausage', 'spam', 'bacon', 'spam', 'tomato', 'spam'],
    ['spam', 'egg', 'spam', 'spam', 'bacon', 'spam'],
]

for i, meal in enumerate(menu):
    if 'spam' in meal:
        correct_index = len(meal)-1
        for j, val in enumerate(reversed(meal)):
            if val == 'spam':
                del menu[i][correct_index-j]

# for i, val in enumerate(menu):
#     print(menu[i])

# for i, meal in enumerate(menu):
#     no_spam_meal = []
#     if 'spam' not in meal:
#         print(menu[i])
#     else:
#         for prod in meal:
#             if prod != 'spam':
#                 no_spam_meal.append(prod)
#         else:
#             print(no_spam_meal)


for meal in menu:
    no_spam = ", ".join(item for item in meal if item != 'spam')
    print(no_spam)
