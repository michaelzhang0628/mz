'''def octal_decimal(o_number):
    count = 0
    d_number = 0
    for character in o_number:
        count += 1
        d_number = d_number + int(character) * (8 ** (len(o_number) - count))
    return int(d_number)

def decimal_octal(d_number):
    o_number = ""
    while d_number >= 8:
        o_number = str(d_number % 8) + o_number
        d_number = d_number//8
    return str(d_number) + o_number

def convert_hexdecimal_character_to_number(ch):
    if ch.isnumeric():
        return int(ch)
    elif ch == "a":
        return 10
    elif ch == "b":
        return 11
    elif ch == "c":
        return 12
    elif ch == "d":
        return 13
    elif ch == "e":
        return 14
    elif ch == "f":
        return 15

def convert_number_to_hexdecimal(number):
    if number < 10:
        return str(number)
    elif number == 10:
        return "a"
    elif number == 11:
        return "b"
    elif number == 12:
        return "c"
    elif number == 13:
        return "d"
    elif number == 14:
        return "e"
    elif number == 15:
        return "f"

def hexdecimal_decimal(h_number):
    count = 0
    d_number = 0
    for character in h_number:
        count += 1
        d_number = d_number + convert_hexdecimal_character_to_number(character) * (16 ** (len(h_number) - count))
    return int(d_number)

def decimal_hexdecimal(d_number):
    h_number = ""
    while d_number >= 16:
        h_number = convert_number_to_hexdecimal(d_number % 16) + h_number
        d_number = d_number // 16
    return convert_number_to_hexdecimal(d_number) + h_number'''

'''def mz_standard_deviation(list):
    a = mz_average(list)
    s = 0
    for number in list:
         s += ((number - a) ** 2)
    a_2 = (s/mz_count(list))
    return sqrt(a_2)'''

'''def printBoard(board):
    print(board[7] + '|' + board[8] + '|' + board[9])
    print('-+-+-')
    print(board[4] + '|' + board[5] + '|' + board[6])
    print('-+-+-')
    print(board[1] + '|' + board[2] + '|' + board[3])

def gameInput(board):
    while True:
        number = int(input("Please enter a number that's posotive and <= 9\n"))
        if number<1 or number>9:
            print(f"Please enter a number that's positive and <= 9 besides {number}")
            continue
        if board[number] != " ":
            print(f"The spot is taken.  Please enter a number that is not {number}")
            continue
        return number

testBoard = list('#         $$$$')
printBoard(testBoard)
while True:
    move = gameInput(testBoard)
    testBoard[move] = "O"
    printBoard(testBoard)'''

'''import random

while True:
    yourRPS = input("Type in Rock, Paper, or Scissors.\n")
    myRPS = random.choice(["Rock", "Paper", "Scissors"])
    print(f"I got {myRPS}")
    if "Rock" == yourRPS:
        if "Rock" == myRPS:
            print("Tie.")
        elif "Paper" == myRPS:
            print("You lose!")
        elif "Scissors" == myRPS:
            print("You win!")
    elif "Paper" == yourRPS:
        if "Rock" == myRPS:
            print("You win!")
        elif "Paper" == myRPS:
            print("Tie.")
        elif "Scissors" == myRPS:
            print("You lose!")
    elif "Scissors" == yourRPS:
        if "Rock" == myRPS:
            print("You lose!")
        elif "Paper" == myRPS:
            print("You win!")
        elif "Scissors" == myRPS:
            print("Tie.")
    else:
        print("Bruh, what the heck are you doing? Are you dumb? Try again.")'''

