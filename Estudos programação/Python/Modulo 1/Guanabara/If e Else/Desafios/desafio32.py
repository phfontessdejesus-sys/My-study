from datetime import date

print("0 para o ano atual")
year = int(input("Qual ano você quer analisar? "))

if (year == 0):
    year = date.today().year
    if(year % 4 == 0 and year % 100 != 0 or year % 400 == 0):
        print(f"{year} é bissexto")
    else:
        print(f"{year} não é bissexto")
elif (year%4 == 0 and year %100 != 0 or year%400 ==0):
    print(f"{year} é bissexto")
else:
    print(f"{year} não é bissexto")
