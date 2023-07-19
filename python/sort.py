def getMin(list):
    min = list[0]
    for num in list:
        if num < min:
            min = num
    return min

def sort1(unsorted_list):
    sorted_list = []
    new_unsorted_list = unsorted_list.copy()
    # when the unsorted_list is not empty
    while len(new_unsorted_list) > 0:
        # find the smallest in the unsorted_list
        min = getMin(new_unsorted_list)
        # append the smallest to the sorted_list
        sorted_list.append(min)
        # remove the smallest from the unsorted_list
        new_unsorted_list.remove(min)
    return sorted_list

# find the index of the first bigger number than x in the list
def searchLinear(x, sorted_list, start, length):
    # if searching against 0 numbers, return the start
    if length == 0:
        return start
    # if the first in the list is bigger, return the start
    if x < sorted_list[start]:
        return start
    # return the index of the first bigger in the list
    for i in range(start + 1, start + length):
        if x < sorted_list[i]:
            return i
    # no number in the list is bigger, then return start + length
    return start + length

def sort2(unsorted_list):
    sorted_list = []
    for number in unsorted_list:
        sorted_list.insert(searchLinear(number, sorted_list, 0, len(sorted_list)), number)
    return sorted_list

# instead of searching sequentially, use binary search to improve performance
def searchBinary(x, sorted_list, start, length):
    # if less than 5 needs to be searched, use linear
    if length < 30:
        return searchLinear(x, sorted_list, start, length)
    # do binary search
    m = length // 2
    # checks if x is the same value as start plus m
    if sorted_list[start + m] == x:
        return start + m
    elif sorted_list[start + m] > x:
        return searchBinary(x, sorted_list, start, m)
    else:
        return searchBinary(x, sorted_list, start + m, length - m)

def sort3(unsorted_list):
    sorted_list = []
    for number in unsorted_list:
        sorted_list.insert(searchBinary(number, sorted_list, 0, len(sorted_list)), number)
    return sorted_list
