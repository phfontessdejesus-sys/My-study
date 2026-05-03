lista = []
num = int(input("Quantos elementos você quer? "))

for i in range(num):
    numbers = int(input(f"Número {i+1}: "))
    lista.append(numbers)

#MAIOR NÚMERO COM FOR
largest = lista[0]
for j in range(1, len(lista)):
    if (lista[j]>largest):
        largest = lista[j] #ISSO PODE SER SUBSTITUIDO POR MAX()
print(lista)

#ORDENANDO AS LISTAS
swappend = True

while swappend:
    swappend = False
    for i in range(len(lista)):
        if lista[i] > lista[i]+1:
            swappend = True
            lista[i], lista[i+1] = lista[i+1], lista[i]

print(f"Maior número é {largest}")
print(lista)

