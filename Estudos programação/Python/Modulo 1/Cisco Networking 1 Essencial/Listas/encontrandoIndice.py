lista = []
num = int(input("Quantos números você quer na lista? "))

for i in range(num):
    numbers = int(input(f"Número {i+1}: "))
    lista.append(numbers)

Find = int(input("Qual número você quer encontrar? "))
found = False

i = 0
for i in range(1,len(lista)):
    found = lista[i] == Find
    if found:
        break

if found:
    print(f"O seu número está no índice {i}")
else:
    print("Não existi esse número na lista")