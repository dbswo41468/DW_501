from socket import *
import threading
import time
from tkinter import *
import tkinter.messagebox as megbox
import pyautogui as pag

root = Tk()
root.wm_attributes("-topmost", 1)
root.title('대화방')
root.geometry("300x300+100+100")
scroll = Scrollbar(root)
scroll.pack(side="right")
list = Listbox(root, width=200, height=280)
list.pack()

def Msgbox():
    megbox.showerror("톡봐라","경고경고!")


def send(sock):
    while True:
        sendData = input('>>>')
        sock.send(sendData.encode('utf-8'))
        if sendData != "":            
            list.insert(END, '윤재영 인턴 : '+sendData)
            list.see(END)


def receive(sock):
    while True:
        recvData = sock.recv(1024)
        list.insert(END, '사장님 : '+recvData.decode('utf-8'))
        list.see(END)
        if recvData.decode('utf-8') == "뭐하냐":
            pag.screenshot('C:/Users/dw-019/Desktop/공유/screen.png')
        elif recvData.decode('utf-8') == "톡봐라":
            Msgbox()
            
            
            
            


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
