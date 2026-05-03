loteria = [55,32,54,10,2,9]
myNumbers = [10,2,9,54,31,11]
hits = 0

for num in myNumbers:
    if num in loteria:
        hits +=1

print(f"Você acertou {hits} números")