def mz_count(list):
    number = 0
    for item in list:
        number += 1
    return number

def mz_average(list):
    sum = 0
    for item in list:
        sum += item
    return (sum/mz_count(list))

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
    return 0


def mz_sort(list):
    return list


def mz_median(list):
    return 0


def mz_mode(list):
    return 0
