import pygame, sys, io, random
from pygame.locals import *
from urllib.request import urlopen

pygame.init()
FPS = 30
fpsClock = pygame.time.Clock()

# ***************************************
# *             FUNCTIONS               *
# ***************************************

# Function to draw clouds
def drawCloud(screen, x, y):
    pygame.draw.circle(screen, WHITE, (x, y), 30)
    if x - 25 >= 0:
        pygame.draw.circle(screen, WHITE, (x - 25, y), 20)
    if x + 25 <= screen.get_width():
        pygame.draw.circle(screen, WHITE, (x + 25, y), 20)

def drawCharacter(screen, x, y):
    pygame.draw.rect(screen, BLACK, (x, y, 30, 40))
    pygame.draw.polygon(screen, BLACK, [(x, y + 15), (x - 15, y + 23), (x - 10, y + 30), (x, y + 25)])
    pygame.draw.polygon(screen, BLACK, [(x + 30, y + 15), (x + 45, y + 23), (x + 40, y + 30), (x + 30, y + 25)])
    pygame.draw.rect(screen, BLACK, (x, y + 40, 10, 15))
    pygame.draw.rect(screen, BLACK, (x + 20, y + 40, 10, 15))
    pygame.draw.polygon(screen, BLUE2, [(x + 10, y - 5), (x + 15, y - 10), (x + 20, y - 5)])
    pygame.draw.polygon(screen, BLUE2, [(x, y + 5), (x - 8, y + 5), (x - 8, y - 5), (x - 6, y), (x, y)])
    pygame.draw.polygon(screen, BLUE2, [(x + 30, y + 5), (x + 38, y + 5), (x + 38, y - 5), (x + 36, y), (x + 30, y)])
    pygame.draw.ellipse(screen, BLACK, (x, y - 5, 30, 10))
    pygame.draw.ellipse(screen, BLUE2, (x + 7.5, y, 15, 10))
    pygame.draw.rect(screen, GREY, (x, y + 15, 30, 20))
    pygame.draw.circle(screen, BLUE2, (x + 15, y + 25), 7)

# ***************************************
# *             MAIN PROGRAM            *
# ***************************************

# Colors
BLACK = [0, 0, 0]
WHITE = [255, 255, 255]
BLUE1 = [69, 229, 237]
GREEN = [62, 173, 81]
GREY = [128, 126, 150]
BLUE2 = [0, 0, 255]
TAN = [242, 210, 189]
TEAL = [0, 128, 128]

# Set up the window (surface)
DISPLAYSURF = pygame.display.set_mode((480, 360))

# Clouds coordinate
cloudXCoord = []
cloudYCoord = []
numClouds = 20
for i in range(numClouds):
    cloudXCoord.append(random.randint(0, DISPLAYSURF.get_width()))
    cloudYCoord.append(random.randint(0, DISPLAYSURF.get_height() - 160))

# Sidewalk variables
sidewalk_wid = 60
sidewalk_hgt = 80
sidewalkXCoord = 0
sidewalkYCoord = DISPLAYSURF.get_height() - sidewalk_hgt

# Sidewalk rectangles
sidewalkRect = []
numSidewalks = DISPLAYSURF.get_width() / sidewalk_wid
for i in range(int(numSidewalks)):
    sidewalkRect.append(pygame.Rect(sidewalkXCoord + (i * sidewalk_wid), sidewalkYCoord, sidewalk_wid, sidewalk_hgt))

# Character coordinates
characterXCoords = []
characterYCoords = []
moveXAmnts = []
moveYAmnts = []
jumpCeiling = []
startingXCoord = 20
startingYCoord = DISPLAYSURF.get_height() - 100
numCharacter = 6
for i in range(numCharacter):
    characterXCoords.append(startingXCoord + (i * 80))
    moveXAmnts.append(random.randint(2, 10))
    characterYCoords.append(startingYCoord)
    moveYAmnts.append(-random.randint(2, 7))
    jumpCeiling.append(random.randint(0, 50))

# Main Game Loop
while True:

    # Loop that handles quitting the program
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            pygame.quit()

    # Fill canvas
    DISPLAYSURF.fill(BLUE1)

    # Draws grass
    pygame.draw.rect(DISPLAYSURF, GREEN, pygame.Rect(0, DISPLAYSURF.get_height() - 125, DISPLAYSURF.get_width(), 125))

    # Draw sidewalk
    for block in sidewalkRect:
        pygame.draw.rect(DISPLAYSURF, TAN, block)
        pygame.draw.rect(DISPLAYSURF, GREY, block, 4)

    # Draws clouds
    for i in range(numClouds):
        # Draw the cloud
        drawCloud(DISPLAYSURF, cloudXCoord[i], cloudYCoord[i])
        # Move the cloud
        cloudXCoord[i] += 2
        if cloudXCoord[i] > DISPLAYSURF.get_width():
            cloudXCoord[i] = 0

    # Draws character
    for i in range(numCharacter):
        # Draw the character
        drawCharacter(DISPLAYSURF, characterXCoords[i], characterYCoords[i])
        # Update character x coordinates
        characterXCoords[i] += moveXAmnts[i]
        if characterXCoords[i] > DISPLAYSURF.get_width() - 25 or characterXCoords[i] < 0:
            moveXAmnts[i] *= -1
        # Update character y coordinates
        characterYCoords[i] += moveYAmnts[i]
        if characterYCoords[i] > DISPLAYSURF.get_height() - 100 or characterYCoords[i] < DISPLAYSURF.get_height() - 100 - jumpCeiling[i]:
            moveYAmnts[i] *= -1


    # Update the graphics
    pygame.display.update()

    # Clock tick
    fpsClock.tick(FPS)