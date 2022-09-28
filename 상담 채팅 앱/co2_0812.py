# -*- coding: utf-8 -*-
"""
Created on Fri Aug 12 09:04:57 2022

@author: NT950
"""

import socket, threading

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client.connect(('127.0.0.1', 8080))
nickname = input("Choose your nickname: ")


def receive():
    while True:
        try:
            message = client.recv(1024).decode('ascii')
            if message == 'NICKNAME':
                client.send(nickname.encode('ascii'))
            else:
                print(message)
        except:
            print("An error occured!")
            client.close()
            break


def write():
    while True:
        message = '{}: {}'.format(nickname, input(''))
        client.send(message.encode('ascii'))


# 멀티 클라이언트용 쓰레드
receive_thread = threading.Thread(target=receive)
receive_thread.start()

# 메시지 보내기
write_thread = threading.Thread(target=write)
write_thread.start()