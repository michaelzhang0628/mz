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

# standard deviation
# 1. get average
# 2. get the diff squared
# 3. average the diff squared
# 4. square root

numbers = [5,4,3,2,1,0]

# count
print(f"The count is {mz_count(numbers)}")
print(f"The count is {mz_count([2, 4, -1, 0.5])}")

# average
print(f"The average is {mz_average(numbers)}")
print(f"The average is {mz_average([2, 4, -1, 0.5])}")

# min, find the smallest
print(f"The smallest number is {mz_min(numbers)}")
print(f"The smallest number is {mz_min([2, 4, -1, 0.5])}")

# max, find the biggest number
print(f"The biggest number is {mz_max(numbers)}")
print(f"The biggest number is {mz_max([2, 4, -1, 0.5])}")