from time import sleep

vel = int(input("Quanto km/h você está? "))

print("PROCESSANDO...")
sleep(2)

if (vel <=60):
    print("Você está na velocidade adequada.")
else:
    multa = (vel -60)*7
    print(f"VOCÊ ESTÁ ACIMA DA VELOCIDADE, MULTADO EM R${multa}")