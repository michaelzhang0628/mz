while True:
    text = input("How many pounds do you weigh?\n")
    if text == 'quit':
        print(f"Have good day, chap!")
        break
    try:
        pounds = float(text)
        kilo = pounds * .454
        print(f"You weigh {kilo} kilograms")
    except ValueError:
        print(f"Your answer, {text}, is invalid. Please, try again.")
