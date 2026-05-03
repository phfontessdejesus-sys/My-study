my_list = [1, 2, 4, 4, 1, 4, 2, 6, 2, 9]
i = 0
while i < len(my_list):
        j = i + 1
        while j < len(my_list):
            if my_list[i] == my_list[j]:
                del my_list[j]
            else:
                j +=1
i+=1


print("A lista com os elementos exclusivos aqui")
print(my_list)
