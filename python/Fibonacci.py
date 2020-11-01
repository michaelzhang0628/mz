from math import sqrt

def fibonacci_recursive(term):
    if term <= 0:
        return 0
    elif term == 1:
        return 1
    else:
        return fibonacci_recursive(term - 1) + fibonacci_recursive(term - 2)


golden_ratio= sqrt(5) / 2 + 0.5
print(f"The golden ratio is {golden_ratio}")
print()
print()
count = 35
for i in range(1, count):
    f_ratio = fibonacci_recursive(i + 1) / fibonacci_recursive(i)
    print(i, end="\t\t\t\t")
    print(fibonacci_recursive(i), end="\t\t\t\t")
    print(fibonacci_recursive(i + 1), end="\t\t\t\t")
    print('{0:.15f}'.format(f_ratio), end="\t\t\t\t")
    print('{0:.15f}'.format(f_ratio - golden_ratio))