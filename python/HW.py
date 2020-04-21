while True:
    text = input("How many pounds do you weigh?\n")
    if text == "quit":
        print("We are done. Bye!")
        break
    try:
        number = float(text)
        weight = number * .454
        print(f"You are {weight} kilograms heavy.")
    except ValueError:
        print(f"What you typed, {text}, is not a number.  Please try again.")
