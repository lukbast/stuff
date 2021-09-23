import sqlite3

db = sqlite3.connect('contacts.sqlite')

for row in db.execute("SELECT * FROM contacts"):
    print(row)

update_sql = "UPDATE contacts SET email='update.email.com' WHERE contacts.phone = 987654"
update_cursor = db.cursor()
update_cursor.execute(update_sql)
print(f"{update_cursor.rowcount} rows updated")
update_cursor.close()


for row in db.execute("SELECT * FROM contacts"):
    print(row)

db.close()
