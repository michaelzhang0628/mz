while True:
    number = int(input("PLease type in a positive number : \n"))
    if number < 1:
        print(f"What the heck are you doing?  {number} is NOT positive.  Do it again.")
    else:
        print("Good job. ")
        break

print(f"The number is {number}")
