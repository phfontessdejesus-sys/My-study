lista = []
swapend = True

num = int(input("Quantos items você quer na lista? "))

for i in range(num):
    item = float(input("Digite o número: "))
    lista.append(item)

while swapend:
    swapend = False
    for i in range(len(lista) - 1):
        if (lista[i]>lista[i+1]):
            lista[i], lista[i+1] = lista[i+1], lista[i]
            swapend = True

print(lista)
