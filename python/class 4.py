def list_sum(n):
    sum = 0
    for x in n:
        sum = sum + x
    return sum

my_list = [8, 2, 3, 0, 7]
my_sum = list_sum(my_list)
print('Sum of my_list is', my_sum)

your_list = [8, 2, 3, 90, 7, -1, 7889, -0.3]
print('Sum of your_list is', list_sum(your_list))

his_list = [9, -8]
print('Sum of his_list is', list_sum(his_list))
