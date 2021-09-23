import shelve

with shelve.open('bike') as bike:
    # bike["make"] = 'Honda'
    # bike["model"] = '250 dream'
    # bike['color'] = 'red'
    # bike['engine_size'] = 69

    # bike['unwanted_child'] = 'bobo'

    # del bike['unwanted_child']

    print(bike['engine_size'])
    # print(bike['unwanted_child'])
