
def no_garbage(inpt: str) -> str:
    """
    Remove everything that's not a letter.

    Part of is_palindrome function

    :param inpt: string - String to clean
    :return: string - cleaned string
    """
    garbage = ''' +=_[];<>?/\|`~`:-,.!?"'@#$%^&*{}()'''
    word = ''.join(letter for letter in inpt if letter not in garbage)
    return word


def is_palindrome(inpt: str) -> bool:
    """
    Check is string in an palindrome.

    Palindrome is a string that reads the same forward and backward.

    Comes with function no_garbage that removes everything that's not a letter.

    :param inpt: string - String to check
    :return: bool - True if inpt is a palindrome an False otherwise
    """
    word = no_garbage(inpt).casefold()
    reversed_str = no_garbage(inpt)[::-1]
    return word == reversed_str.casefold()


print(is_palindrome(input('Please enter a sentence to check i word is a palindrome')))
