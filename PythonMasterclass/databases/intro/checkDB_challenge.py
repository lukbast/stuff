import sqlite3

db = sqlite3.connect('contacts.sqlite')

name = input("Enter a contact's name to find:")
search_cursor = db.cursor()
search_cursor.execute("SELECT * FROM contacts WHERE name= ?", (name,))
result = search_cursor.fetchone()
if result is not None:
    name, phone, email = result
    print(f'Name: {name}, Phone: {phone}, Email: {email}')
else:
    print("Didn't found contact with that name")
db.close()
