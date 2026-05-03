custoFabrica = float(input("Qual o custo da fábrica? "))
distribuidor = (custoFabrica*12)/100
imposto = (custoFabrica*45)/100

carro = custoFabrica + distribuidor + imposto

print("O custo do seu carro vai ser de {}".format(carro))
