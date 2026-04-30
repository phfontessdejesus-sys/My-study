frase = input("Digite uma frase: ").strip()

frase = frase.lower()
print("Tem ",frase.count('a')," A na frase")

print("O primeiro a está na posição: ",frase.find('a')+1),frase.count(" ")
print("O ultimo a está na posição: ",frase.rfind('a')+1),frase.count(" ")