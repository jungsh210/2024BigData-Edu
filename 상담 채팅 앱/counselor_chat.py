# -*- coding: utf-8 -*-
"""
Created on Wed Sep  7 14:50:59 2022

@author: NT950
"""

counselor_name = input("이름을 입력해주세요: ")
print("{counselor_name} 선생님 상담을 시작하겠습니다. 클라이언트의 이름은 지민이 입니다.".format(counselor_name = counselor_name))
print("지민이는 현재 자해를 지속적으로 하고 있고 이 부분에 대해서 상담을 하고 싶어 합니다.")
print("{counselor_name}: 지금 자해를 지속적으로 하고 있다고 했는데 혹시 이런 사실을 누가 알고 있을까?".format(counselor_name))

print("지민: 제일 친한 친구만요.")

response = input("질문을 골라주세요: ")
print("----------------")
print('''
      1. 그러면 어머니는 지민이가 자해하고 있다는 걸 모르시나 보구나.
      2. 너랑 제일 친한 친구가 누구니? 
      ''')
if response == "1" :
    print("네 엄마가 알면 큰일나요.")
elif response == "2" :
    exit