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
    if x + 25 <= 480:
        pygame.draw.circle(screen, WHITE, (x + 25, y), 20)


# ***************************************
# *             MAIN PROGRAM            *
# ***************************************

# Colors
WHITE = [255, 255, 255]
BLUE = [69, 229, 237]
GREEN = [62, 173, 81]

# Set up the window (surface)
DISPLAYSURF = pygame.display.set_mode((480, 360))

# clouds coordinate
cloudXCoord = []
cloudYCoord = []
numClouds = 20
for x in range(numClouds):
    cloudXCoord.append(random.randint(0, 480))
    cloudYCoord.append(random.randint(0, 200))

# Main Game Loop
while True:

    # Loop that handles quitting the program
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            pygame.quit()

    # Fill canvas
    DISPLAYSURF.fill(BLUE)

    # Draws grass
    pygame.draw.rect(DISPLAYSURF, GREEN, pygame.Rect(0, 235, 480, 125))

    # Draws clouds
    for x in range(numClouds):
        drawCloud(DISPLAYSURF, cloudXCoord[x], cloudYCoord[x])

    # Update the graphics
    pygame.display.update()