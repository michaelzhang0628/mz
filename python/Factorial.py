def factorial(term):
    if term <= 1:
        return 1
    else:
        return term * factorial(term - 1)


term = int(input("May you be kind enough to give me a number.\n"))

print(f"{term}!={factorial(term)}")
