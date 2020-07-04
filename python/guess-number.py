# computer generate a random intger between 1 - 10 without showing you.
# You guess it and see how many times it takes you to get it.
import random

size = 100
my_n = random.randrange(1, size)
lastDiff = size
count = 0
while True:
    your_n = int(input("Guess my number\n"))
    count = count + 1
    if your_n == my_n:
        print(f"Correct! It took you {count} times to get it.  You dumb head!")
        break
    else:
        diff = abs(your_n - my_n)
        if diff > lastDiff:
            print("colder")
        elif diff < lastDiff:
            print("warmer")
        else:
            print("same")
        lastDiff = diff

