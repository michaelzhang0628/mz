def max_of_two( x, y ):
    if x > y:
        return x
    return y

def max_of_list(list):
    max = list[0]
    for number in list:
        max = max_of_two(max, number)
    return max

mylist = [9, 0.195, 18, 8]
biggest = max_of_list(mylist)
print(biggest)