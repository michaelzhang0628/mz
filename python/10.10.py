import pygame, sys, io, random
from pygame.locals import *

FPS = 30  # Frames per second setting
fpsClock = pygame.time.Clock()

pygame.init()
pygame.font.init()

# Dimensions for board
lineThickness = 3
frameWidth = 11
frameHeight = 10
blockWidth = 160
blockHeight = 100

# Return true if any side has won
def testWinCondition(board):
    if board[6] == board[7] == board[8] != "":
        return True
    elif board[3] == board[4] == board[5] != "":
        return True
    elif board[0] == board[1] == board[2] != "":
        return True
    elif board[0] == board[3] == board[6] != "":
        return True
    elif board[1] == board[4] == board[7] != "":
        return True
    elif board[2] == board[5] == board[8] != "":
        return True
    elif board[6] == board[4] == board[2] != "":
        return True
    elif board[0] == board[4] == board[8] != "":
        return True
    else:
        return False


# Checks if there is a way to win for either turn
def winningMove(turn):
    boardCopy = gameBoard.copy()
    for i in range(9):
        if boardCopy[i] == "":
            boardCopy[i] = turn
            if testWinCondition(boardCopy):
                return i
            else:
                boardCopy[i] = ""
    return -1

# Computer looks at the board and make a decision where "O" will be
# It returns an integer between 0 and 8
# Or it returns -1 when all blocks are picked
def computerMove():
    if winningMove("O") != -1:
        # Found a winning move for "O"
        return winningMove("O")
    elif winningMove("X") != -1:
        # Found a winning move for "X"
        return winningMove("X")
    elif gameBoard[4] == "":
        # Take the middle
        return 4
    else:
        # Randomly pick an unpicked block, only when there are any
        if "" in gameBoard:
            while True:
                test = random.randint(0, 8)
                if gameBoard[test] == "":
                    return test
        else:
            return -1

# Draw a "O" in the specified block on the screen
def drawO(screen, block):
    x = blockWidth * (block % 3) + blockWidth / 2 + frameWidth
    y = blockHeight * (block // 3) + blockHeight / 2 + frameHeight
    pygame.draw.circle(screen, BLACK, (x, y), 45, lineThickness)

# Draw a "X" in the specified block on the screen
def drawX(screen, block):
    x = blockWidth * (block % 3) + blockWidth / 2 + frameWidth
    y = blockHeight * (block // 3) + blockHeight / 2 + frameHeight
    pygame.draw.line(screen, BLACK, (x - 30, y - 30), (x + 30, y + 30), lineThickness)
    pygame.draw.line(screen, BLACK, (x - 30, y + 30), (x + 30, y - 30), lineThickness)

# Draw the board
def drawBoard(screen):
    pygame.draw.rect(screen, WHITE, (frameWidth, frameHeight,  blockWidth * 3, blockHeight * 3))
    pygame.draw.rect(screen, BLACK, (frameWidth, frameHeight,  blockWidth * 3, blockHeight * 3), lineThickness)
    pygame.draw.line(screen, BLACK, (frameWidth, frameHeight + blockHeight), (blockWidth * 3 + 9, frameHeight + blockHeight), lineThickness)
    pygame.draw.line(screen, BLACK, (frameWidth, frameHeight + 2 * blockHeight), (blockWidth * 3 + 9, frameHeight + 2 * blockHeight), lineThickness)
    pygame.draw.line(screen, BLACK, (frameWidth + blockWidth, frameHeight), (frameWidth + blockWidth, frameHeight + 3 * blockHeight), lineThickness)
    pygame.draw.line(screen, BLACK, (frameWidth + 2 * blockWidth, frameHeight), (frameWidth + 2 * blockWidth, frameHeight + 3 * blockHeight), lineThickness)
    for block in range(len(gameBoard)):
        if gameBoard[block] == "X":
            drawX(screen, block)
        elif gameBoard[block] == "O":
            drawO(screen, block)

# Draw a text box
def drawText(screen, text, offset):
    textSurf = directionFont.render(text, True, BLACK)
    testRect = textSurf.get_rect()
    testRect.left = (winWid - testRect.width) / 2
    testRect.top = frameHeight + 3 * blockHeight + lineThickness + offset
    screen.blit(textSurf, testRect)


# Colors
BLACK = [0, 0, 0]
WHITE = [255, 255, 255]

# Set up the window
winWid = blockWidth * 3 + frameWidth * 2 + lineThickness * 4
winHGT = blockHeight * 3 + frameHeight + lineThickness * 4 + 100
DISPLAYSURF = pygame.display.set_mode((winWid, winHGT))

# Board that will be played on
gameBoard = ["", "", "", "", "", "", "", "", ""]

# Font
directionFont = pygame.font.Font(pygame.font.get_default_font(), 15)

# Text that the direction will say
instructionText = "Click on square to select. Press space bar to reset"

# Is the current game over?
gameOver = False

# Keep record
winCount = 0
loseCount = 0
tieCount = 0

# Run the game loop
while True:
    for event in pygame.event.get():
        if event.type == QUIT:
            pygame.quit()
            sys.exit()
        elif event.type == MOUSEBUTTONDOWN:
            if event.button == 1:
                # When left mouse button is clicked
                if not gameOver:
                    # Get the mouse position
                    mousePos = pygame.mouse.get_pos()
                    x = mousePos[0]
                    y = mousePos[1]
                    # if the click is inside the board
                    if frameWidth < x < (blockWidth * 3 + lineThickness * 3) and frameHeight < y < (frameHeight + 3 * blockHeight + lineThickness * 3):
                        # Place "X" in the block where the click is, only when it is not already picked
                        blockNumber = int((x - frameWidth) // (blockWidth + lineThickness) + (y - frameHeight) // (blockHeight + lineThickness) * 3)
                        if gameBoard[blockNumber] == "":
                            gameBoard[blockNumber] = "X"
                            if testWinCondition(gameBoard):
                                # Player won
                                instructionText += " You Won!"
                                gameOver = True
                                winCount += 1
                            else:
                                # Computer will calculate and place "O"
                                move = computerMove()
                                if move != -1:
                                    # Computer place "O" on the block
                                    gameBoard[move] = "O"
                                    if testWinCondition(gameBoard):
                                        # Computer won
                                        instructionText = "Click on square to select. Press space bar to reset."
                                        instructionText += " You Lost!"
                                        gameOver = True
                                        loseCount += 1
                                else:
                                    # It is a draw. No one wins
                                    instructionText = "Click on square to select. Press space bar to reset."
                                    instructionText += " It's a draw!"
                                    gameOver = True
                                    tieCount += 1

        elif event.type == pygame.KEYDOWN:
            if event.key == pygame.K_SPACE:
                gameBoard = ["", "", "", "", "", "", "", "", ""]
                instructionText = "Click on square to select. Press space bar to reset."
                gameOver = False

    # Draw background
    DISPLAYSURF.fill(WHITE)

    # Draw board
    drawBoard(DISPLAYSURF)

    # Draw instruction
    drawText(DISPLAYSURF, instructionText, 10)

    # Draw record
    recordText = "Win: " + str(winCount) + "   Lose: " + str(loseCount) + "   Tie: " + str(tieCount)
    drawText(DISPLAYSURF, recordText, 30)

    pygame.display.update()
    fpsClock.tick(FPS)

# TODO put colors and make it pretty