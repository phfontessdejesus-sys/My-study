lista = [11,10,5,2,4]

swapend = True

while swapend:
    swapend = False
    for i in range(len(lista)-1):
        if lista[i]>lista[i+1]:
            swapend = True
            lista[i], lista[i+1] = lista[i+1], lista[i]

print(lista)
