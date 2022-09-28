# -*- coding: utf-8 -*-
"""
Created on Fri Aug 12 10:01:51 2022

@author: NT950
"""

from tkinter import *

window = Tk()
window.title("비밀 상담 상담사")
window.geometry('500x500')

scrollbar = Scrollbar(window)
scrollbar.pack(side = 'right', fill = 'y')

listbox = Listbox(window, width = 60)
listbox.insert(1, "그러면 어머니는 지민이가 자해하고 있다는 걸 모르시나 보구나")
listbox.insert(2, "너랑 제일 친한 친구는 누구니?")

listbox.pack(side='left', fill = 'both')

scrollbar.config(command=listbox.yview)

window.mainloop()