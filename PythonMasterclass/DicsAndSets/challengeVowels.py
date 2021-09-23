def vowels_remover(text: str) -> list:
    """Takes a string, remove vowels from it an returns a list
    of letters provided in a text"""

    vowels = set('aeiou')
    no_vowels = set(text).difference(vowels)
    return sorted(list(no_vowels))


some_shit = "Hello darkness my old friend, I'v come to talk with you again"
print(vowels_remover(some_shit))
