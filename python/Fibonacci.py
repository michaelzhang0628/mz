def fibonacci(term):
    if term <= 0:
        return 0
    elif term == 1:
        return 1
    else:
        return fibonacci(term - 1) + fibonacci(term - 2)


count = int(input("How many terms do you wish to see?\n"))

for i in range(count):
    print(fibonacci(i))