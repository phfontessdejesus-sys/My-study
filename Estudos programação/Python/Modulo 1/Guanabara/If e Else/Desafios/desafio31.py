d = int(input("Distância da viagem: "))

if(d>200):
    total =d*1.5
    print(f"Você vai pagar {total}")
else:
    total = d * 2
    print(f"Você vai pagar {total}")