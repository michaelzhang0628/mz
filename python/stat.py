numbers = [30, -17, 22, 81, 12, -36, 1]
print(f"{numbers} is a list")
count = len(numbers)
print(f"This list has {count} numbers")

# average
sum = 0
for item in numbers:
    sum = sum + item
print(f"The total is {sum}")
average = sum / count
print(f"The average is {average}")

# min, find the smallest
min = 0
for currentNumber in numbers:
    if currentNumber < min:
        min = currentNumber
print(f"The smallest number is {min}.")

# max, find the biggest number
max = 0
for currentNumber in numbers:
    if currentNumber > max:
        max = currentNumber
print(f"The biggest number is {max}.")


# standard deviation
# 1. get average
# 2. get the diff squared
# 3. average the diff squared
# 4. square root

