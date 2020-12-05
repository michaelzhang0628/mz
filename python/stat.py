from math import sqrt

def mz_count(list):
    number = 0
    for item in list:
        number += 1
    return number

def mz_average(list):
    sum = 0
    for item in list:
        sum += item
    return (sum / mz_count(list))

def mz_min(list):
    min = list[0]
    for item in list:
        if item < min:
            min = item
    return min

def mz_max(list):
    max = list[0]
    for item in list:
        if item > max:
            max = item
    return max

def mz_standard_deviation(list):
    a = mz_average(list)
    s = 0
    for number in list:
         s += ((number - a) ** 2)
    a_2 = (s/mz_count(list))
    return sqrt(a_2)

def mz_sort(unsorted):
    sorted = []
    while mz_count(unsorted) != 0:
        min = mz_min(unsorted)
        sorted.append(min)
        unsorted.remove(min)
    return sorted

def mz_median(list):
    sorted = mz_sort(list)
    if mz_count(sorted)%2 == 0:
        index = mz_count(sorted) // 2
        answer = (sorted[index - 1] + sorted[index]) / 2
    if mz_count(sorted)%2 == 1:
        index = mz_count(sorted) // 2
        answer = sorted[index]
    return answer

def mz_mode(list):
    return 0