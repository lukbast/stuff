import write_file

for i in range(1, 11):
    for j in range(1, 11):
        line = f'{j:2} times {i} is {(j*i):2}'
        write_file.write_file(line, 'test.txt', 'a')
    else:
        write_file.write_file('-'*30, 'test.txt', 'a')
