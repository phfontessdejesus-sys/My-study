vogais = {"a","e","i","o","u"}
palavra = str(input("Insira uma palavra: ").lower())

count = sum(1 for letra in palavra if letra in vogais)

    #sum serve para contar os items de um dicionario
    #.lower serve para transformar letras maisculas em minusculas

print(f"A palavra {palavra} tem {count} vogais")
