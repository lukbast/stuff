from decimal import *


class Account:
    _qb = Decimal('0.00')

    def __init__(self, name: str, opening_balance: float = 0.0):
        self.name = name
        self.balance = Decimal(opening_balance).quantize(Account._qb)
        print(f"Account created for {self.name}")
        self.show_balance()

    def deposit(self, amount: float) -> Decimal:
        decimal_amount = Decimal(amount).quantize(Account._qb)
        if Account._qb < decimal_amount:
            self.balance = self.balance + decimal_amount
            print(f'{decimal_amount} deposited')
        return self.balance

    def withdraw(self, amount: float) -> Decimal:
        decimal_amount = Decimal(amount).quantize(Account._qb)
        if self.balance > decimal_amount > Account._qb:
            self.balance -= decimal_amount
            print(f"{decimal_amount} withdrawn")
            return decimal_amount
        else:
            print("The amount must be greater than zero and no more than your account balance.")
            return Account._qb

    def show_balance(self):
        print(f"Balance on account: {self.name} is {self.balance:}")


if __name__ == '__main__':
    john = Account("John")
    john.deposit(10.50)
    john.deposit(9.50)
    john.show_balance()
    john.withdraw(10)
    john.withdraw(666)

    john.show_balance()
