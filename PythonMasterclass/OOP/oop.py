class Kettle(object):

    power_source = 'electricity'

    def __init__(self, make, price):
        self.make = make
        self.price = price
        self.on = False

    def turn_on(self):
        self.on = True


philips = Kettle('Philips', 420)
kenwood = Kettle('Kenwood', 9.99)

kenwood.price = 666
print(kenwood.price)

kenwood.turn_on()
print(kenwood.on)

print('Kettle: {0.make}, for {0.price}, isOn: {0.on}'.format(kenwood))

# In piton you can add new attributes to a object like this
kenwood.color = 'magenta'
print(kenwood.color)
# DUN DUN DUN

print(philips.power_source)
print(kenwood.power_source)
kenwood.power_source = 'hamsters'
print(kenwood.power_source)
print(philips.power_source)

Kettle.power_source = 'Atomic'
print(kenwood.power_source)
print(philips.power_source)




