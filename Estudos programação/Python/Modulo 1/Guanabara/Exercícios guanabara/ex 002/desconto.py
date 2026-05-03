print("DESCONTO DE 5%")

n1 = float(input("Quanto custa o produto? "))
desconto = (n1*5)/100
vf = n1 - desconto

print("O seu produto custa {}, agora está custando {}".format(n1,vf))