myList = [5, 7, 3, -2, 1, 4, 6, -9, 0, 10, 15]
newList = []
for x in (myList):
    if x > 0:
        newList.append(x)

newList.sort()
newList.reverse()
print(newList)