from collections import namedtuple
from data import plants_dict

Person = namedtuple('Person', 'first_name, last_name, age, gender')

print(any(plant.plant_type == "Grass" for plant in plants_dict.values()))
