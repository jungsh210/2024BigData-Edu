# -*- coding: utf-8 -*-
"""
Created on Fri Aug 12 15:16:20 2022

@author: NT950
"""

import socket
from _thread import *
import threading
from tkinter import *
from time import sleep
import tkinter.ttk as ttk

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
    client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    client_socket.connect((HOST, PORT))

    threading.Thread(target=send, args= (client_socket,)).start()
    threading.Thread(target=receive, args= (client_socket,)).start()
    exit()

def try_login():
    global go_out
    start_new_thread(login,())
    login_button['state'] = 'disabled'
    logout_button['state'] = 'active'
    ip_entry['state'] = 'readonly'
    port_entry['state'] = 'readonly'
    response_button['state'] = 'active'
    response_button1['state'] = 'acvtive'
    response_button2['state'] = 'acvtive'
    response_button3['state'] = 'acvtive'
    response_button4['state'] = 'acvtive'
    response_button5['state'] = 'acvtive'
    response_button6['state'] = 'acvtive'
    response_button7['state'] = 'acvtive'
    response_button8['state'] = 'acvtive'
    response_button9['state'] = 'acvtive'
    response_button10['state'] = 'acvtive'
    response_button11['state'] = 'acvtive'
    response_button12['state'] = 'acvtive'
    response_button13['state'] = 'acvtive'
    response_button14['state'] = 'acvtive'
    response_button15['state'] = 'acvtive'
    response_button16['state'] = 'acvtive'
    response_button17['state'] = 'acvtive'
    response_button18['state'] = 'acvtive'
    response_button19['state'] = 'acvtive'
    response_button20['state'] = 'acvtive'
    go_out = False

def try_logout():
    global go_out
    login_button['state'] = 'active'
    logout_button['state'] = 'disabled'
    ip_entry['state'] = 'normal'
    port_entry['state'] = 'normal'
    response_button['state'] = 'active'
    response_button1['state'] = 'acvtive'
    response_button2['state'] = 'acvtive'
    response_button3['state'] = 'acvtive'
    response_button4['state'] = 'acvtive'
    response_button5['state'] = 'acvtive'
    response_button6['state'] = 'acvtive'
    response_button7['state'] = 'acvtive'
    response_button8['state'] = 'acvtive'
    response_button9['state'] = 'acvtive'
    response_button10['state'] = 'acvtive'
    response_button11['state'] = 'acvtive'
    response_button12['state'] = 'acvtive'
    response_button13['state'] = 'acvtive'
    response_button14['state'] = 'acvtive'
    response_button15['state'] = 'acvtive'
    response_button16['state'] = 'acvtive'
    response_button17['state'] = 'acvtive'
    response_button18['state'] = 'acvtive'
    response_button19['state'] = 'acvtive'
    response_button20['state'] = 'acvtive'
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
        listbox = Listbox(root, width = 50)
        listbox.insert(0, "그러면 어머니는 지민이가 자해하고 있다는 걸 모르시나 보구나. ")
        listbox.insert(1, "너랑 제일 친한 친구가 누구니? ")
        listbox.pack()
        message_input.insert(listbox)
        root.geometry("+230+590")
        root.mainloop()


        
def new_window_1():
        global new1
        new1 = Toplevel()
        new1.bind("<Button-1>")
        root1 = Tk()
        root1.title("Response select 2")
        listbox1 = Listbox(root1, width = 50)
        listbox1.insert(0, "큰일난다고 했는데 좀 더 자세히 이야기해 줄 수 있을까? ")
        listbox1.insert(1, "그래도 엄마는 아셔야 하지 않을까? ")
        listbox1.insert(2, "엄마가 알면 큰일 나는구나.")
        listbox1.pack()
        root1.mainloop()
        
def new_window_2():
        global new2
        new2 = Toplevel()
        new2.bind("<Button-1>")
        root2 = Tk()
        root2.title("Response select 3")
        listbox2 = Listbox(root2, width = 50)
        listbox2.insert(0, "그런 생각이 들면 엄마에게 알리고 싶지 않겠네. ")
        listbox2.insert(1, "아무리 그래도 규정 상 자해사실을 엄마에게 알려야 한단다. ")
        listbox2.insert(2, "엄마가 널 걱정해서 그러시는 거 아닐까? ")
        listbox2.pack()
        root2.mainloop()

