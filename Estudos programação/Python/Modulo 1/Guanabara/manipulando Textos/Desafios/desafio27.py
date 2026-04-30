name = input("Digite o seu nome completo: ").strip()

indice = name.split()
max = len(indice) - 1

print(name)
print(f"Primeiro nome: {indice[0]}")
print(f"Ultimo nome: {indice[len(name)-1]}")

