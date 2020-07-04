# ask user to input 3 numbers
# tell user if these 3 numbers can be 3 sides of a triangle
# a < b + c, b < a + c, c < a + b, all have to work in order for it to be a triangle

user_input = input("Type in 3 numbers separated by comma.\n")
list = user_input.split(",")
if len(list) == 3:
    a = float(list[0])
    b = float(list[1])
    c = float(list[2])

    if a < b + c and b < a + c and c < a + b:
        print("well done.  it is a triangle")
    else:
        print(f"can not make a triangle from these numbers: {a}, {b}, and {c}")
else:
    print(f"No good. {len(list)} numbers you typed.  Please type in 3 numbers.")
