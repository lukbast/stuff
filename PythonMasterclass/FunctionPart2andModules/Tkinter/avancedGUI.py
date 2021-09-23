import tkinter
import os

mainWindow = tkinter.Tk()

mainWindow.title("Grid shit")
mainWindow.geometry('640x480-8-200')
mainWindow['padx'] = 10

label = tkinter.Label(mainWindow, text='Tkinter grid demo')
label.grid(row=0, column=0, columnspan=3)

mainWindow.columnconfigure(0, weight=1)
mainWindow.columnconfigure(1, weight=3)
mainWindow.columnconfigure(2, weight=3)
mainWindow.columnconfigure(3, weight=3)
mainWindow.columnconfigure(4, weight=3)
mainWindow.rowconfigure(0, weight=1)
mainWindow.rowconfigure(1, weight=10)
mainWindow.rowconfigure(2, weight=1)
mainWindow.rowconfigure(3, weight=3)
mainWindow.rowconfigure(4, weight=3)

fileList = tkinter.Listbox(mainWindow)
fileList.grid(row=1, column=0, sticky='nsew', rowspan=2)
fileList.config(border=2, relief='sunken')

for zone in os.listdir('/Windows/System32'):
    fileList.insert(tkinter.END, zone)

listscroll = tkinter.Scrollbar(mainWindow, orient=tkinter.VERTICAL, command=fileList.yview)
listscroll.grid(row=1, column=1, sticky='nsw', rowspan=2)
fileList['yscrollcommand'] = listscroll.set

# frame for the radio buttons
optionFrame = tkinter.LabelFrame(mainWindow, text='File Details')
optionFrame.grid(row=1, column=2, sticky='ne')

rbValue = tkinter.IntVar()
rbValue.set(2)
radio1 = tkinter.Radiobutton(optionFrame, text="Filename", value=1, variable=rbValue)
radio2 = tkinter.Radiobutton(optionFrame, text="Path", value=2, variable=rbValue)
radio3 = tkinter.Radiobutton(optionFrame, text="Timestamp", value=3, variable=rbValue)

radio1.grid(row=0, column=0, sticky='w')
radio2.grid(row=1, column=0, sticky='w')
radio3.grid(row=2, column=0, sticky='w')

# widget to display the result
resultLabel = tkinter.Label(mainWindow, text='result')
resultLabel.grid(row=2, column=2, sticky='nw')
result = tkinter.Entry(mainWindow)
result.grid(row=2, column=2, sticky='sw')

# Frame for the time spinners
timeFrame = tkinter.LabelFrame(mainWindow, text="Time")
timeFrame.grid(row=3, column=0, sticky='new')
# Time spinners
hourSpinner = tkinter.Spinbox(timeFrame, width=2, values=tuple(range(0, 24)))
minutesSpinner = tkinter.Spinbox(timeFrame, width=2, from_=0, to=59)
secondsSpinner = tkinter.Spinbox(timeFrame, width=2, from_=0, to=59)

hourSpinner.grid(row=0, column=0)
tkinter.Label(timeFrame, text=':').grid(row=0, column=1)

minutesSpinner.grid(row=0, column=2)
tkinter.Label(timeFrame, text=':').grid(row=0, column=3)

secondsSpinner.grid(row=0, column=4)
timeFrame['padx'] = 36

# Frame for a date spinners
dateFrame = tkinter.Frame(mainWindow)
dateFrame.grid(row=4, column=0, sticky='new')

# date labels

daysLabel = tkinter.Label(dateFrame, text="Day")
monthsLabel = tkinter.Label(dateFrame, text="Month")
yearsLabel = tkinter.Label(dateFrame, text="Year")
daysLabel.grid(row=0, column=0, sticky='w')
monthsLabel.grid(row=0, column=1, sticky='w')
yearsLabel.grid(row=0, column=2, sticky='w')

# Date spinners
daysSpin = tkinter.Spinbox(dateFrame, width=5, from_=1, to=31)
monthsSpin = tkinter.Spinbox(dateFrame, width=5, from_=1, to=12)
# you can use word under key values like values="Jan', 'feb', 'Mar'
yearsSpin = tkinter.Spinbox(dateFrame, width=5, from_=2000, to=2030)

daysSpin.grid(row=1, column=0)
monthsSpin.grid(row=1, column=1)
yearsSpin.grid(row=1, column=2)

# Buttons
okButton = tkinter.Button(mainWindow, text="OK")
cancelButton = tkinter.Button(mainWindow, text="Cancel", command=mainWindow.quit)  # you can use destroy
okButton.grid(row=4, column=3, sticky='e')
cancelButton.grid(row=4, column=4, sticky='w')

mainWindow.mainloop()
