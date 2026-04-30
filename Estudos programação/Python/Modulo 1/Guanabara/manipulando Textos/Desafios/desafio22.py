name = str(input("Qual o seu nome completo: ")).strip()

name = name.upper()
print(name)

name = name.lower()
print(name)

print(len(name)-name.count(" "))

name = name.split()
print(len(name[0]))