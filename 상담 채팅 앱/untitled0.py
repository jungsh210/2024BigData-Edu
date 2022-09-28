# -*- coding: utf-8 -*-
"""
Created on Mon Sep 26 09:49:39 2022

@author: NT950
"""

from tkinter import *            # tkinter 라이브러리에 모든 함수를 사용하겠다.
root = Tk()                      # root라는 창을 생성
root.geometry("1000x800")       # 창 크기설정
root.title("chat")    # 창 제목설정
root.option_add("*Font","맑은고딕 25") # 폰트설정
root.resizable(False, False)  # x, y 창 크기 변경 불가


def btnpress():                   # 함수 btnpress() 정의
    a = []
    if chkvar.get() == 1:         # 체크박스가 체크 되었는지 확인
        a.append("그러면 어머니는 지민이가 자해하고 있다는 걸 모르시나 보구나.")
        lb.config(text="client: 네, 엄마가 알면 큰일나요.") 
    if chkvar1.get() == 1:
        a.append("너랑 제일 친한 친구가 누구니?")
        lb.config(text="client: ........") 
    a.append("선택되었습니다.")
                # 레이블에 값 입력
    
chkvar = IntVar()                             # chkvar에 int 형으로 값을 저장
chkbox = Checkbutton(root, variable=chkvar)   # root라는 창에 체크박스 생성
chkbox.config(text="그러면 어머니는 지민이가 자해하고 있다는 걸 모르시나 보구나.")                  # 체크박스 내용 설정
chkbox.pack()                                 # 체크박스 배치

chkvar1 = IntVar()                            # chkvar1에 int 형으로 값을 저장
chkbox1 = Checkbutton(root, variable=chkvar1) # root라는 창에 체크박스 생성
chkbox1.config(text="너랑 제일 친한 친구가 누구니?")                      # 체크박스 내용 설정
chkbox1.pack()                                # 체크박스 배치

# chkvar2 = IntVar()                            # chkvar2 에 int 형으로 값을 저장
# chkbox2 = Checkbutton(root, variable=chkvar2) # root라는 창에 체크박스 생성
# chkbox2.config(text="Java")                   # 체크박스 내용 설정
# chkbox2.pack()                                # 체크박스 배치
    
btn = Button(root)                # root라는 창에 버튼 생성
btn.config(text= "선택")          # 버튼 내용 
btn.config(width=10)              # 버튼 크기
btn.config(command=btnpress)      # 버튼 기능 (btnpree() 함수 호출)
btn.pack()                        # 버튼 배치

lb = Label(root)                 # root라는 창에 레이블 생성
lb.pack()                        # 레이블 배치

root.mainloop()                  # 창 실행