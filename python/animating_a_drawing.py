import pygame
from pygame.locals import *

# Initialize the game engine
pygame.init()

# Set up the window (surface)
DISPLAYSURF = pygame.display.set_mode((600, 500))

# Clock variables
FPS = 30
fpsClock = pygame.time.Clock()

# Colors in RGB Values
BLACK = (0, 0, 0)
WHITE = (255, 255, 255)
RED = (255, 0, 0)
GREEN = (0, 255, 0)
BLUE = (0, 0, 255)

# Create player
moveXPlayer = 0
moveYPlayer = 0
playerWid = 50
playerHght = 95
playerRect = pygame.Rect(moveXPlayer, moveYPlayer, playerWid, playerHght)
moveAmnt = 5

# Create Enemy
enemyStartX = 110
enemyStartY = 125
enemyWid = 40
enemyHght = 40
enemyRect = pygame.Rect(enemyStartX, enemyStartY, enemyWid, enemyHght)
enemyMoveX = 2
enemyMoveY = 2

while True:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            pygame.quit()

    # Set background color to white
    DISPLAYSURF.fill(WHITE)

    # Move player
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

    # Move enemy
    enemyRect = enemyRect.move(enemyMoveX, enemyMoveY)
    if enemyRect.left < 50 or enemyRect.right > DISPLAYSURF.get_width() - 50:
        enemyMoveX *= -1
    if enemyRect.top < 50 or enemyRect.bottom > DISPLAYSURF.get_height() - 50:
        enemyMoveY *= -1

    # Draw enemy using the Rect Object
    pygame.draw.rect(DISPLAYSURF, RED, enemyRect)

    # Update the graphics
    pygame.display.update()

    # Clock tick
    fpsClock.tick(FPS)