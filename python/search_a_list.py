import random

random.seed(1)

def search_in_list(num_list, number):
    count = 0
    for item in num_list:
        if item == number:
            count += 1
    return count

numVals = 50
maxVal = 10
randomList = []
for i in range(0, numVals):
    n = random.randint(1, maxVal + 1)
    randomList.append(n)

print(randomList)
num = input("What are you looking for?")
print("The value " + num + " is in the list " + str(search_in_list(randomList, int(num))) + " time(s)")
