inch = (1, 2, 3, 8, 20, 50, 70, 69)

cm = [num * 2.54 for num in inch]
cm2 = tuple(num * 2.54 for num in inch if num < 50)
print(cm)
print(cm2)
