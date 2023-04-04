import pygame
from pygame.locals import *

pygame.init()

winWidth = 400
winHeight = 400
DISPLAYSURF = pygame.display.set_mode((400, 400))

def drawCloud(surface, x, y):
    pygame.draw.ellipse(surface, WHITE, (x, y, 40, 15))
    pygame.draw.ellipse(surface, WHITE, (x + 30, y, 40, 15))
    pygame.draw.ellipse(surface, WHITE, (x + 20, y - 25, 40, 35))

WHITE = [255, 255, 255]
BLACK = [0, 0, 0]
BLUE = [0, 0, 255]
GREY = [128, 128, 128]
TEAL = [0, 128, 128]
GREEN = [45, 189, 48]
BLUE2 = [145, 210, 230]

# Draw Here
DISPLAYSURF.fill(BLUE2)
pygame.draw.rect(DISPLAYSURF, GREEN, (0, 200, 400, 200))
pygame.draw.polygon(DISPLAYSURF, BLUE, [(190, 60), (205, 40), (220, 60)])
drawCloud(DISPLAYSURF, 30, 40)
drawCloud(DISPLAYSURF, 240, 50)
drawCloud(DISPLAYSURF, 130, 30)
drawCloud(DISPLAYSURF, 320, 60)
pygame.draw.rect(DISPLAYSURF, BLACK, (160, 80, 90, 160))
pygame.draw.ellipse(DISPLAYSURF, BLACK, (160, 60, 90, 40))
pygame.draw.ellipse(DISPLAYSURF, BLUE, (185, 80, 40, 20))
pygame.draw.polygon(DISPLAYSURF, BLACK, [(250, 130), (250, 170), (300, 200), (320, 170)])
pygame.draw.polygon(DISPLAYSURF, BLACK, [(160, 130), (160, 170), (110, 200), (90, 170)])
pygame.draw.rect(DISPLAYSURF, BLACK, (160, 240, 40, 40))
pygame.draw.rect(DISPLAYSURF, BLACK, (210, 240, 40, 40))
pygame.draw.line(DISPLAYSURF, BLUE, (160, 130), (250, 130), 2)
pygame.draw.polygon(DISPLAYSURF, TEAL, [(110, 200), (30, 70), (35, 30), (70, 55), (130, 185)])
pygame.draw.polygon(DISPLAYSURF, TEAL, [(70, 200), (60, 180), (130, 130), (140, 150)])
pygame.draw.line(DISPLAYSURF, BLACK, (110, 200), (30, 70), 2)
pygame.draw.line(DISPLAYSURF, BLACK, (30, 70), (35, 30), 2)
pygame.draw.line(DISPLAYSURF, BLACK, (35, 30), (70, 55), 2)
pygame.draw.line(DISPLAYSURF, BLACK, (70, 55), (130, 185), 2)
pygame.draw.line(DISPLAYSURF, BLACK, (70, 200), (60, 180), 2)
pygame.draw.line(DISPLAYSURF, BLACK, (60, 180), (130, 130), 2)
pygame.draw.line(DISPLAYSURF, BLACK, (130, 130), (140, 150), 2)
pygame.draw.line(DISPLAYSURF, BLACK, (140, 150), (70, 200), 2)
pygame.draw.polygon(DISPLAYSURF, BLUE, [(160, 80), (160, 100), (130, 100), (130, 60), (140, 80)])
pygame.draw.polygon(DISPLAYSURF, BLUE, [(250, 80), (250, 100), (280, 100), (280, 60), (270, 80)])
pygame.draw.rect(DISPLAYSURF, GREY, (160, 130, 90, 90))
pygame.draw.circle(DISPLAYSURF, BLUE, (205, 175), 30)



while True:
    for event in pygame.event.get():
        if event.type == QUIT:
            pygame.quit()
            quit()

    pygame.display.update()