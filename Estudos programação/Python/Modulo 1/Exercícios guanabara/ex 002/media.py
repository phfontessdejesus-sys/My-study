print("Sua média")

p1 = float(input("Nota da primeira prova: "))
p2 = float(input("Nota da segunda prova: "))
p3 = float(input("Nota da terceira prova: "))
p4 = float(input("Nota da quarta prova: "))

rf = (p1+p2+p3+p4)/4

print("Sua média foi {}".format(rf))

if rf >= 7:
    print("Parabéns você passou de ano!")
else:
    print("você reprovou!")