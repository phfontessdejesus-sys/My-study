num = input("Digite um número até 4 digitos: ")

num = " ".join(num)
num = num.split()

if (len(num) == 4):
    print(f"Unidade: {num[3]} ")
    print(f"Dezena: {num[2]}")
    print(f"Centena: {num[1]}")
    print(f"Milhar: {num[0]}")

elif (len(num) == 3):
    print(f"Unidade: {num[2]}")
    print(f"Dezena: {num[1]}")
    print(f"Centena: {num[0]}")
    print("Milhar: 0")

elif (len(num) == 2):
    print(f"Unidade: {num[1]}")
    print(f"Dezena: {num[0]}")
    print("Centena: 0")
    print("Milhar: 0")

elif(len(num) ==1):
    print(f"Unidade: {num[0]}")
    print("Dezena: 0")
    print("Centena: 0")
    print("Milhar: 0")




