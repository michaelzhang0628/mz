import pygame
from pygame.locals import *

# Initialize the game engine
pygame.init()

# Set up the window (surface)
DISPLAYSURF = pygame.display.set_mode((500, 400))

# Clock variables
FPS = 30
fpsClock = pygame.time.Clock()

# Colors
BLACK = (0, 0, 0)
WHITE = (255, 255, 255)
RED = (255, 0, 0)
GREEN = (0, 255, 0)
BLUE = (0, 0, 255)

# Variables for player Rect
moveXPlayer = 0
moveYPlayer = 0
moveAmnt = 5
playerWid = 50
playerHght = 95

# Create Rect Objects using variables
playerRect = pygame.Rect(moveXPlayer, moveYPlayer, playerWid, playerHght)

# Variables for enemy Rect
enemyX = 110
enemyY = 125
enemyWid = 40
enemyHght = 40
enemyMoveX = 5
enemyMoveY = 3

# Create Rect Objects using variables
enemyRect = pygame.Rect(enemyX, enemyY, enemyWid, enemyHght)

# Main Game Loop
while True:
    # Loop that handles quitting the program
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            pygame.quit()

    # Set background color to white
    DISPLAYSURF.fill(WHITE)

    # Moving player Rect
    if moveYPlayer == 0 and playerRect.right < DISPLAYSURF.get_width():
        # Move right
        playerRect.left += moveAmnt
        moveXPlayer += moveAmnt
    elif moveXPlayer == DISPLAYSURF.get_width() - playerRect.width and playerRect.bottom < DISPLAYSURF.get_height():
        # Move down
        playerRect.top += moveAmnt
        moveYPlayer += moveAmnt
    elif moveYPlayer == DISPLAYSURF.get_height() - playerRect.height and playerRect.left > 0:
        # Move left
        playerRect.left -= moveAmnt
        moveXPlayer -= moveAmnt
    elif moveXPlayer == 0 and playerRect.top > 0:
        # Move up
        playerRect.top -= moveAmnt
        moveYPlayer -= moveAmnt

    # Draw player using the Rect Object
    pygame.draw.rect(DISPLAYSURF, BLUE, playerRect)

    enemyRect = enemyRect.move(enemyMoveX, enemyMoveY)

    # Move enemy
    if (enemyRect.left < 100 or enemyRect.right > DISPLAYSURF.get_width() - 100):
        enemyMoveX *= -1

    if (enemyRect.top < 100 or enemyRect.bottom > DISPLAYSURF.get_height() - 100):
        enemyMoveY *= -1

    # Draw enemy using the Rect Object
    pygame.draw.rect(DISPLAYSURF, RED, enemyRect)

    # Update the graphics
    pygame.display.update()

    # Clock tick
    fpsClock.tick(FPS)