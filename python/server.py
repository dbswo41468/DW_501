from socket import *
import threading
import time
from tkinter import *

root = Tk()
root.title('대화방')
root.geometry("300x300+100+100")
scroll = Scrollbar(root)
scroll.pack(side="right")
list = Listbox(root, width=200, height=280)
list.pack()


def send(sock):
    while True:
        sendData = input('>>>')
        sock.send(sendData.encode('utf-8'))
        if sendData != "":            
            list.insert(END, '나 : '+sendData)
            list.see(END)


def receive(sock):
    while True:
        recvData = sock.recv(1024)
        list.insert(END, '상대방 : '+recvData.decode('utf-8'))
        list.see(END)
            
            
            


port = 9080

serverSock = socket(AF_INET, SOCK_STREAM)
serverSock.bind(('', port))
serverSock.listen(1)

print('%d번 포트로 접속 대기중...'%port)

connectionSock, addr = serverSock.accept()

print(str(addr), '에서 접속되었습니다.')

sender = threading.Thread(target=send, args=(connectionSock,))
receiver = threading.Thread(target=receive, args=(connectionSock,))

sender.start()
receiver.start()
root.mainloop()

while True:
    time.sleep(1)
    pass
