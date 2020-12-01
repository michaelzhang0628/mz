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


"""
 Step 1: Find the mean.
    Step 2: For each data point, find the square of its distance to the mean.
    Step 3: Sum the values from Step 2.
    Step 4: Divide by the number of data points.
    Step 5: Take the square root.
"""


def mz_standard_deviation(list):
    a = mz_average(list)
    s = 0
    for number in list:
        sq = (number - a) ** 2
        s += sq
    a_2 = s/mz_count(list)
    sq_2 = sqrt(a_2)
    return sq_2


def mz_sort(list):
    return list


def mz_median(list):
    return 0


def mz_mode(list):
    return 0
