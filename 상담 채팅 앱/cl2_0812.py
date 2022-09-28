# -*- coding: utf-8 -*-
"""
Created on Fri Aug 12 09:45:25 2022

@author: NT950
"""

from tkinter import *

gui = Tk()
gui.title("counselor")
gui.geometry("500x500")

sb = Scrollbar(gui)
sb.pack(side = 'right', fill = 'y')

label = Label(gui, text = "counselor response 1")
label.pack()

lb = Listbox(gui, yscrollcommand=sb.set)
lb.insert(1, "그러면 어머니는 지민이가 자해하고 있다는 걸 모르시나 보구나")
lb.insert(2, "너랑 제일 친한 친구는 누구니?")
lb.pack(side='left')

label1 = Label(gui, text = "couselor response 2")
label1.pack()

lb1 = Listbox(gui, yscrollcommand=sb.set)
lb1.insert(1, "큰일난다고 했는데 좀 더 자세히 이야기해줄 수 있을까?")
lb1.insert(2, "그래도 엄마는 아셔야 하지 않을까?")
lb1.insert(3, "얼마가 알면 큰일 나는구나.")
lb1.pack(side = 'left')

Scrollbar.config(command = lb.yview)

gui.mainloop()




