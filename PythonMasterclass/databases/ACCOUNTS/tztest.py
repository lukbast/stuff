import sqlite3
import pytz
from datetime import datetime
import pickle

db = sqlite3.connect('accounts.db', detect_types=sqlite3.PARSE_DECLTYPES)
db.execute("CREATE TABLE IF NOT EXISTS accounts (name TEXT PRIMARY KEY NOT NULL, balance INTEGER NOT NULL)")
db.execute("CREATE TABLE IF NOT EXISTS transactions (time TIMESTAMP NOT NULL,"
           " account TEXT NOT NULL, amount INTEGER NOT NULL, type TEXT,"
           " zone INTEGER NOT NULL, PRIMARY KEY (time, account))")
db.execute("CREATE VIEW IF NOT EXISTS localhistory AS"
           " SELECT strftime('%Y-%m-%d %H:%M:%f', transactions.time, 'localtime') as localtime, "
           "transactions.account, transactions.amount FROM transactions order by transactions.time")


class Account:

    @staticmethod
    def _current_time():
        utc_time = pytz.utc.localize(datetime.utcnow())
        local_time = utc_time.astimezone()
        zone = local_time.tzinfo
        return utc_time, zone

    def _save_and_update(self, amount, t_type):
        new_balance = self._balance + amount
        t_time, zone = Account._current_time()  # <-- unpack the returned tuple
        pickled_zone = pickle.dumps(zone)

        if amount < 0:
            amount *= -1
        db.execute("UPDATE accounts SET balance=? WHERE name=?", (new_balance, self.name))
        db.execute('INSERT INTO transactions VALUES(?, ?, ?, ?, ?)',
                   (t_time, self.name, amount, t_type, pickled_zone))
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
            t_time, zone = Account._current_time()  # <-- unpack the returned tuple
            pickled_zone = pickle.dumps(zone)
            db.execute('INSERT INTO accounts VALUES(?, ?)', (name, opening_balance))
            db.execute('INSERT INTO transactions VALUES(?, ?, ?, ?, ?)',
                       (t_time, self.name, opening_balance, 'opening', pickled_zone))
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

    def read_zone(self):
        for row in db.execute("SELECT * FROM transactions"):
            utc_time = row[0]  # saved UTC time (naive)
            pickled_zone = row[4]
            zone = pickle.loads(pickled_zone) # time zone info
            local_time = pytz.utc.localize(utc_time).astimezone(zone)
            print(f'{utc_time}, {local_time}, {local_time.tzinfo}')


if __name__ == '__main__':

    tom = Account("Tom", 1000)
    # tom.deposit(2000)
    # tom.withdraw(1000)
    # tom.show_balance()
    #
    # john = Account("John", 500)
    # john.deposit(2500)
    # john.withdraw(1500)
    # john.show_balance()
    #
    # henry = Account("Henry", 500)
    # henry.deposit(2500)
    # henry.withdraw(1500)
    # henry.show_balance()

    tom.read_zone()
