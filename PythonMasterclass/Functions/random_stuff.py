def share_digit(a: int, b: int) -> bool:
    if not 10 <= a < b <= 99:
        print('invalid values')
        return False

    a_str = str(a)
    b_str = str(b)
    shared = []
    shared_str = ''

    for digit in a_str:
        if digit in b_str:
            if digit not in shared:
                shared.append(int(digit))

    if shared:
        shared_str = ', '.join(str(digit) for digit in shared)
        print(f"Provided numbers share following digits: {shared_str}")
        return True
    else:
        print("Provided numbers don't share any digits.")
        return False


first = int(input('Enter the first number:'))
second = int(input('Enter the second number:'))

share_digit(first, second)
