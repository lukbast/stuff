import shelve

l = shelve.open('locations')

curr_loc = 1

while True:
    print(l['locations'][str(curr_loc)]['desc'])

    if curr_loc == 0:
        break

    poss_dir = ' '.join(l['locations'][str(curr_loc)]['exits'].keys())
    print(f"you can go: {poss_dir}")
    inpt = input('Your choice:').upper().split(' ')
    voc = l['locations']['vocabulary']
    exits = l['locations'][str(curr_loc)]['exits'].keys()
    for word in inpt:
        if word in voc.keys():
            curr_loc = l['locations'][str(curr_loc)]['exits'][voc[word]]
            print(curr_loc)
        elif word in exits:
            curr_loc = l['locations'][str(curr_loc)]['exits'][word]


l.close()
