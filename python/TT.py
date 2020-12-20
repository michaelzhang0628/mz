def printBoard(board):
    print(board[7] + '|' + board[8] + '|' + board[9])
    print('-+-+-')
    print(board[4] + '|' + board[5] + '|' + board[6])
    print('-+-+-')
    print(board[1] + '|' + board[2] + '|' + board[3])


def gameInput(board):
    while True:
        user_input = input("Please enter a number that's posotive and <= 9\n")
        if not user_input.isnumeric():
            print(f"Please enter an integer between 1 and 9.")
            continue
        number = int(user_input)
        if number < 1 or number > 9:
            print(f"Please enter a number that's positive and <= 9 besides {number}")
            continue
        if board[number] != " ":
            print(f"The spot is taken.  Please enter a number that is not {number}")
            continue
        return number


def switchPlayer(turn):
    if turn == 'X':
        return 'O'
    elif turn == 'O':
        return 'X'


def testWinCondition(board):
    if board[7] == board[8] == board[9] != ' ':
        return True
    elif board[4] == board[5] == board[6] != ' ':
        return True
    elif board[1] == board[2] == board[3] != ' ':
        return True
    elif board[7] == board[4] == board[1] != ' ':
        return True
    elif board[8] == board[5] == board[2] != ' ':
        return True
    elif board[9] == board[6] == board[3] != ' ':
        return True
    elif board[7] == board[5] == board[3] != ' ':
        return True
    elif board[9] == board[5] == board[1] != ' ':
        return True
    else:
        return False


def test_tie_Condition(board):
    for i in range(1, 10):
        if board[i] == ' ':
            return False
    return True


def printIntro():
    print('Please enter the number corresponding to the position on a tic-tac-toe board.')
    print("Now let's start the game!")
    print('============================')
    print()


def game():
    gameBoard = [' '] * 10
    turn = 'X'
    count = 0
    printIntro()

    while True:
        printBoard(gameBoard)
        print("make your move")
        move = gameInput(gameBoard)
        gameBoard[move] = turn
        if testWinCondition(gameBoard):
            print(f'The {turn} player won.')
            printBoard(gameBoard)
            break
        if test_tie_Condition(gameBoard):
            print('Tie. Try again players.')
            printBoard(gameBoard)
            break
        turn = switchPlayer(turn)


game()
