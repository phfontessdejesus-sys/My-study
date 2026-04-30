from math import hypot, floor

catetoOposto = float(input("Escolha o valor do Cateto Oposto: "))
catetoAdjacente = float(input("Escolha o valor do Cateto Adjacente: "))

print(floor(hypot(catetoOposto, catetoAdjacente)))