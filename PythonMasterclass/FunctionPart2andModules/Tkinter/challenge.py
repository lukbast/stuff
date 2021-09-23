import tkinter


# buttonsList = [('   C   ', 1, 0), ('    CE  ', 1, 1),
#                ('   7   ', 2, 0), ('    8    ', 2, 1), ('   9   ', 2, 2), ('   +  ', 2, 3),
#                ('   4   ', 3, 0), ('    5    ', 3, 1), ('   6   ', 3, 2), ('   -   ', 3, 3),
#                ('   1   ', 4, 0), ('    2    ', 4, 1), ('   3   ', 4, 2), ('   *   ', 4, 3),
#                ('   0   ', 5, 0),
#                ('   /   ', 5, 3)
#                ]

buttonsList = [('C', 1, 0), ('CE', 1, 1),
               ('7', 2, 0), ('8', 2, 1), ('9', 2, 2), ('+', 2, 3),
               ('4', 3, 0), ('5', 3, 1), ('6', 3, 2), ('-', 3, 3),
               ('1', 4, 0), ('2', 4, 1), ('3', 4, 2), ('*', 4, 3),
               ('0', 5, 0),
               ('/', 5, 3)
               ]

mainWindow = tkinter.Tk()

mainWindow.title('Calculator')
mainWindow.geometry('180x180')
# mainWindow.update()
# mainWindow.minsize(mainWindow.winfo_width(), mainWindow.winfo_height())
mainWindow.minsize(160, 160)
mainWindow.maxsize(200, 200)
mainWindow['padx'] = 10

frame = tkinter.Frame(mainWindow).grid(row=0, column=0, sticky='ne')

inputField = tkinter.Entry(frame)
inputField.grid(row=0, column=0, columnspan=6, sticky='ne')


for btn in buttonsList:
    calc_btn = tkinter.Button(frame, text=btn[0])
    calc_btn.grid(row=btn[1], column=btn[2], sticky=tkinter.E + tkinter.W)


calc_spc = tkinter.Button(frame, text='=')
calc_spc.grid(row=5, column=1, columnspan=2, sticky='ew')


mainWindow.mainloop()
