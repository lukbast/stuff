import tkinter

print(tkinter.TkVersion)
print(tkinter.TclVersion)

mainWindow = tkinter.Tk()

mainWindow.title("Hello World")
mainWindow.geometry('640x480+8+200')

label = tkinter.Label(mainWindow, text='Hello World')
label.pack(side='top')
canvas = tkinter.Canvas(mainWindow, relief="raised", borderwidth=1)
canvas.pack(side='left')

rightFrame = tkinter.Frame(mainWindow)
rightFrame.pack(side="right", anchor='n')

button1 = tkinter.Button(rightFrame, text="Click me!")
button2 = tkinter.Button(rightFrame, text="Click me!")
button3 = tkinter.Button(rightFrame, text="Click me!")
button1.pack(side='top')
button2.pack(side='top')
button3.pack(side='top')
mainWindow.mainloop()
