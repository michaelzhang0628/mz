def removeBrackets(list1):
    listString = str(list1)
    listString = listString[1:len(listString) - 1]
    return listString

def isDivisibleBy(num, div):
    return num % div == 0


numMultiples = int(input("How many multiples of 5 do you want? "))

# Create a new empty list
multiples = []

# Add multiples of 5 to multiples using a for loop and the append() function
for i in range(1, numMultiples + 1):
    multiples.append(i * 5)

# Display the list using the removeBrackets() function
print("Multiples of 5: \n" + removeBrackets(multiples))
print()

# Remove the values in the list that are not a multiple of 10 using a
# for loop, if statement, the isDivisibleBy() and remove() functions.
# Loop through the elements of the list, not the indices. ex: for e in listName
newList = []
for num in multiples:
    if isDivisibleBy(num, 10):
        newList.append(num)
        multiples.remove(num)

# Display the list using the removeBrackets() function
print("List with values not divisible by 10 removed: \n" + removeBrackets(newList))
print()

print("oops, let put those numbers back in.")
print()

# Add the multiples of 5 that are not multiples of 10 back into the list.
# There should be no duplicates.
# Use a for loop, if statement, the isDivisibleBy() and append() functions.
for num in multiples:
    if not isDivisibleBy(num, 10):
        newList.append(num)

# Display the list using the removeBrackets() function
print("Multiples of 5 \n(unsorted): " + removeBrackets(newList))
print()

# Sort the list
newList.sort()

# Display the list using the removeBrackets() function
print("Multiples of 5 \n(sorted): " + removeBrackets(newList))