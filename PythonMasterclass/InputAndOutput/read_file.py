# jabber = open('c:/Users/Łukasz/Desktop/PythonMasterclass/InputAndOutput/sample.txt', 'r')
# for line in jabber:
#     print(line, end='')
# jabber.close()

# is better to open file with method below
# If error happens before code reach line closing the file
# file may be corrupted

# with open('someshit.thx', 'r') as jabber:
#     for line in jabber:
#         print(line, end='')


# with open('sample.txt', "r") as jabber:
#     line = jabber.readline()
#     while line:
#         print(line, end="")
#         line = jabber.readline()

# with open('sample.txt', "r") as jabber:
#     lines = jabber.readlines()
# print(lines)
#
# for line in lines:
#     print(line, end='')
