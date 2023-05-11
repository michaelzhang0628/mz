import pygame, sys, io, random
from pygame.locals import *
from urllib.request import urlopen

pygame.init()
FPS = 15
fpsClock = pygame.time.Clock()


# ***************************************
# *             FUNCTIONS               *
# ***************************************

# Function to draw characters
def drawCharacter(screen, x, y):
    pygame.draw.rect(screen, BLACK, (x, y, 30, 40))
    pygame.draw.polygon(screen, BLACK, [(x, y + 15), (x - 15, y + 23), (x - 10, y + 30), (x, y + 25)])
    pygame.draw.polygon(screen, BLACK, [(x + 30, y + 15), (x + 45, y + 23), (x + 40, y + 30), (x + 30, y + 25)])
    pygame.draw.rect(screen, BLACK, (x, y + 40, 12, 15))
    pygame.draw.rect(screen, BLACK, (x + 18, y + 40, 12, 15))
    pygame.draw.polygon(screen, RED, [(x + 10, y - 5), (x + 15, y - 10), (x + 20, y - 5)])
    pygame.draw.polygon(screen, RED, [(x, y + 5), (x - 8, y + 5), (x - 8, y - 5), (x - 6, y), (x, y)])
    pygame.draw.polygon(screen, RED, [(x + 30, y + 5), (x + 38, y + 5), (x + 38, y - 5), (x + 36, y), (x + 30, y)])
    pygame.draw.ellipse(screen, BLACK, (x, y - 5, 30, 10))
    pygame.draw.ellipse(screen, RED, (x + 7.5, y, 15, 10))
    pygame.draw.rect(screen, GREY, (x, y + 15, 30, 20))
    pygame.draw.circle(screen, RED, (x + 15, y + 25), 7)

def drawUserCharacter(screen, x, y):
    pygame.draw.rect(screen, YELLOW, (x, y, 20, 40))
    pygame.draw.polygon(screen, YELLOW2, [(x, y), (x - 30, y - 20), (x - 40, y - 20), (x - 70, y + 40), (x, y + 15)])
    pygame.draw.polygon(screen, YELLOW2, [(x + 20, y), (x + 50, y - 20), (x + 60, y - 20), (x + 90, y + 40), (x + 20, y + 15)])
    pygame.draw.polygon(screen, GREY, [(x, y - 15), (x, y), (x + 20, y), (x + 20, y - 15), (x + 10, y - 25)])
    pygame.draw.polygon(screen, BROWN, [(x, y), (x - 25, y + 20), (x - 20, y + 28), (x, y + 15)])
    pygame.draw.polygon(screen, BROWN, [(x + 20, y), (x + 45, y + 20), (x + 40, y + 28), (x + 20, y + 15)])
    pygame.draw.rect(screen, WHITE, (x, y + 40, 8, 25))
    pygame.draw.rect(screen, WHITE, (x + 12, y + 40, 8, 25))
    pygame.draw.rect(screen, BLUE, (x + 3, y - 15, 14, 7))
    pygame.draw.circle(screen, PURPLE, (x - 30, y + 5), 10)
    pygame.draw.circle(screen, PURPLE, (x + 50, y + 5), 10)

# ***************************************
# *             MAIN PROGRAM            *
# ***************************************

# Colors
BROWN = [201, 119, 64]
BLACK = [0, 0, 0]
WHITE = [255, 255, 255]
GREEN = [62, 173, 81]
GREY = [128, 126, 150]
BLUE = [0, 0, 255]
TAN = [242, 210, 189]
TEAL = [0, 128, 128]
RED = [180, 0, 0]
PURPLE = [181, 69, 230]
YELLOW = [252, 228, 98]
YELLOW2 = [247, 242, 195]

playerImgx = 0
playerImgy = 0

# Set up the window (surface)
DISPLAYSURF = pygame.display.set_mode((480, 360))
image_url = "https://codehs.com/uploads/bea96ab515b168282eb7ba2911ff230e"
image_str = urlopen(image_url).read()
image_file = io.BytesIO(image_str)
playerImg = pygame.image.load(image_file)
playerImg = pygame.transform.scale(playerImg, (480, 360))

# Character coordinates
characterXCoords = []
characterYCoords = []
moveXAmnts = []
moveYAmnts = []
jumpCeiling = []
startingXCoord = 20
startingYCoord = playerImg.get_height() - 100
numCharacter = 6
for i in range(numCharacter):
    characterXCoords.append(startingXCoord + (i * 80))
    moveXAmnts.append(random.randint(2, 10))
    characterYCoords.append(startingYCoord)
    moveYAmnts.append(-random.randint(2, 7))
    jumpCeiling.append(random.randint(20, 70))

# Main Game Loop
while True:

    # Loop that handles quitting the program
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            pygame.quit()

    # Fill canvas
    DISPLAYSURF.blit(playerImg, (playerImgx, playerImgy))

    # Draws enemy character
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

    # Draw user character
    drawUserCharacter(DISPLAYSURF, 240, 30)

    # Update the graphics
    pygame.display.update()

    # Clock tick
    fpsClock.tick(FPS)