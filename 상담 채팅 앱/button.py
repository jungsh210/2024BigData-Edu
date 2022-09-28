# -*- coding: utf-8 -*-
"""
Created on Sun Sep 25 03:33:08 2022

@author: NT950
"""

import tkinter as tk


response1 = ("그러면 어머니는 지민이가 자해하고 있다는 걸 모르시나 보구나. ", "너랑 제일 친한 친구가 누구니? ")
response2 = ("큰일난다고 했는데 좀 더 자세히 이야기해 줄 수 있을까? ", "그래도 엄마는 아셔야 하지 않을까? ", "엄마가 알면 큰일 나는구나.")

response1 = {}
response2 = {}

total_price = 0


def show_meal():
    btn_response1.configure(bg="yellow")
    btn_response2.configure(bg="white")
    frame4.pack_forget()
    frame3.pack_forget()
    frame2.pack(fill="both", expand=True)
    frame4.pack(fill="both", expand=True)


def show_drink():
    btn_response1.configure(bg="white")
    btn_response2.configure(bg="yellow")
    frame4.pack_forget()
    frame2.pack_forget()
    frame3.pack(fill="both", expand=True)
    frame4.pack(fill="both", expand=True)


def meal_add(m):
    global price_meal, order_meal, total_price
    if m not in price_meal:
        print("입력한 메뉴가 존재하지 않습니다.")
    this_price = price_meal.get(m)
    total_price += this_price

    if m in order_meal:
        order_meal[m] = order_meal.get(m) + 1
    else:
        order_meal[m] = 1
    print_order()
    print_price()


def drink_add(m):
    global price_meal, order_meal, total_price
    if m not in price_drink:
        print("입력한 메뉴가 존재하지 않습니다.")
    this_price = price_drink.get(m)
    total_price += this_price

    if m in order_drink:
        order_drink[m] = order_drink.get(m) + 1
    else:
        order_drink[m] = 1
    print_order()
    print_price()


def print_order():
    global order_meal, order_drink

    tmp = ""
    price_tmp = 0
    for i in order_meal:
        tmp = tmp + i + " X " + str(order_meal.get(i)) +  " = " + str(price_tmp)+"\n"
    for i in order_drink:
        tmp = tmp + i + " X " + str(order_drink.get(i)) +  " = " + str(price_tmp)+"\n"

    text_1.delete('1.0', tk.END)
    text_1.insert(tk.INSERT, tmp)


def order_end():
    global total_price, order_meal, order_drink
    total_price = 0
    del order_meal
    del order_drink

    order_meal = {}
    order_drink = {}
    print_price()
    print_order()
    show_meal()


def print_price():
    global total_price
    label_price.configure(text=str(total_price)+" 원")

def button_click():
    print()

window = tk.Tk()
window.title("주문 프로그램")
window.geometry("600x400+500+300")
window.resizable(False, False)

frame1 = tk.Frame(window, width="600", height="10")
frame1.pack(fill="both")

frame2 = tk.Frame(window, width="600")
frame2.pack(fill="both", expand=True)

frame3 = tk.Frame(window, width="600")
# frame3.pack(fill="both", expand=True)

frame4 = tk.Frame(window, width="600", height="10")
frame4.pack(fill="both", expand=True)

btn_response1 = tk.Button(frame1, text="response1", padx="10", pady="10", bg="yellow", command=show_meal)
btn_response1.grid(row=0, column=0, padx=10, pady=10)

btn_response2 = tk.Button(frame1, text="response2", padx="10", pady="10", bg="white", command=show_drink)
btn_response2.grid(row=0, column=1, padx=10, pady=10)

btn_end = tk.Button(frame1, text="주문종료", padx="10", pady="10", command=order_end)
btn_end.grid(row=0, column=2, padx=10, pady=10)

label_price = tk.Label(frame1, text="0 원", width="20", padx=10, pady="10", fg="blue", font='Arial 15')
label_price.grid(row=0, column="3", padx="10", pady="10")

# 식사
btn_response1_1 = tk.Button(frame2, text="그러면 어머니는 지민이가 자해하고 있다는 걸 모르시나 보구나.", padx="10", pady="10", width="10")
btn_response1_1.grid(row=0, column=0, padx=10, pady=10)

# btn_response1_2 = tk.Button(frame2, text= "너랑 제일 친한 친구가 누구니? ", padx="10", pady="10", width="10", command=lambda: meal_add('라면'))
# btn_response1_2.grid(row=0, column=1, padx=10, pady=10)



# 음료
btn_response2_1 = tk.Button(frame3, text="아메리카노\n(3000원)", padx="10", pady="10", width="10", command=lambda: drink_add('아메리카노'))
btn_response2_1.grid(row=0, column=0, padx=10, pady=10)

btn_response2_2 = tk.Button(frame3, text="라떼\n(3500원)", padx="10", pady="10", width="10", command=lambda: drink_add('라떼'))
btn_response2_2.grid(row=0, column=1, padx=10, pady=10)

btn_response2_3 = tk.Button(frame3, text="아이스티\n(4000원)", padx="10", pady="10", width="10", command=lambda: drink_add('아이스티'))
btn_response2_3.grid(row=0, column=2, padx=10, pady=10)

btn_response2_4 = tk.Button(frame3, text="레몬에이드\n(4500원)", padx="10", pady="10", width="10", command=lambda: drink_add('레몬에이드'))
btn_response2_4.grid(row=0, column=3, padx=10, pady=10)

btn_response2_5 = tk.Button(frame3, text="딸기스무디\n(5000원)", padx="10", pady="10", width="10", command=lambda: drink_add('딸기스무디'))
btn_response2_5.grid(row=0, column=4, padx=10, pady=10)


# 주문 리스트
text_1 = tk.Text(frame4, height="10")
text_1.pack()

window.mainloop()