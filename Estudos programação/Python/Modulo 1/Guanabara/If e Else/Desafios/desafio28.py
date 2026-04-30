import random
from time import sleep

num = int(input("Tente adivinhar o meu número de 0 a 5: "))

myNum = random.randint(0,5)

print("PROCESSANDO...")
sleep(3)

if (num == myNum):
    print("DROGRA VOCÊ ACERTOU")
else:
    print("VOCÊ ERROU!!!")

while (num != myNum):
    print("Você errou")
    num = int(input("Tente adivinhar o meu número de 0 a 5: "))
print("Você acertou")