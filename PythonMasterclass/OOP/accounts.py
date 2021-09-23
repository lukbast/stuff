import datetime
import pytz


class Account:

    """ Simple account class with balance"""

    @staticmethod
    def _current_time():
        utc_time = datetime.datetime.utcnow()
        return pytz.utc.localize(utc_time)

    def __init__(self, name, balance):
        self._name = name
        self._balance = balance
        self._transaction_list = []
        self._transaction_list.append((Account._current_time(), balance, 'Initial deposit'))
        print('Account created for ' + self._name)

    def deposit(self, amount):
        if amount > 0:
            self._balance += amount
            self.show_balance()
            self._transaction_list\
                .append((Account._current_time(), amount, 'deposited'))
        else:
            print('Invalid value')

    def withdrawal(self, amount):
        if 0 < amount <= self._balance:
            self._balance -= amount
            self.show_balance()
            self._transaction_list \
                .append((Account._current_time(), amount, 'withdrawn'))
        else:
            print('Invalid value')

    def show_balance(self):
        print(f'Your balance is {self._balance}')

    def show_transactions(self):
        for date, amount, t_type in self._transaction_list:
            print('{:6} was {} on {} (local time was {})'
                  .format(amount, t_type, date, date.astimezone()))


if __name__ == '__main__':
    tim = Account('Tim', 666)
    tim.show_balance()

    tim.deposit(1000)

    tim.withdrawal(500)

    tim.withdrawal(999897)

    tim.show_transactions()
    tim.show_balance()

