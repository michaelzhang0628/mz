import pygame, sys
from pygame.locals import *

pygame.init()

FPS = 30  # frames per second setting
fpsClock = pygame.time.Clock()

# set up the window
displayWidth = 400
displayHeight = 300
DISPLAYSURF = pygame.display.set_mode((displayWidth, displayHeight), 0, 32)

# Colors
RED = (255, 0, 0)
WHITE = (255, 255, 255)
BLUE = (0, 0, 255)

# Rect object values
playerX = 1
playerY = 125
playerWid = 25
playerHgt = 25
playerRect = pygame.Rect(playerX, playerY, playerWid, playerHgt)
playerMoveX = 5
playerMoveY = 0
playerAlive = True

# Rect object values
enemyX = displayWidth - 41
enemyY = 125
enemyWid = 25
enemyHgt = 25
enemyRect = pygame.Rect(enemyX, enemyY, enemyWid, enemyHgt)
enemyMoveX = -3
enemyMoveY = 0
enemyAlive = True

while True:  # the main game loop
    for event in pygame.event.get():
        if event.type == QUIT:
            pygame.quit()
            sys.exit()

    DISPLAYSURF.fill(WHITE)

    if (playerRect.left <= 0 or playerRect.right >= displayWidth):
        playerMoveX *= -1

    playerRect = playerRect.move(playerMoveX, playerMoveY)

    if (enemyRect.left <= 0 or enemyRect.right >= displayWidth):
        enemyMoveX *= -1

    enemyRect = enemyRect.move(enemyMoveX, enemyMoveY)

    # Check to see if one Rect object collided with another Rect object
    if (playerRect.colliderect(enemyRect)):
        # Reverse the playerRect's direction
        playerMoveX *= -1

        # Move the enemyRect off the screen
        enemyRect.left = displayWidth

        # Set it so it won't be draw anymore
        enemyAlive = False

    pygame.draw.rect(DISPLAYSURF, BLUE, playerRect)

    if (enemyAlive):
        pygame.draw.rect(DISPLAYSURF, RED, enemyRect)

    pygame.display.update()
    fpsClock.tick(FPS)