def getMin(list):
    min = list[0]
    for num in list:
        if num < min:
            min = num
    return min

def sort1(unsorted_list):
    sorted_list = []
    # when the unsorted_list is not empty
    while len(unsorted_list) > 0:
        # find the smallest in the unsorted_list
        min = getMin(unsorted_list)
        # append the smallest to the sorted_list
        sorted_list.append(min)
        # remove the smallest from the unsorted_list
        unsorted_list.remove(min)
    return sorted_list

# TODO instead of searching sequentially, use binary search to improve performance
def findIndexOfFirstBiggerNum(to_be_compared, sorted_list):
    for i in range(len(sorted_list)):
        if to_be_compared < sorted_list[i]:
            return i
    return len(sorted_list)

def insertNumToSortedList(to_be_inserted, sorted_list):
    sorted_list.insert(findIndexOfFirstBiggerNum(to_be_inserted, sorted_list), to_be_inserted)
    return sorted_list

def sort2(unsorted_list):
    sorted_list = []
    for num in unsorted_list:
        insertNumToSortedList(num, sorted_list)
    return sorted_list
