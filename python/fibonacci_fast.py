from math import sqrt


def init_fibonacci_sequence(term):
    seq = [0, 1]
    for i in range(2, term + 1):
        seq.append(seq[i-2] + seq[i-1])
    return seq

golden_ratio= sqrt(5) / 2 + 0.5
print(f"The golden ratio is {golden_ratio}")
print()
print()
count = 1000
fibonacci_sequence = init_fibonacci_sequence(count)
for i in range(1, count):
    f_ratio = fibonacci_sequence[i + 1] / fibonacci_sequence[i]
    print(i, end="\t\t\t\t")
    print(fibonacci_sequence[i], end="\t\t\t\t")
    print(fibonacci_sequence[i + 1], end="\t\t\t\t")
    print('{0:.15f}'.format(f_ratio), end="\t\t\t\t")
    print('{0:.30f}'.format(f_ratio - golden_ratio))
