def sort1(unsorted_list):
    sorted_list = []
    # when the unsorted_list is not empty
    while unsorted_list:
        # find the smallest in the unsorted_list
        min = unsorted_list[0]
        for i in unsorted_list:
            if i < min:
                min = i
        # append the smallest to the sorted_list
        sorted_list.append(min)
        # remove the smallest from the unsorted_list
        unsorted_list.remove(min)
    return sorted_list

