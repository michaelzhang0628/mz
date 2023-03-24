import math

# 1. Create a list called `numList` with the values 8, 2, 3, 0, 7 in it. Print `numList`.
numList = [8, 2, 3, 0, 7]
print(f"numList = {numList}")

# 2. Use a `for` loop to find the sum of the elements of `numList` and save it into a variable named `sum`. Assign the first index of `numList` the value of `sum`. Print `numList`.
sum = 0
for x in range(len(numList)):
    sum += numList[x]
    numList[0] = sum
print(f"numList = {numList}")

# 3. Append the value that is the length of the list to `numList`. Use the `len()` and `append()` functions to do this. Print `numList`.
numList.append(len(numList))
print(f"numList = {numList}")

# 4. Use a `for` loop to find the index of the smallest value in `numList`. Print  `index`.
index = 0
minValue = numList[0]
for x in range(1, len(numList)):
    if numList[x] < minValue:
        minValue = numList[x]
        index = x
print(f"Index = {index}")

# 5. Use the remove() and insert() function to remove the value at this index and then insert the value that is at the last index into the index found in step 4. Print numList.
val = numList.pop()
numList.insert(index, val)
numList = [20, 2, 3, 5, 7, 5]
print(f"numList = {numList}")

# 6. Use the count() function to count the number of times the value 5 appears in numList and save the value into a variable named count. Print count.
count = numList.count(5)
print(f"Count = {count}")

# 7. Use the remove() function and the value of count in a for loop to remove all instances of 5 from numList. Print numList.
for x in range(count):
    numList.remove(5)
print(f"numList = {numList}")

# 8. Create an empty list named sqrtsList. Save into this list the square roots of the elements in numList. Round each answer to 2 decimal places. Print sqrtsList.
sqrtsList = []
for x in numList:
    sqrt = round(math.sqrt(x), 2)
    sqrtsList.append(sqrt)
print(f"sqrtsList = {sqrtsList}")

# 9. Use the extend() function to add sqrtsList to numList. Print numList.
numList.extend(sqrtsList)
print(f"numList = {numList}")

# 10. Use the sort() function to sort numList in ascending order. Print numList.
numList.sort()
print(f"numList = {numList}")
