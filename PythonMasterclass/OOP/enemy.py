import random


class Enemy:

    def __init__(self, name: str = "Enemy", hit_points: int = 0, lives: int = 1):
        self.name = name
        self.hit_points = hit_points
        self.max_hp = hit_points
        self.lives = lives
        self.alive = True

    def take_damage(self, damage):

        if not self.alive:
            print(f'{self.name} is dead.')
            return None

        remaining_points = self.hit_points - damage
        if remaining_points > 0:
            self.hit_points = remaining_points
            print(f'I took {damage} damage and have {remaining_points} HP left')
        else:
            self.lives -= 1
            if self.lives == 0:
                self.alive = False
                print(f'{self.name} has 0 lives.\n{self.name} is dead.')
                self.hit_points = 0
            else:
                print(f'I lost 1 live damage and have {self.lives} lives left')
                self.hit_points = self.max_hp

    def __str__(self):
        return "Name: {0.name}, Lives: {0.lives}, Hit points: {0.hit_points}/{0.max_hp}, is_live: {0.alive}"\
            .format(self)


class Troll(Enemy):

    def __init__(self, name):
        super().__init__(name=name, lives=1, hit_points=23)

    def grunt(self):
        print("Me {0.name}. Me stomp you".format(self))


class Vampyre(Enemy):

    def __init__(self, name):
        super().__init__(name=name, lives=3, hit_points=12)

    def take_damage(self, damage):

        if random.randint(1, 3) == 3:
            print(f"***** {self.name} dodges*****")
        else:
            super().take_damage(damage=damage)


class VampyreKing(Vampyre):

    def __init__(self, name):
        super().__init__(name=name)
        self.hit_points = 140
        self.max_hp = 140

    def take_damage(self, damage):
        super().take_damage(damage//4)
