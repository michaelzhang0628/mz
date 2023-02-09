import random
random.seed(1)

# Create a list of random values from 1 to maxVal
numVals = 50
maxVal = 10
randomlist = []
for i in range(0, numVals):
    n = random.randint(1,maxVal + 1)
    randomlist.append(n)
print (randomlist)
print ()

# Search a list (randomList) for a certain value and count the occurrences
