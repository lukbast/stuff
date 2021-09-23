import tkinter
import sqlite3

db = sqlite3.connect('bookstore.db')
db.execute('CREATE TABLE IF NOT EXISTS book (id INT PRIMARY KEY, title TEXT, author TEXT, year INT, isbn INT ) ')
db.commit()


def insert(title, author, year, isbn):
    cursor = db.cursor()
    cursor.execute('INSERT INTO book (title, author, year, isbn) VALUES (?, ?, ?, ?)', (title, author, year, isbn))
    db.commit()


def view():
    cursor = db.cursor()
    cursor.execute('SELECT * FROM book ORDER BY lower(book.title)')
    rows = cursor.fetchall()
    return rows


def search(title, author, year, isbn):
    cursor = db.cursor()
    cursor.execute('SELECT * FROM book WHERE title=? OR author=? OR year=? OR isbn=?', (title, author, year, isbn))
    rows = cursor.fetchall()
    return rows


def delete(_id):
    cursor = db.cursor()
    cursor.execute('DELETE FROM book WHERE id=?', (_id,))
    rows = cursor.fetchall()
    cursor.connection.commit()
    return rows


def update(_id, title, author, year, isbn):
    cursor = db.cursor()
    cursor.execute('UPDATE book SET title=?, author=?, year=?, isbn=? WHERE id=?', (title, author, year, isbn, _id))
    db.commit()


def view_all_f():
    books.delete(0, tkinter.END)
    for id_, title, author, year, isbn in view():
        books.insert(tkinter.END, (title, author, year, isbn, id_))


def search_f():
    books.delete(0, tkinter.END)
    results = search(t_var.get(), a_var.get(), y_var.get(), i_var.get())
    for row in results:
        books.insert(tkinter.END, row)


def add_entry_f():
    insert(t_var.get(), a_var.get(), y_var.get(), i_var.get())
    view_all_f()


def clear_fields_f():
    t_var.set('')
    a_var.set('')
    y_var.set('')
    i_var.set('')


def update_f():
    entry = books.get(books.curselection()[0], books.curselection()[0])
    update(entry[0][4], t_var.get(), a_var.get(), y_var.get(), i_var.get())
    view_all_f()


def delete_f():
    entry = books.get(books.curselection()[0], books.curselection()[0])
    delete(entry[0][4])
    view_all_f()


def populate_fields(event):
    if books.curselection():
        entry = books.get(books.curselection()[0], books.curselection()[0])
        t_var.set(entry[0][0])
        a_var.set(entry[0][1])
        y_var.set(entry[0][2])
        i_var.set(entry[0][3])


def close_window():
    mainWindow.destroy()

# insert('Outsider', 'Stephen King', 2018, 66642069)
# insert('Miecz przeznaczenia', 'Sapek', 2018, 66642069)
# insert('Pani jeziora', 'Sapek', 2018, 66642069)
# insert('czas pogardy', 'Sapek', 2018, 66642069)


mainWindow = tkinter.Tk()
mainWindow.title('Bookstore')
mainWindow.geometry('380x300')
mainWindow['padx'] = 20
mainWindow['pady'] = 15


mainWindow.rowconfigure(0, weight=0, pad=5)
mainWindow.rowconfigure(1, weight=0, pad=5)
mainWindow.rowconfigure(2, weight=0, pad=5)
mainWindow.rowconfigure(3, weight=0, pad=5)
mainWindow.rowconfigure(4, weight=0, pad=5)
mainWindow.rowconfigure(5, weight=0, pad=5)
mainWindow.rowconfigure(6, weight=0, pad=5)
mainWindow.rowconfigure(7, weight=0, pad=5)

# LABELS
titleLabel = tkinter.Label(mainWindow, text="Title")
titleLabel.grid(row=0, column=0, sticky='nsew')

yearLabel = tkinter.Label(mainWindow, text="Year")
yearLabel.grid(row=1, column=0, sticky='nsew')

authorLabel = tkinter.Label(mainWindow, text="Author")
authorLabel.grid(row=0, column=2, sticky='nsew')

isbnLabel = tkinter.Label(mainWindow, text="ISBN")
isbnLabel.grid(row=1, column=2, sticky='nsew')


# INPUTS
t_var = tkinter.StringVar()
input_t = tkinter.Entry(mainWindow, textvariable=t_var)
input_t.grid(row=0, column=1, sticky='ew')

y_var = tkinter.StringVar()
input_y = tkinter.Entry(mainWindow, textvariable=y_var)
input_y.grid(row=1, column=1, sticky='ew')

a_var = tkinter.StringVar()
input_a = tkinter.Entry(mainWindow, textvariable=a_var)
input_a.grid(row=0, column=3, sticky='ew')

i_var = tkinter.StringVar()
input_i = tkinter.Entry(mainWindow, textvariable=i_var)
input_i.grid(row=1, column=3)

# SCROLL
scroll = tkinter.Scrollbar(mainWindow, command='scrolly')
scroll.grid(row=2, rowspan=7, column=2, sticky='ns')

# LISTBOX
books = tkinter.Listbox(mainWindow)
books.grid(row=2, column=0, rowspan=7, columnspan=2, sticky='nsew')
books.config(yscrollcommand=scroll.set)
books.config()
scroll.config(command=books.yview)
books.bind('<<ListboxSelect>>', populate_fields)

# BUTTONS
view_btn = tkinter.Button(mainWindow, text='View all', command=view_all_f)
view_btn.grid(row=2, column=3, sticky='ew')

search_btn = tkinter.Button(mainWindow, text='Search entry', command=search_f)
search_btn.grid(row=3, column=3, sticky='ew')

add_btn = tkinter.Button(mainWindow, text='Add entry', command=add_entry_f)
add_btn.grid(row=4, column=3, sticky='ew')

update_btn = tkinter.Button(mainWindow, text='Update', command=update_f)
update_btn.grid(row=5, column=3, sticky='ew')

delete_btn = tkinter.Button(mainWindow, text='Delete', command=delete_f)
delete_btn.grid(row=6, column=3, sticky='ew')

close_btn = tkinter.Button(mainWindow, text='Clear fields', command=clear_fields_f)
close_btn.grid(row=7, column=3, sticky='ew')

close_btn = tkinter.Button(mainWindow, text='Close', command=close_window)
close_btn.grid(row=8, column=3, sticky='ew')


# MAINLOOP
mainWindow.mainloop()
db.close()

