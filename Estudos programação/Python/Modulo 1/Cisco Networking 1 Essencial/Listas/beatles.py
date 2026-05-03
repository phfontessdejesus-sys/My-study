# etapa 1
beatles = []

# etapa 2
print("Etapa 1:", beatles)
beatles.append("John Lennon")
beatles.append("Paul McCartney")
beatles.append("George Sutcliffe")
beatles.append("Pete Best")

print("Etapa 2:", beatles)

# etapa 3
for i in range(2):
    beatles.append(input("Escreva o nome dos cantores: "))

print("Etapa 3:", beatles)


# etapa 4
del beatles[3]
del beatles[4]
print("Etapa 4:", beatles)

# passo 5
beatles.insert(0, "Ringo Starr")
print("Etapa 5:", beatles)



# testando o tamanho da lista

("o fabuloso", len(beatles))

