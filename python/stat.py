def mz_count(list):
    count = 0
    for item in list:
        count = count + 1
    return count

def mz_average(list):
    sum = 0
    for item in list:
        sum = sum + item
    average = sum / mz_count(list)
    return average

def mz_min(list):
    min = 0
    for number in list:
        if number < min:
            min = number
    return min

def mz_max(list):
    max = 0
    for number in list:
        if number > max:
            max = number
    return max

def mz_sd(list):
    avg = mz_average(list)
    sumOfSquare = 0
    for item in list:
        square = pow(item - avg, 2)
        sumOfSquare = sumOfSquare + square
    avgOfSquare = sumOfSquare/mz_count(list)
    result = pow(avgOfSquare, 1/2)
    return result

numbers = [5, 4, 3, 2, 1, 0]
moreNumbers = [2, 4, -1, 0.5]

print(f"The count is {mz_count(numbers)}")
print(f"The count is {mz_count(moreNumbers)}")

print(f"The average is {mz_average(numbers)}")
print(f"The average is {mz_average(moreNumbers)}")

print(f"The smallest number is {mz_min(numbers)}")
print(f"The smallest number is {mz_min(moreNumbers)}")

print(f"The biggest number is {mz_max(numbers)}")
print(f"The biggest number is {mz_max(moreNumbers)}")

print(f"The standard deviation of the numbers is {mz_sd(numbers)}")
print(f"The standard deviation number is {mz_sd(moreNumbers)}")