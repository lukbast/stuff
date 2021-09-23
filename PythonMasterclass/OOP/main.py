from player import PLayer
from enemy import Enemy, Troll, Vampyre, VampyreKing

regis = VampyreKing('Regis')

print(regis)


for i in range(1, 20):
    regis.take_damage(69)

print(regis)
