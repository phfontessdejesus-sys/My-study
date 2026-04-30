**Manipulando texto - Aula 09**



String = Cadeia de texto



Quando você atribui uma String a uma variável o computador pega cada caractere e atribui a um índice (Como se fosse uma lita).



Exemplo:

Frase = "Pedro"

\[P]\[e]\[d]\[r]\[o]

&#x20;0  1  2  3  4



* **Fatiamento**

Frase\[2] = "d"



Frase\[2:4] = "dr" ---> Não pega o último número



Frase\[0:4:2] = "Pd" ---> Aonde começa: Aonde termina: Salto

Frase\[:3] = "Ped" ---> Começa do zero e vai até o número

Frase\[2:] = "Pedro" ---> Começa no dois e vai até o final

Frase\[1::2] = "er" --->Começa no 1 e vai até o final de dois em dois



* **Análise**



len(Frase) ---> Saber o tamanho



Frase.count('e') --->Saber quantos "e" tem na variável

Frase.count('e', 0,4) --->Mesma coisa, mas em um lugar especifico



Frase.find("deo") --->Quantas vezes encontrou "deo", mostra aonde começa



**Se voltar -1 é porque não existi**



"Curso" in Frase --->Em frase tem "Curso"





* **Transformação**



frase.replace("Python","Android") ---> Faz a substituição do primeiro item pelo segundo



**O replace() não muda a variável, ele apenas muda em uma instância.**

**Se eu quiser que mude a variável vai precisar ser --->** frase = frase.replace("Pedro","João")



frase.upper() ---> Deixa tudo em maisculo



frase.lower() --->Deixa tudo em minusculo



frase.capatalize() --->Deixa todos os caracteres em minusculos, mas a primeira fica em maisculo



frase.title() ---> Análisa quantas palavras tem, e atráves do espaço ele deixa a próxima letra maiscula



frase.strip() --->Remove todos os espaços inuteis no começo e no final



frase.**r**strip() --->Remove somente os espaços inuteis no final



frase.**l**strip() --->Remove somente os espaços inuteis no começo





* **Divisão**



frase.split() ---> Pega os espaços e faz a divisão



\[ dividido = frase.split() ] --->Mostra a lista \[0]

\[ print(dividido\[0])       ] ---> "Pedro"



frase = "Pedro Henrique"

Normal = \[P]\[e]\[d]\[r]\[o]\[ ]\[H]\[e]\[n]\[r]\[i]\[q]\[u]\[e]

&#x20;         0  1  2  3  4  5  6  7  8  9 10 11 12 13



frase.split() ---> **\[**\[P]\[e]\[d]\[r]\[o]**]** **\[**\[H]\[e]\[n]\[r]\[i]\[q]\[u]\[e]**]**

&#x20;                   0  1  2  3  4   0  1  2  3  4  5  6  7

&#x20;                         \[**0]                   \[1]**



**split() Divide uma String em lista!!**





* **Junção**



"-".join(frase) --->Junta todos os elementos com esse separador "-"



"Pedro-Henrique"





**=============================================================**



print("""Testo giigante""")

