def max_int_in_list(int_list):
    max_int = int_list[0]
    for x in int_list:
        if x > max_int:
            max_int = x
    return max_int
