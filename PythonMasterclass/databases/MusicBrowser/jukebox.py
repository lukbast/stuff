import sqlite3
import tkinter

db = sqlite3.connect('music.db')


class Scrollbox(tkinter.Listbox):

    def __init__(self, window, **kwargs):
        super().__init__(window, **kwargs)

        self.scrollbar = tkinter.Scrollbar(window, orient=tkinter.VERTICAL, command=self.yview)

    def grid(self, row, column, sticky='nsew', rowspan=1, columnspan=1, **kwargs):
        super().grid(row=row, column=column, sticky=sticky, rowspan=rowspan, columnspan=columnspan, **kwargs)
        self.scrollbar.grid(row=row, column=column, sticky='nse', rowspan=rowspan)
        self['yscrollcommand'] = self.scrollbar.set


class DataListBox(Scrollbox):

    def __init__(self, window, connection, table, field, sort_order=(), **kwargs):
        super().__init__(window, **kwargs)

        self.cursor = connection.cursor()
        self.table = table
        self.field = field

        self.sql_select = "SELECT " + self.field + ', _id' + ' FROM ' + self.table
        if sort_order:
            self.sql_sort = ' ORDER BY ' + ', '.join(sort_order)
        else:
            self.sql_sort = ' ORDER BY ' + self.field

    def clear(self):
        self.delete(0, tkinter.END)

    def re_query(self, link_value=None, table=None):
        if link_value and table:
            sql = self.sql_select + " WHERE " + table + "=?" + self.sql_sort
            self.cursor.execute(sql, (link_value,))
        else:
            self.cursor.execute(self.sql_select + self.sql_sort)

        self.clear()
        for value in self.cursor:
            self.insert(tkinter.END, value[0])

    def get_name(self, event):
        lb = event.widget
        index = lb.curselection()[0]
        return lb.get(index)

    def get_albums(self, event):
        global albumLV
        artist_name = self.get_name(event)

        artist_id = db.execute("SELECT artists._id FROM artists WHERE artists.name = ? ", (artist_name,)).fetchone()[0]
        albums_list.re_query(artist_id, table='albums.artist')

    def get_tracks(self, event):
        global trackLV
        album_name = self.get_name(event)

        album_id = db.execute("SELECT albums._id FROM albums WHERE albums.name = ? ", (album_name,)).fetchone()[0]
        tracks_list.re_query(link_value=album_id, table='songs.album')


main_window = tkinter.Tk()
main_window.title('MusicDB browser')
main_window.geometry('1024x768')

main_window.columnconfigure(0, weight=2)
main_window.columnconfigure(1, weight=2)
main_window.columnconfigure(2, weight=2)
main_window.columnconfigure(3, weight=1)  # spacer column on right

main_window.rowconfigure(0, weight=1)
main_window.rowconfigure(1, weight=5)
main_window.rowconfigure(2, weight=5)
main_window.rowconfigure(3, weight=1)


# ======= labels =======

tkinter.Label(main_window, text='Artist').grid(row=0, column=0)
tkinter.Label(main_window, text='Album').grid(row=0, column=1)
tkinter.Label(main_window, text='Track').grid(row=0, column=2)


# ====== Artists listbox ========

artists_list = DataListBox(main_window, db, "artists", "name")
artists_list.grid(row=1, column=0, rowspan=2, sticky='nsew', padx=(30, 0))
artists_list.config(border=2, relief='sunken')

artists_list.re_query()

artists_list.bind('<<ListboxSelect>>', artists_list.get_albums)


# ====== Albums listbox ========

albumLV = tkinter.Variable(main_window)
albumLV.set(('Choose an artist',))

albums_list = DataListBox(main_window, db, 'albums', 'name', sort_order=('name',))
albums_list.grid(row=1, column=1, sticky='nsew', padx=(30, 0))
albums_list.config(border=2, relief='sunken')

albums_list.re_query()
albums_list.bind('<<ListboxSelect>>', albums_list.get_tracks)

# ====== Tracks listbox ========

trackLV = tkinter.Variable(main_window)
trackLV.set(('Choose an album',))

tracks_list = DataListBox(main_window, db, 'songs', 'title',  sort_order=('track',))
tracks_list.grid(row=1, column=2, sticky='nsew', padx=(30, 0))
tracks_list.config(border=2, relief='sunken')

tracks_list.re_query()

main_window.mainloop()
