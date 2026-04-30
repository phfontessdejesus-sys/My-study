t1 = float(input("Digite o primeiro segmento: "))
t2= float(input("Digite o segundo segmento: "))
t3 = float(input("Digite o terceiro segmento: "))

seg = [t1, t2, t3]

maior = max(seg)
pos = seg.index(maior)
del seg[pos]
menores = sum(seg)

if (maior <menores):
    print("Pode acontecer esse segmento")
else:
    print("Esse segmento não pode acontecer")