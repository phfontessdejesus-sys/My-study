salary = float(input("Digite o seu salário: "))

if (salary<5000):
    salary = salary + (salary*.15)
    print(f"Seu novo salário é de R${salary:.2f}")
else:
    salary = salary + (salary*0.1)
    print(f"Seu novo salary é de R${salary:.2f} ")