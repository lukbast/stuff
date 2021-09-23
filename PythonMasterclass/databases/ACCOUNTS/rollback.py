import sqlite3
import pytz
from datetime import datetime

db = sqlite3.connect('accounts.db', detect_types=sqlite3.PARSE_DECLTYPES)
db.execute("CREATE TABLE IF NOT EXISTS accounts (name TEXT PRIMARY KEY NOT NULL, balance INTEGER NOT NULL)")
db.execute("CREATE TABLE IF NOT EXISTS transactions (time TIMESTAMP NOT NULL,"
           " account TEXT NOT NULL, amount INTEGER NOT NULL, type TEXT, PRIMARY KEY (time, account))")
db.execute("CREATE VIEW IF NOT EXISTS localtransactions AS"
           " SELECT strftime('%Y-%m-%d %H:%M:%f', transactions.time, 'localtime') as localtime, "
           "transactions.account, transactions.amount FROM transactions order by transactions.time")


class Account:

    @staticmethod
    def _current_time():
        return pytz.utc.localize(datetime.utcnow())

    def _save_and_update(self, amount, t_type):
        new_balance = self._balance + amount
        t_time = Account._current_time()
        if amount < 0:
            amount *= -1
        try:
            db.execute("UPDATE accounts SET balance=? WHERE name=?", (new_balance, self.name))
            db.execute('INSERT INTO transactions VALUES(?, ?, ?, ?)',
                       (t_time, self.name, amount, t_type))
        except sqlite3.Error:
            db.rollback()
            print('Integrity error')
        else:
            db.commit()
            self._balance = new_balance

    def __init__(self, name: str, opening_balance: int = 0):
        cursor = db. execute('SELECT name, balance  FROM accounts  WHERE (name = ?)', (name,))
        row = cursor.fetchone()
        if row:
            self.name, self._balance = row
            print("Retrieved record for {}".format(self.name))
        else:
            self.name = name
            self._balance = opening_balance
            t_time = Account._current_time()
            db.execute("INSERT INTO accounts (name, balance) values (?, ?)", (name, opening_balance))
            db.execute('INSERT INTO transactions VALUES(?, ?, ?, ?)',
                       (t_time, self.name, opening_balance, 'opening'))
            db.commit()
            print(f"Account created for {self.name}")
        self.show_balance()

    def deposit(self, amount: int) -> float:
        if 0.00 < amount:
            self._save_and_update(amount, "deposit")
            print('{:.2f} deposited'.format(amount/100))
        return self._balance / 100

    def withdraw(self, amount: int) -> float:
        if self._balance > amount > 0.0:
            self._save_and_update(-amount, "withdrawal")
            print('{:.2f} withdrawn'.format(amount/100))
            return amount / 100
        else:
            print("The amount must be greater than zero and no more than your account balance.")
            return 0.0

    def show_balance(self):
        print('Balance on account {} is {:.2f}'.format(self.name, self._balance / 100))


if __name__ == '__main__':
    john = Account('John', 1010)

    john.deposit(1010)
    john.deposit(10)
    john.deposit(10)
    john.withdraw(30)

    terry_j = Account('TerryJ', 0)
    graham = Account('Graham', 9000)
    Eric = Account('Eric', 7000)
    Michael = Account('Michael', 0)
    terry_g = Account('TerryG', 0)

