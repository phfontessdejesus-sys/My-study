vogais = {"a","e","i","o","u"}
palavra = str(input("Escolha uma palavra: ").lower())

count = sum(1 for letra in palavra if letra in vogais)
print(f"Sua palavra: {palavra} tem {count} vogais")