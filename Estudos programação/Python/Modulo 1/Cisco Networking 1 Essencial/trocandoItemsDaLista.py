lista = []

for i in range(100):
    lista.append(i)
    i+=1
print(lista)

i = 0
for i in range(len(lista) // 2):
    lista[i], lista[len(lista) - i - 1] = lista[len(lista) - i - 1], lista[i]

print(lista)
