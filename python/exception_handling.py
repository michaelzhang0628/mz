while True:
    try:
        x = input("Please input your bottom number: ")
        y = 2/int(x)
        print(y)
        print("You are not dummy.  This time you input a reasonable value.")
    except ZeroDivisionError as zde:
        print("Encountered exception: ", zde)
    except:
        print("Other error happened")
    finally:
        print("Thank you! have a great day!")

