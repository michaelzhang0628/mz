# ask user to type in r(ock), p(aper), s(cissors), and the computer will generate a random r/p/s.  See who wins.
import random

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
        print("Bruh, what the heck are you doing? Are you dumb? Try again.")
