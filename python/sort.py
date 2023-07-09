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

def insertNumToSortedList(to_be_inserted, sorted_list):
    for i in range(len(sorted_list)):
        if sorted_list[i] > to_be_inserted:
            # i is the index of the first number in the sorted_list that is bigger than to_be_inserted
            sorted_list.insert(i, to_be_inserted)
            return sorted_list
    # no number in the sorted_list is bigger than to_be_inserted
    sorted_list.append(to_be_inserted)
    return sorted_list

def sort2(unsorted_list):
    sorted_list = []
    for num in unsorted_list:
        insertNumToSortedList(num, sorted_list)
    return sorted_list


