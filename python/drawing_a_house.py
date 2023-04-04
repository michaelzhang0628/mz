import pygame, sys, random
from pygame.locals import *


# ***************************************
# *             FUNCTIONS               *
# ***************************************

# Function to draw a cloud
def drawCloud(surface, x, y):
    pygame.draw.ellipse(surface, WHITE, (x, y, 40, 15))
    pygame.draw.ellipse(surface, WHITE, (x + 30, y, 40, 15))
    pygame.draw.ellipse(surface, WHITE, (x + 20, y - 25, 40, 35))


# Function to draw a tree
def drawTree(surface, x, y, z, a, b):
    pygame.draw.circle(surface, GREEN, (x + 15, y - 20), z)
    pygame.draw.rect(surface, BROWN, (x, y, a, b))

def drawBush(surface, x, y, z, a, b):
    pygame.draw.circle(surface, GREEN3, (x + 15, y - 20), z)
    pygame.draw.rect(surface, BROWN, (x, y, a, b))

def drawChimney(surface, x, y, a, b):
    pygame.draw.rect(surface, BROWN, (x, y, a, b))
    pygame.draw.ellipse(surface, GREY, (x, y - 15, 40, 20))
    pygame.draw.ellipse(surface, GREY, (x + 10, y - 25, 40, 20))
    pygame.draw.ellipse(surface, GREY, (x + 20, y - 35, 40, 20))

# ***************************************
# *            MAIN PROGRAM             *
# ***************************************


# @ 1. Initialize pygame
pygame.init()

# @ 2. Set up the window (surface)
DISPLAYSURF = pygame.display.set_mode((600, 600))

# @ 3. Set up the colors
BROWN = [89, 43, 29]
GREEN = [30, 100, 35]
WHITE = [255, 255, 255]
BLUE = [145, 210, 230]
GREY = [128, 128, 128]
GREEN2 = [45, 189, 48]
GREEN3 = [73, 145, 4]
BLUE2 = [0, 0, 128]
RED = [128, 0, 0]
YELLOW = [255, 255, 0]
BLUE3 = [0, 128, 128]
BLACK = [0, 0, 0]

# @ 4. Draw on the surface object with background color
DISPLAYSURF.fill(BLUE)

# @ 5 - 15. Draw
drawChimney(DISPLAYSURF, 400, 50, 25, 100)
pygame.draw.rect(DISPLAYSURF, GREEN2, (0, 300, 600, 600))
pygame.draw.rect(DISPLAYSURF, GREY, (200, 150, 300, 200))
pygame.draw.ellipse(DISPLAYSURF, BLUE3, (90, 400, 150, 100))
pygame.draw.polygon(DISPLAYSURF, BLUE2, [(200, 150), (350, 40), (500, 150)])
pygame.draw.circle(DISPLAYSURF, BLACK, (350, 100), 30)
for x in range(19):
    pygame.draw.line(DISPLAYSURF, BROWN, (200, 160 + x * 10), (500, 160 + x * 10), 2)
pygame.draw.rect(DISPLAYSURF, RED, (315, 250, 75, 100))
for x in range(3):
    pygame.draw.rect(DISPLAYSURF, BLACK, (215 + x * 105, 175, 60, 50))
for x in range(20):
    drawCloud(DISPLAYSURF, random.randint(-10, 600), random.randint(-10, 100))
for x in range(2):
    drawTree(DISPLAYSURF, 50 + x * 110, 230, 50, 30, 100)
drawTree(DISPLAYSURF, 525, 185, 50, 30, 185)
drawTree(DISPLAYSURF, 100, 100, 80, 30, 250)
for x in range(3):
    drawBush(DISPLAYSURF, 50 + x * 190, 400, 30, 30, 10)
for x in range(2):
    drawBush(DISPLAYSURF, 550 - x * 150, 450, 30, 30, 10)
pygame.draw.circle(DISPLAYSURF, YELLOW, (575, 30), 75)

# Run the game loop
while True:
    for event in pygame.event.get():
        if event.type == QUIT:
            pygame.quit()
            sys.exit()

    pygame.display.update()