text = input('Please enter your text:')

output = []
for x in text.split():
    output.append(len(x))
print(output)

output = [len(x) for x in text.split()]
print(output)
