# import colorama

# Some ANSI escape sequences for colours and effects
BLACK = '\u001b[30m'
RED = '\u001b[31m'
GREEN = '\u001b[32m'
YELLOW = '\u001b[33m'
BLUE = '\u001b[34m'
MAGENTA = '\u001b[35m'
CYAN = '\u001b[36m'
WHITE = '\u001b[37m'
RESET = '\u001b[0m'

BOLD = '\u001b[1m'
UNDERLINE = '\u001b[4m'
REVERSE = '\u001b[7m'


def colored_text(text: str, *ansi: str) -> None:
    """
    Get a string and apply effects to it using 0 or more
    ANSI escape sequences, also print it to console and
    reset effects after that.

    :param ansi: ANSI escape sequences, provided as consts above func def
    :param text: text to print with effects
    """

    print(*ansi, text, RESET)


# colorama.init()
colored_text('o kurwa', RED, BOLD, UNDERLINE)
print("hello, nurse")
# colorama.deinit()
