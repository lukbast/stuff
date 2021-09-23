import tkinter
import math


def parabola(canvas_var: tkinter.Canvas, size: int) -> None:
    for i in range(size):
        y = i * i / size
        plot(canvas_var, i, y)
        plot(canvas_var, -i, y)


def circle(canvas_var: tkinter.Canvas, radius, g, h, color="red"):
    canvas_var.create_oval(g + radius, h + radius, g - radius, h - radius, outline=color, width=2)


# for x in range(g * 100, (g+radius) * 100):
    #     x /= 100
    #     y = h + (math.sqrt(radius**2 - ((x-g) ** 2)))
    #     plot(canvas_var, x, y)
    #     plot(canvas_var, x, 2 * h - y)
    #     plot(canvas_var, 2 * g - x, y)
    #     plot(canvas_var, 2 * g - x, 2 * h - y)


def draw_axes(canvas_var: tkinter.Canvas):
    canvas_var.update()
    x_origin = canvas_var.winfo_width() / 2
    y_origin = canvas_var.winfo_height() / 2
    canvas_var.configure(scrollregion=(-x_origin, -y_origin, x_origin, y_origin))
    canvas_var.create_line(-x_origin, 0, x_origin, 0, fill='black')
    canvas_var.create_line(0, y_origin, 0, -y_origin,  fill='black')


def plot(canvas_var: tkinter.Canvas, x: float, y: float) -> None:
    canvas_var.create_line(x, -y, x+1, -y+1, fill='red')


window = tkinter.Tk()
window.geometry('640x480')

canvas = tkinter.Canvas(window, width=640, height=480)
canvas.grid(row=0, column=0)

# canvas2 = tkinter.Canvas(window, width=320, height=480)
# canvas2.grid(row=0, column=1)


draw_axes(canvas)
# draw_axes(canvas2)

# parabola(canvas, 2, 34, 5, 7, 8, 3, 1, 3, 35, 56)
# parabola(canvas2, size=100)
# parabola(canvas2, size=150)
# parabola(canvas2, size=200)
# parabola(canvas2, size=250)

circle(canvas, 100, 100, 100, 'magenta')
window.mainloop()
