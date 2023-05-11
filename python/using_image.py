# Import a library of functions called 'pygame'
import pygame, io
from pygame.locals import *
from urllib.request import urlopen  # This is used for getting URL addresses.

# Colors in RGB Values
BLACK = (0, 0, 0)

# Clock variables
FPS = 30
fpsClock = pygame.time.Clock()

# Initialize the game engine
pygame.init()

# Set up the window (surface)
DISPLAYSURF = pygame.display.set_mode((480, 360))

# Set up image file and create image object
image_url = "https://codehs.com/uploads/23aedfd1937c3c329907e0ee0da80e0d"
image_str = urlopen(image_url).read()
image_file = io.BytesIO(image_str)
playerImg = pygame.image.load(image_file)

# Create coordinates for location to draw image
imgX = 0

# Fill background
DISPLAYSURF.fill(BLACK)

# Create variables for the number of pixels to move the objects each tick
moveAmnt = 5

# Main Game Loop
while True:
    # Loop that handles quitting the program
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            pygame.quit()

    DISPLAYSURF.fill(BLACK)

    imgX += moveAmnt

    if playerImg.get_rect().right + imgX > DISPLAYSURF.get_width() or imgX < 0:
        moveAmnt *= -1

    # Draw image on Surface Object
    DISPLAYSURF.blit(playerImg, (imgX, 100))
    # Update the graphics
    pygame.display.update()

    # Clock tick
    fpsClock.tick(FPS)

