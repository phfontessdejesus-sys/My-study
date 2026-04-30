import random

a1 = input("Primeiro Aluno: ")
a2 = input("Segundo Aluno: ")
a3 = input("Terceiro Aluno: ")
a4 = input("Quarto Aluno: ")
alunos = [a1,a2,a3,a4]

num = 1

if len(alunos) == 4:
    sorteado = random.randint(0,3)
    print("Grupo ",num, alunos[sorteado])
    del(alunos[sorteado])
num+= 1

if len(alunos) ==3:
    sorteado = random.randint(0,2)
    print("\nGrupo ",num, alunos[sorteado])
    del(alunos[sorteado])
num+=1

if len(alunos) ==2:
    sorteado = random.randint(0,1)
    print("\nGrupo ",num, alunos[sorteado])
    del(alunos[sorteado])
num+=1

if len(alunos) == 1:
    print("\nGrupo ",num, alunos[0])


