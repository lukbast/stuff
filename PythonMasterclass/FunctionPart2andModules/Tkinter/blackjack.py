import tkinter
import random


def load_images(card_images):
    suits = ['heart', 'club', 'diamond', 'spade']
    face_cards = ['jack', 'queen', 'king']

    #  for each suit, retrieve the image for the cars
    for suit in suits:
        for card in range(1, 11):
            name = f'cards/{str(card)}_{suit}.png'
            image = tkinter.PhotoImage(file=name)
            card_images.append((card, image))

        for card in face_cards:
            name = f'cards/{str(card)}_{suit}.png'
            image = tkinter.PhotoImage(file=name)
            card_images.append((10, image))


def deal_card(frame):
    #     pop the next cord of the top of the deck
    next_card = deck.pop(0)
    # add a image to the label
    tkinter.Label(frame, image=next_card[1], relief='raised').pack(side='left')
    # now return the card's face value
    return next_card


def score_hand(hand):
    # calculate total of all cards in the list
    # only one ace can have the value 11, and this be reduce to 1 if hand busted
    score = 0
    ace = False
    for card in hand:
        card_value = card[0]
        if card_value == 1 and not ace:
            ace = True
            card_value = 11
        score += card_value
        # if we are bust check in in hand was an ace and subtract 10
        if score > 21 and ace:
            score -= 10
            ace = False
    return score


def deal_card_player():
    player_hand.append(deal_card(player_card_frame))
    player_score = score_hand(player_hand)

    player_score_label.set(player_score)
    if player_score == 21:
        result_text.set('Player scores Blackjack!')
        game_over()
    if player_score > 21:
        result_text.set('PLayer 2 Wins!')
        game_over()


def deal_card_player2():
    player2_hand.append(deal_card(player2_card_frame))
    player2_score = score_hand(player2_hand)

    player2_score_label.set(player2_score)
    if player2_score == 21:
        result_text.set('Player 2 scores Blackjack!')
        game_over()
    if player2_score > 21:
        result_text.set('Player Wins!')
        game_over()


def game_over():
    player2_button['state'] = 'disabled'
    player_button['state'] = 'disabled'


def reset():
    global player_card_frame
    global player2_card_frame
    global deck
    deck = list(cards)
    random.shuffle(deck)

    player2_score_label.set(0)
    player_score_label.set(0)

    result_text.set('')

    player2_button['state'] = 'normal'
    player_button['state'] = 'normal'

    player2_hand.clear()
    player_hand.clear()

    player_card_frame.destroy()
    player2_card_frame.destroy()

    # embedded frame to hold the dealer card images
    player_card_frame = tkinter.Frame(card_frame, background="green")
    player_card_frame.grid(row=2, column=1, sticky='ew', rowspan='2')
    # embedded frame to hold the player card images
    player2_card_frame = tkinter.Frame(card_frame, background="green")
    player2_card_frame.grid(row=0, column=1, sticky='ew', rowspan='2')


mainWindow = tkinter.Tk()
# set up screen and frames for the the dealer and player
mainWindow.title('Black Jack')
mainWindow.geometry('640x480')
mainWindow.configure(background='green')


# load cards
cards = []
load_images(cards)
print(cards)

#  create a new deck fro cards and shuffle them
deck = list(cards)
random.shuffle(deck)


result_text = tkinter.StringVar()
result = tkinter.Label(mainWindow, textvariable=result_text, background='green', fg='white')
result.grid(row=0, column=0, columnspan=3)

card_frame = tkinter.Frame(mainWindow, relief='sunken', borderwidth=1, background='green')
card_frame.grid(row=1, column=0, sticky='ew', columnspan=3, rowspan=2)

player2_score_label = tkinter.IntVar()
tkinter.Label(card_frame, text='Dealer', background='green', fg='white').grid(row=0, column=0)
tkinter.Label(card_frame, textvariable=player2_score_label, background='green', fg='white').grid(row=1, column=0)

player_score_label = tkinter.IntVar()
tkinter.Label(card_frame, text='Player', background='green', fg='white').grid(row=2, column=0)
tkinter.Label(card_frame, textvariable=player_score_label, background='green', fg='white').grid(row=3, column=0)

# embedded frame to hold the dealer card images
player_card_frame = tkinter.Frame(card_frame, background="green")
player_card_frame.grid(row=2, column=1, sticky='ew', rowspan='2')
# embedded frame to hold the player card images
player2_card_frame = tkinter.Frame(card_frame, background="green")
player2_card_frame.grid(row=0, column=1, sticky='ew', rowspan='2')

button_frame = tkinter.Frame(mainWindow)
button_frame.grid(row=3, column=0, columnspan=3, sticky='w')

player2_button = tkinter.Button(button_frame, text='Player 2', command=deal_card_player2)
player2_button.grid(row=0, column=1)

player_button = tkinter.Button(button_frame, text='Player', command=deal_card_player)
player_button.grid(row=0, column=0)

reset_button = tkinter.Button(button_frame, text='Reset', command=reset)
reset_button.grid(row=0, column=2)


# create a list to store the dealer's and player's hands

player2_hand = []
player_hand = []


mainWindow.mainloop()
