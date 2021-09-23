import tkinter

mainWindow = tkinter.Tk()

mainWindow.title("Hello World")
mainWindow.geometry('640x480-8-200')

label = tkinter.Label(mainWindow, text='Hello World')
label.grid(row=0, column=0)

leftFrame = tkinter.Frame(mainWindow)
leftFrame.grid(row=1, column=1)

canvas = tkinter.Canvas(mainWindow, relief="raised", borderwidth=1)
canvas.grid(row=1, column=0)

rightFrame = tkinter.Frame(mainWindow)
rightFrame.grid(row=1, column=2, sticky='n')

button1 = tkinter.Button(rightFrame, text="Click me!")
button2 = tkinter.Button(rightFrame, text="Click me!")
button3 = tkinter.Button(rightFrame, text="Click me!")
button1.grid(row=0, column=0)
button2.grid(row=1, column=0)
button3.grid(row=2, column=0)

# configure columns
mainWindow.columnconfigure(0, weight=1)
mainWindow.columnconfigure(1, weight=1)
mainWindow.grid_columnconfigure(2, weight=1)

leftFrame.config(relief='sunken', borderwidth=1)
rightFrame.config(relief='sunken', borderwidth=1)
leftFrame.grid(sticky='ns')
rightFrame.grid(sticky='new')


mainWindow.mainloop()
