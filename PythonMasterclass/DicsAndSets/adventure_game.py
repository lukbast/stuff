def adventure_game() -> None:
    """
    Allows to play a adventure game
    """

    locations = {
        0: ['You are siting in front of computer learning python'],
        1: ('You are standing at the end of road before small building', (0, 2, 5, 3, 4), 'Road'),
        2: ('You are at the top of the hill', (0, 4, 5), 'Hill'),
        3: ('You are inside a building, a well house for a small stream', (0, 1), 'Building'),
        4: ('You are in a valley beside a stream', (0, 1, 2), 'Valley'),
        5: ('You are is the forest', (0, 1, 2), 'Forest')
    }
    curr_loc = 1
    while True:
        # Print current locations
        print(locations.get(curr_loc)[0])
        # location 0 is an exit from a game
        if curr_loc == 0:
            break

        # Prints a locations to go to
        possible_directions = locations.get(curr_loc)[1]
        print('*****Possible directions******')
        for direction in possible_directions:
            if direction == 0:
                pass
            else:
                print(f'{direction}: {locations.get(int(direction))[2]}')
        print('*'*50)

        #  loop to check user input and assign it to current location var
        while True:
            to_validate = int(input('Enter your choice (0 to exit)'))
            if to_validate not in possible_directions:
                print(" You can't go there!")
            else:
                curr_loc = to_validate
                break
        print('*'*50)


adventure_game()