def new_window_3():
        global new3
        new3 = Toplevel()
        new3.bind("<Button-1>")
        root3 = Tk()
        root3.title("Response select 4")
        listbox3 = Listbox(root3, width = 70)
        listbox3.insert(0, "그렇구나. 엄마에게 솔직하게 자해에 대해 알리고 싶지 않은 마음에 대해 더 이야기 해줄래?  ")
        listbox3.insert(1, "그러면 엄마에게는 안 알릴테니 상담에는 계속 오는 거다. ")
        listbox3.pack()
        root3.mainloop()

def new_window_4():
        global new4
        new4 = Toplevel()
        new4.bind("<Button-1>")
        root4 = Tk()
        root4.title("Response select 5")
        listbox4 = Listbox(root4, width = 70)
        listbox4.insert(0, "엄마가 화를 내기보다는 지민이의 이야기에 뒤기울어 주길 바라는 마음이 느껴지네. ")
        listbox4.insert(1, "엄마가 화가 많은 편이구나. ")
        listbox4.insert(2, "사춘기에 다 그럴 수 있지.")
        listbox4.pack()
        root4.mainloop()

def new_window_5():
        global new5
        new5 = Toplevel()
        new5.bind("<Button-1>")
        root5 = Tk()
        root5.title("Response select 6")
        listbox5 = Listbox(root5, width = 100)
        listbox5.insert(0, "엄마가 알게 되면 지민이가 왜 자해하게 되었는지 궁금하기보단 자해행동에 대해 화내고 혼내실 거라고 생각하는 구나. ")
        listbox5.insert(1, "그런 말을 들어서 상처를 많이 받았겠구나.  ")
        listbox5.insert(2, "어머니도 많이 놀라서 그런 말을 하지 않을까?")
        listbox5.pack()
        root5.mainloop()

def new_window_6():
        global new6
        new6 = Toplevel()
        new6.bind("<Button-1>")
        root6= Tk()
        root6.title("Response select 7")
        listbox6 = Listbox(root6, width = 100)
        listbox6.insert(0, "그래, 지민이가 이렇게 솔직하게 이야기해주니까 엄마에게 자해를 알리고 싶지 않은 마음이 더 잘 이해하게 되는 것 같다  ")
        listbox6.insert(1, "뭘 죄책감까지 들고 그러니? ")
        listbox6.insert(2, "평소에 죄책감을 많이 느끼나 보구나. ")
        listbox6.pack()
        root6.mainloop()

def new_window_7():
        global new7
        new7 = Toplevel()
        new7.bind("<Button-1>")
        root7 = Tk()
        root7.title("Response select 8")
        listbox7 = Listbox(root7, width = 150)
        listbox7.insert(0, "근데 우리가 상담 처음 시작할 때 나눈 내용을 기억나는지 모르겠지만, 내담자가 자신 또는 타인에게 해를 가하려고 할 때는 그 사실을 보호자, 담임교사에게 알리도록 되어있어.")
        listbox7.insert(1, "하지만. 보호자와 담임교사에게 너의 자해사실을 알리는 게 상담자의 의무야. ")
        listbox7.pack()
        root7.mainloop()

def new_window_8():
        global new8
        new8 = Toplevel()
        new8.bind("<Button-1>")
        root8 = Tk()
        root8.title("Response select 9")
        listbox8 = Listbox(root8, width = 110)
        listbox8.insert(0, "지금 상담 끝나고 바로 알리는 것은 아니고 지민이 너와 충분히 상의한 후에 꼭 필요한 사람들에게만 가장 안전한 방식으로 전달하려고 한단다. ")
        listbox8.insert(1, "(동의서를 보여주며) 동의한 내용을 보면 1번 조항에 나와 있단다. ")
        listbox8.pack()
        root8.mainloop()

def new_window_9():
        global new9
        new9 = Toplevel()
        new9.bind("<Button-1>")
        root9 = Tk()
        root9.title("Response select 10")
        listbox9 = Listbox(root9, width = 150)
        listbox9.insert(0, "지민이의 안전을 위해 엄마와 담임교사에게만 자해 사실을 알리고 상담에서 이야기하는 다른 내용에 대해서는 여전히 비밀유지를 할거야. ")
        listbox9.pack()
        root9.mainloop()  

