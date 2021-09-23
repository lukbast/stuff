import pickle

imelda = 'More mayhem', "Imelda May", 2011, (
    (1, 'Pulling the Rug'), (2, 'Psychos'), (3, 'Mayhem'), (4, 'Kentish town Waltz'))


with open('imelda.pickle', 'wb') as pickle_file:
    pickle.dump(imelda, pickle_file)

with open('imelda.pickle', 'rb') as imelda_pickled:
    imelda2 = pickle.load(imelda_pickled)
    print(imelda2)