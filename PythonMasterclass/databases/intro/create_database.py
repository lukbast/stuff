import sqlite3

db = sqlite3.connect('contacts.sqlite')
# db.execute("CREATE TABLE IF NOT EXISTS contacts (name TEXT, phone INTEGER, email TEXT)")
# db.execute("INSERT INTO contacts(name, phone, email) VALUES('Tim', 123456, 'tim@email.com') ")
# db.execute("INSERT INTO contacts VALUES('brian', 987654, 'brian@email.com')")

cursor = db.cursor()
cursor.execute('SELECT * FROM contacts')
for name, phone, email in cursor:
    print(name)
    print(phone)
    print(email)

cursor.close()
# db.commit()  # commit to save changes but is better to use cursor's connection to commit
db.close()