def new_window_10():
        global new10
        new10 = Toplevel()
        new10.bind("<Button-1>")
        root10 = Tk()
        root10.title("Response select 11")
        listbox10 = Listbox(root10, width = 160)
        listbox10.insert(0, "엄마에게 알리는 것은 무엇보다 지민이의 안전을 위해서야. 자해 충동이 심하거나, 자해 중에 실수로 너무 깊게 베는 등 긴급상황이 발생했을 때 안전하고 빠른 조치를 취해야 하는 경우 도움을 받기 위해서란다. ")
        listbox10.insert(1, "학교 규정 상 보호자에게 알리는 게 상담자의 의무여서 보호자에게 알리고 협조를 구하게 되어 있어. ")
        listbox10.insert(2, "선생님이 말하는 게 싫으면 너가 직접 말하는 건 어때? ")
        listbox10.pack()
        root10.mainloop()  

def new_window_11():
        global new11
        new11 = Toplevel()
        new11.bind("<Button-1>")
        root11 = Tk()
        root11.title("Response select 12")
        listbox11 = Listbox(root11, width = 80)
        listbox11.insert(0, "그래. 엄마의 부정적인 반응이 예상되니까 충분히 그런 염려되는 마음이 들 것 같아. ")
        listbox11.insert(1, "해보지 않아서 모르는 게 아닐까? ")
        listbox11.insert(2, "모르겠구나. ")
        listbox11.pack()
        root11.mainloop()

def new_window_12():
        global new12
        new12 = Toplevel()
        new12.bind("<Button-1>")
        root12 = Tk()
        root12.title("Response select 13")
        listbox12 = Listbox(root12, width = 100)
        listbox12.insert(0, "어머니가 갑작스럽게 이 사실을 알게 되시면 그럴 수도 있을 것 같아. 만약 선생님이 협조를 구하면서 잘 말씀드려도 그러실까? ")
        listbox12.pack()
        root12.mainloop()             

def new_window_13():
        global new13
        new13 = Toplevel()
        new13.bind("<Button-1>")
        root13 = Tk()
        root13.title("Response select 14")
        listbox13 = Listbox(root13, width = 110)
        listbox13.insert(0, "좋아. 그러면 내가 지민이가 혼나지 않고, 어머니가 잘 이해하실 수 있게 말씀드려볼께. 어떻게 전달하면 좋을지 같이 이야기해볼까? ")
        listbox13.insert(1, "좋아. 선생님이 잘 이야기해볼께. ")
        listbox13.pack()
        root13.mainloop()   

        
def new_window_14():
        global new14
        new14 = Toplevel()
        new14.bind("<Button-1>")
        root14 = Tk()
        root14.title("Response select 15")
        listbox14 = Listbox(root14, width = 50)
        listbox14.insert(0, "엄마에게 우선 어떻게 연락을 하면 좋을 것 같니? ")
        listbox14.pack()
        root14.mainloop()       

def new_window_15():
        global new15
        new15 = Toplevel()
        new15.bind("<Button-1>")
        root15 = Tk()
        root15.title("Response select 16")
        listbox15 = Listbox(root15, width = 50)
        listbox15.insert(0, "그러면 미리 문자드리고 전화해서 약속을 잡으면 되겠구나. ")
        listbox15.pack()
        root15.mainloop()        
        
  
def new_window_16():
        global new16
        new16 = Toplevel()
        new16.bind("<Button-1>")
        root16 = Tk()
        root16.title("Response select 17")
        listbox16 = Listbox(root16, width = 500)
        listbox16.insert(0, "선생님이 어머니를 만나면 지민이가 요새 많이 우울하거나 힘든 데 어떻게 해야 할 지를 모를 때 손목을 커터 칼로 살짝 피를 내는 방법으로 자해를 하고 있다고 말씀드리고 지민이를 혼내지 마시고 지민이가 자해행동을 멈출 수 있게 도와달라고 부탁드릴려고 해. 혹시 엄마에게 알리고 싶지 않는 내용이 있니? ")
        listbox16.insert(1, "선생님이 노력을 해볼텐데... 엄마가 반응이 안 좋을 수도 있어. ")
        listbox16.pack()
        root16.mainloop()  
        

