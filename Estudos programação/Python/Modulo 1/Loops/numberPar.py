while True:
    number = int(input("Digite um número par: "))
    if number %2 == 0:
        print("Você digitou um número par, muito obrigado!")
        break
    else:
        print("Você digitou um número impar")

print("Obrigado, acabou")