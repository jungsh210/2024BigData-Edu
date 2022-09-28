# -*- coding: utf-8 -*-
"""
Created on Wed Aug 10 17:45:16 2022

@author: NT950
"""

import socket
from _thread import *
import threading
from tkinter import *
from time import sleep

def send(socket):
    global go_send
    while True:
        if go_send:
            message = (message_input.get(1.0,"end")).rstrip()
            socket.send(message.encode())
            message_input.delete(1.0, "end")
            go_send = False
        else:
            if go_out:
                socket.close()
                exit()
            sleep(0.1)

def receive(socket):
    first = True
    while True:
        try:
            data = socket.recv(1024)
            chat_log['state'] = 'normal'
            if first: # 이걸 처음 체크 이후 의미없이 매번 체크하므로 이렇게 하는 건 효율적이지 않음.
                chat_log.insert("end",str(data.decode( )))
                first = False
            else:
                chat_log.insert("end",'\n' + str(data.decode()))
                chat_log.see('end')
            chat_log['state'] = 'disabled'
        except ConnectionAbortedError as e:
            chat_log['state'] = 'normal'
            chat_log.insert("end", '\n[System] 접속을 종료합니다.\n')
            chat_log['state'] = 'disabled'
            exit()

def login():
    # 서버의 ip주소 및 포트
    HOST = ip_entry.get(); PORT = int(port_entry.get())
    counselor_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    counselor_socket.connect((HOST, PORT))
    threading.Thread(target=send, args= (counselor_socket,)).start()
    threading.Thread(target=receive, args= (counselor_socket,)).start()
    exit()

def try_login():
    global go_out
    start_new_thread(login,())
    login_button['state'] = 'disabled'
    logout_button['state'] = 'active'
    ip_entry['state'] = 'readonly'
    port_entry['state'] = 'readonly'
    # response_button['state'] = 'active'
    go_out = False

def try_logout():
    global go_out
    login_button['state'] = 'active'
    logout_button['state'] = 'disabled'
    ip_entry['state'] = 'normal'
    port_entry['state'] = 'normal'
    # response_button['state'] = 'active'
    go_out = True

def set_go_send(event):
    global go_send
    go_send = True

def new_window():
        global new
        new = Toplevel()
        new.bind("<Button-1>")
        root = Tk()
        root.title("Response select 1")
        listbox = Listbox(root, selectmode= "extended", width = 200)
        listbox.insert(0, "그러면 어머니는 지민이가 자해하고 있다는 걸 모르시나 보구나. ")
        listbox.insert(1, "너랑 제일 친한 친구가 누구니? ")
        listbox.pack()
        root.mainloop()
        
        
    

go_out, go_send = False, False
c_root = Tk()
c_root.geometry('700x700')
c_root.title('counselor')
c_root.resizable(False, False)



''' Top Menu '''
Label(c_root, text = 'Server IP : ').place(x=20, y=20)
Label(c_root, text = 'Port : ').place(x=250, y=20)
ip_entry = Entry(c_root, width=14); ip_entry.place(x=83, y=21)
ip_entry.insert(0,'127.0.0.1')
port_entry = Entry(c_root, width=5); port_entry.place(x = 290, y=21)
port_entry.insert(0,'9999')
login_button = Button(c_root,text='Log In', command=try_login); login_button.place(x=350, y=18)
logout_button = Button(c_root,text='Log Out',state = 'disabled', command = try_logout); logout_button.place(x=420, y=18)
# response_button = Button(c_root,text='response1', command=new_window); response_button.place(x=550, y=18)

''' Middle Menu '''
chat_frame = Frame(c_root)
scrollbar = Scrollbar(chat_frame) ; scrollbar.pack(side='right',fill='y')
chat_log = Text(chat_frame, width = 62, height = 24, state = 'disabled', yscrollcommand = scrollbar.set) ; chat_log.pack(side='left')#place(x=20, y=60)
scrollbar['command'] = chat_log.yview
chat_frame.place(x=20, y=60)
message_input = Text(c_root, width = 55, height = 4) ; message_input.place(x=20,y = 390)
send_button = Button(c_root, text = 'Send', command = lambda: set_go_send(None)); send_button.place(x=430, y=405)
message_input.bind("<Return>",set_go_send)


''' Bottom Menu '''
close_button = Button(c_root,text='Close',command=exit); close_button.place(x=200, y = 460)

c_root.mainloop()