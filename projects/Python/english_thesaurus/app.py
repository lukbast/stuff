import json
from difflib import SequenceMatcher

data = json.load(open('data.json'))


def translate():
    results = []

    input_ = input("Give me an word to see its meaning in a dictionary").lower()

    if input_ in data.keys():
        for entry in data[input_]:
            results.append(entry)
        print('\n'.join(phrase for phrase in results))
        return results

    for entry in data.keys():
        if SequenceMatcher(None, input_, entry).ratio() > 0.7:
            results.append(entry)

    if results:
        print(f"Didn't fount {input_} in dictionary.")
        print('Check phrases below to see if one of them is what are you looking for.')
        print(', '.join(phrase for phrase in results))
    else:
        print(f"Didn't found nothing with close meaning to {input_} in dictionary.")


translate()
