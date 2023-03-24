number_list = []
number = 100
sum = 0
while True:
    number = int(input("Enter a number (0 to quit): "))
    if number != 0:
        number_list.append(number)
        sum += number
        print(number_list)
    else:
        break

print()
print("Sum: " + str(sum))
print("Average: " + str(sum / len(number_list)))