def string_reverse(str):
    result = ""
    for i in range(len(str)-1, -1, -1):
        result = result + str[i]
    return result

my_str = 'abc'
reversed_str = string_reverse(my_str)
print(reversed_str)
your_str = "878756333"
print(string_reverse("michael"))