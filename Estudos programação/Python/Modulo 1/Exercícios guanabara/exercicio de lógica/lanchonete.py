hamburguer = 3
cheeseburguer = 2.50
fritas = 2.50
refrigerante = 1
milkshake = 3

nome = input("Qual o seu nome? ")

H = input("Você pediu hamburguer? ")
if H =='sim':
    QH = int(input("Quantos? "))
else:
    QH = 0

C = input("Você pediu cheeseburguer? ")
if C =='sim':
   QC = int(input("Quantos? "))
else:
    QC = 0

F = input("Você pediu fritas? ")
if F =='sim':
    QF = int(input("Quantos? "))
else:
    QF = 0

R = input("Você pediu refrigerante? ")
if R == 'sim':
    QR = int(input("Quatos? "))
else:
    QR = 0 

M = input("Você pediu milkshake? ")
if M == 'sim':
    QM = int(input("Quantos? "))
else:
    QM = 0  

pagar = (hamburguer*QH) + (cheeseburguer*QC) + (fritas*QF) + (refrigerante*QR) + (milkshake*QM)

print("{} a sua conta foi de R${}".format(nome,pagar))