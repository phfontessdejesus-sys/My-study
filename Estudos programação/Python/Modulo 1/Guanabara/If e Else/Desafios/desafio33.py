n1 = int(input("Digite o primeiro número: "))
n2 = int(input("Digite o segundo número: "))
n3 = int(input("Digite o terceiro número: "))
n4 = int(input("Digite o quarto número: "))

maior = n1
menor = n4

if(maior<n2):
    maior = n2
if(maior<n3):
        maior =n3
if(maior<n4):
        maior =n4

if (menor>n3):
    menor = n3
if(menor>n2):
    menor = n2
if(menor>n1):
    menor = n1
    
print(f"O maior número é {maior}")
print(f"O menor número é {menor}")