def new_window_17():
        global new17
        new17 = Toplevel()
        new17.bind("<Button-1>")
        root17 = Tk()
        root17.title("Response select 18")
        listbox17 = Listbox(root17, width = 80)
        listbox17.insert(0, "그래 알겠어. 너가 나를 믿어주는 만큼 어머님께 조심스럽게 얘기드려볼께. ")
        listbox17.insert(1, "그렇구나. 선생님이 다시 자해 상처 좀 확인해볼 수 있을까? ")
        listbox17.insert(2, "엄마도 자세히 알려면 보여드리는 게 좋지 않을까? ")
        listbox17.pack()
        root17.mainloop()
        
def new_window_18():
        global new18
        new18 = Toplevel()
        new18.bind("<Button-1>")
        root18 = Tk()
        root18.title("Response select 19")
        listbox18 = Listbox(root18, width = 50)
        listbox18.insert(0, "지금 마음은 어떠니? ")
        listbox18.insert(1, "생각보다 별거 아니지? ")
        listbox18.pack()
        root18.mainloop()
        
def new_window_19():
        global new19
        new19 = Toplevel()
        new19.bind("<Button-1>")
        root19 = Tk()
        root19.title("Response select 20")
        listbox19 = Listbox(root19, width = 110)
        listbox19.insert(0, "무섭고 두려웠을 텐데 선생님의 이야기를 잘 받아들여줘서 고맙다. 그리고 다음 회기에 만날 때까지 자해행동을 하지 않았으면 좋겠다. ")
        listbox19.pack()
        root19.mainloop()



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




''' Middle Menu '''
chat_frame = Frame(c_root)

def change_text():
    message_input.config(text = "response 1")
    
scrollbar = Scrollbar(chat_frame) ; scrollbar.pack(side='right',fill='y')
chat_log = Text(chat_frame, width = 62, height = 24, state = 'disabled', yscrollcommand = scrollbar.set) ; chat_log.pack(side='left')#place(x=20, y=60)
scrollbar['command'] = chat_log.yview
chat_frame.place(x=20, y=60)
# message_input = Button(c_root, text='response20', command=new_window_19) ; message_input.place(x=20,y = 390)
message_input = Text(c_root, width = 55, height = 4) ; message_input.place(x=20,y = 390)
send_button = Button(c_root, text = 'Send', command = lambda: set_go_send(None)); send_button.place(x=430, y=405)
message_input.bind("<Return>",set_go_send)

''' Bottom Menu '''

close_button = Button(c_root,text='Close',command=exit); close_button.place(x=200, y = 460)

response_button = Button(c_root,text='response1', command= new_window); response_button.place(x=20, y=520)

# response_button1 = Button(c_root,text='response2', command=change_text); response_button1.place(x=550, y=50)
# response_button2 = Button(c_root,text='response3', command=new_window_2); response_button2.place(x=550, y=82)
# response_button3 = Button(c_root,text='response4', command=new_window_3); response_button3.place(x=550, y=114)
# response_button4 = Button(c_root,text='response5', command=new_window_4); response_button4.place(x=550, y=146)
# response_button5 = Button(c_root,text='response6', command=new_window_5); response_button5.place(x=550, y=178)
# response_button6 = Button(c_root,text='response7', command=new_window_6); response_button6.place(x=550, y=210)
# response_button7 = Button(c_root,text='response8', command=new_window_7); response_button7.place(x=550, y=242)
# response_button8 = Button(c_root,text='response9', command=new_window_8); response_button8.place(x=550, y=274)
# response_button9 = Button(c_root,text='response10', command=new_window_9); response_button9.place(x=550, y=306)
# response_button10 = Button(c_root,text='response11', command=new_window_10); response_button10.place(x=550, y=338)
# response_button11 = Button(c_root,text='response12', command=new_window_11); response_button11.place(x=550, y=370)
# response_button12 = Button(c_root,text='response13', command=new_window_12); response_button12.place(x=550, y=402)
# response_button13 = Button(c_root,text='response14', command=new_window_13); response_button13.place(x=550, y=434)
# response_button14 = Button(c_root,text='response15', command=new_window_14); response_button14.place(x=550, y=466)
# response_button16 = Button(c_root,text='response17', command=new_window_16); response_button16.place(x=550, y=498)
# response_button17 = Button(c_root,text='response18', command=new_window_17); response_button17.place(x=550, y=530)
# response_button18 = Button(c_root,text='response19', command=new_window_18); response_button18.place(x=550, y=562)
# response_button19 = Button(c_root,text='response20', command=new_window_19); response_button19.place(x=550, y=594)



c_root.mainloop()