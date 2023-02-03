import random


def printBoard(board):
    print(board[7] + '|' + board[8] + '|' + board[9])
    print('-+-+-')
    print(board[4] + '|' + board[5] + '|' + board[6])
    print('-+-+-')
    print(board[1] + '|' + board[2] + '|' + board[3])


def printIntro():
    print('Please enter the number corresponding to the position on a tic-tac-toe board.')
    printBoard('0123456789')
    print("Now let's start the game!")
    print('============================')
    print()


def gameInput(board):
    move = int(input('Enter next move'))
    while move > 9 or move < 1:
        print('Invalid move. Please enter another move.')
        move = int(input())

    while board[move] != ' ':
        print("That place is already filled.\nMove to another place?")
        move = int(input())
        while move > 9 or move < 1:
            print('Invalid move. Please enter another move.')
            move = int(input())
    return move


def testWinCondition(board):
    if board[7] == board[8] == board[9] != ' ':
        return True
    elif board[4] == board[5] == board[6] != ' ':
        return True
    elif board[1] == board[2] == board[3] != ' ':
        return True
    elif board[1] == board[4] == board[7] != ' ':
        return True
    elif board[2] == board[5] == board[8] != ' ':
        return True
    elif board[3] == board[6] == board[9] != ' ':
        return True
    elif board[7] == board[5] == board[3] != ' ':
        return True
    elif board[1] == board[5] == board[9] != ' ':
        return True
    else:
        return False


def searchGameBoard(board, turn):
    current_board = board.copy()
    for i in range(1, 10):
        if current_board[i] == ' ':
            current_board[i] = turn
            if testWinCondition(current_board):
                return i
            else:
                current_board = board.copy()
    return -1


def switchPlayer(turn):
    if turn == 'X':
        return 'O'
    else:
        return 'X'


def AIinput(board, AIturn):
    test = searchGameBoard(board, AIturn)
    if test > 0:
        return test
    test = searchGameBoard(board, switchPlayer(AIturn))
    if test > 0:
        return test
    if board[5] == ' ':
        return 5
    while True:
        test = random.randint(1, 9)
        if board[test] == ' ':
            return test

def game():
    gameBoard = [' '] * 10

    turn = 'X'
    count = 0
    printIntro()

    ans = input('Do you want to go first? y/n').lower()
    if ans == 'y':
        AIturn = 'O'
    else:
        AIturn = 'X'

    while True:
        printBoard(gameBoard)
        if turn == AIturn:
            move = AIinput(gameBoard, AIturn)
            print('AI moves to position', move)
        else:
            print("It's your turn," + turn + ". Move to which place?")
            move = gameInput(gameBoard)

        gameBoard[move] = turn
        count += 1

        if testWinCondition(gameBoard):
            printBoard(gameBoard)
            print("\nGame Over.\n")
            print(" **** " + turn + " won. ****")
            break

        if count == 9:
            print("\nGame Over.\n")
            print("It's a Tie!!")
            break

        turn = switchPlayer(turn)


game()
while (input("Do want to play again?(y/n)").lower() == 'y'):
    game()
print('Thanks for playing.')
