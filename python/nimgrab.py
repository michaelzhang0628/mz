import random
random.seed(1)

def getPlayerChoice():
    playerchoice = int(input("How many wil you grab?"))
    while (playerchoice < 1) or (playerchoice > maxCanGrab):
        playerchoice = int(input("How many wil you grab? "))
    return playerchoice

def getCompChoice():
    remainder = numbersLeft % (maxCanGrab + 1)
    compChoice = remainder - 1
    if compChoice < 0:
        compChoice = (maxCanGrab + 1) + compChoice
    elif compChoice == 0:
        compChoice = random.randint(1, maxCanGrab)
    return compChoice

def printBoard(numbersLeft):
    board = ""
    for number in range(1, numbersLeft + 1):
        board += " " + str(number)
    print(" -" + board + " -")
    print()

def printFinalRecord(playerWins, compWins):
    print("Final Record: ")
    print("You won " + str(playerWins) + " games")
    print("I won " + str(compWins) + " games")
    print()
    print("Thank you for playing!")


maxCanGrab = 4
playerWins = 0
compWins = 0

while True:
    numbersLeft = 17
    while numbersLeft > 0:
        print("The maximum you can grab is " + str(maxCanGrab))
        print()
        printBoard(numbersLeft)
        playerChoice = getPlayerChoice()
        numbersLeft = numbersLeft - playerChoice
        compChoice = getCompChoice()
        print("You took " + str(playerChoice) + ", I took " + str(compChoice))
        print()
        print("-----------------------------------------------")
        print()
        if numbersLeft <= 0:
            print("The computer won")
            compWins += 1
            break
        else:
            numbersLeft = numbersLeft - compChoice
            if numbersLeft <= 0:
                print("The player won")
                playerWins += 1
                break
    again = input("Do you want to play again (Yes/No)? ")
    while (again != "y") and (again != "n"):
        again = input("Do you want to play again (Yes/No)? ")
    if again == "n":
        break

print()
printFinalRecord(playerWins, compWins)
