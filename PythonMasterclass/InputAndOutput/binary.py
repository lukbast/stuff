def bin_write():
    with open('binary', 'bw') as bin_file:
        for i in range(17):
            bin_file.write(bytes([i]))


def bin_read():
    with open('binary', 'br') as bin_file:
        for i in bin_file:
            print(i)


bin_write()
bin_read()
