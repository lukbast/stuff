def fizz_buzz(num: int) -> str:
    """
    Allows to play a simple game vs computer.

    Take and `int` and check if divisible by 3 ,5 or both.
    Next, in a loop compares com's and players answers.
    If player makes a mistake prints game over msg and
    break out from the loop, function ends.
    Game continue to 100th turn


    :param num: number to check.
    :return: if not divisible by 3, 5 or 3 and 5 returns provided number.
    If divisible returns fizz, buzz or fizz buzz accordingly
    """

    if num % 3 == 0 and num % 5 == 0:
        return 'fizz buzz'
    if num % 3 == 0:
        return 'fizz'
    if num % 5 == 0:
        return 'buzz'
    return str(num)


for i in range(1, 101, 2):
    print(f'Com: {fizz_buzz(i)}')
    if input('Plr: ') != fizz_buzz(i+1):
        print('Game over. Com is the winner')
        break
else:
    print("Good job, you beat the final boss.")
