import sys

ageAsString = input("What is your age?\n")
age = int(ageAsString)
# if age is even, print 2 4 6 8 ...; odd, print 1 3 5 7 ...

if (age/2) == int(age/2):  # even
    current = 2
else:  # odd
    current = 1
while True:
    if current <= age:
        print(current)
        current = current + 2
    else:
        print("The end!")
        break