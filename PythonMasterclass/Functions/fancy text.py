def banner_text(text=" ", width=80):
    """
    Get an string as an argument.

    This function will center it within specified width and adds stars
    on beginning and end of lines also print it in console.
    If text is not defined, empty string is a an output.

    :param text: String, text to print (default " " )
    :param width: Int, width of console window (default 80)
    :raises ValueError: if text is longer than width
    """
    if len(text) > width-8:
        raise ValueError('String {0} is larger than specified width {1}'
                         .format(text, width))
    if text == '*':
        print('*'*80)
        return None
    output = '****{0}****'.format(text.center(width-8))
    print(output)


banner_text('*', 80)
banner_text('Hello darkness my old friend', )
banner_text("I'v come to talk with you again", 80)
banner_text(width=80)
banner_text('dcadsdflubiesdsdhgreery',)
banner_text('dcadsdfdytbtrtbeplackirtbebrtb', 80)
banner_text('*', 80)
