import pygame, sys, io, random
from pygame.locals import *
from urllib.request import urlopen

pygame.init()
pygame.font.init()
FPS = 15
fpsClock = pygame.time.Clock()


# ***************************************
# *             FUNCTIONS               *
# ***************************************

# Function to draw characters
# Width: 30,  Height: 45
# Left offset 0   Top offset -5
def drawEnemy(screen, x, y):
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


def drawUser(screen, x, y):
    if shieldOn == True:
        pygame.draw.circle(screen, BLUE, (x + 10, y + 20), 70)
        pygame.draw.circle(screen, BLUE2, (x + 10, y + 20), 60)
    pygame.draw.rect(screen, YELLOW, (x, y, 20, 40))
    pygame.draw.rect(screen, BLACK, (x, y, 20, 40), 1)
    pygame.draw.polygon(screen, YELLOW2, [(x, y), (x - 30, y - 20), (x - 40, y - 20), (x - 70, y + 40), (x, y + 15)])
    pygame.draw.polygon(screen, YELLOW2,
                        [(x + 20, y), (x + 50, y - 20), (x + 60, y - 20), (x + 90, y + 40), (x + 20, y + 15)])
    pygame.draw.polygon(screen, GREY, [(x, y - 15), (x, y), (x + 20, y), (x + 20, y - 15), (x + 10, y - 25)])
    pygame.draw.polygon(screen, BROWN, [(x, y), (x - 25, y + 20), (x - 20, y + 28), (x, y + 15)])
    pygame.draw.polygon(screen, BROWN, [(x + 20, y), (x + 45, y + 20), (x + 40, y + 28), (x + 20, y + 15)])
    pygame.draw.rect(screen, WHITE, (x, y + 40, 8, 25))
    pygame.draw.rect(screen, WHITE, (x + 12, y + 40, 8, 25))
    pygame.draw.rect(screen, BLACK, (x, y + 40, 8, 25), 1)
    pygame.draw.rect(screen, BLACK, (x + 12, y + 40, 8, 25), 1)
    pygame.draw.rect(screen, PURPLE, (x + 3, y - 15, 14, 7))
    pygame.draw.rect(screen, BLACK, (x + 3, y - 15, 14, 7), 1)
    if x - 30 >= 0:
        pygame.draw.circle(screen, PURPLE, (x - 30, y + 5), 10)
    pygame.draw.circle(screen, PURPLE, (x + 50, y + 5), 10)
    return pygame.Rect(x, y - 25, 20, 100)

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
BLUE2 = [156, 255, 232]
ORANGE = [255, 165, 0]

playerImgx = 0
playerImgy = 0

# Set up the window (surface)
DISPLAYSURF = pygame.display.set_mode((900, 600))
image_url = "https://codehs.com/uploads/bea96ab515b168282eb7ba2911ff230e"
image_str = urlopen(image_url).read()
image_file = io.BytesIO(image_str)
playerImg = pygame.image.load(image_file)
playerImg = pygame.transform.scale(playerImg, (DISPLAYSURF.get_width(), DISPLAYSURF.get_height()))

# Character coordinates
enemyXCoords = []
enemyYCoords = []
moveXAmnts = []
moveYAmnts = []
jumpCeiling = []
startingXCoord = 20
startingYCoord = playerImg.get_height() - 100
numEnemy = 2
enemyAlive = []
enemyKilled = 0
for i in range(numEnemy):
    enemyXCoords.append(startingXCoord + (i * 80))
    moveXAmnts.append(random.randint(2, 10))
    enemyYCoords.append(startingYCoord)
    moveYAmnts.append(-random.randint(2, 7))
    jumpCeiling.append(random.randint(20, 70))
    enemyAlive.append(True)

# The number of shots the player has taken and drawn on the screen
numShots = 0
# The maximum number of shots the player can have on the screen at once
maxShots = 4
# list of Rect objects for the laser bolts
laserBolts = []
# Loop to create 4 laser bolts
laserBoltsSpeed = 10
for i in range(maxShots):
    # Add a laser bolt to the list of Rect objects.
    laserBolts.append(pygame.Rect(-30, DISPLAYSURF.get_height(), 10, 20))
    # The lasers will be 10 pixels wide and 20 pixels tall.

# Create blasts, enemies shoots blasts when they die
blast = []
for i in range(numEnemy):
    blast.append(pygame.Rect(-60, -20, 20, 40))

# Shield Variable
shieldOn = False
shieldTimer = 3 * FPS

# Variable for User
UserX = 0
UserY = 50

# Variable for core
kills = 0
totalNumOfShots = 0
scoreFont = pygame.font.Font(pygame.font.get_default_font(), 17)
beginFont = pygame.font.Font(pygame.font.get_default_font(), 30)
endFont = pygame.font.Font(pygame.font.get_default_font(), 30)

BEGIN = 0
PLAY = 1
GAMEOVER = 2
gameState = BEGIN

UserRect = drawUser(DISPLAYSURF, UserX, UserY)
UserLives = 3

explosionCenterX = -100
explosionCenterY = -100
explosionTime = FPS

timer = 0
runningClock = True

# Main Game Loop
while True:
    if runningClock == True:
        timer += 1
    # Loop that handles events
    for event in pygame.event.get():
        if event.type == QUIT:
            pygame.quit()
            sys.exit()
        elif event.type == MOUSEBUTTONDOWN:
            if event.button == 1:
                if gameState == BEGIN:
                    # Reset the game
                    kills = 0
                    totalNumOfShots = 0
                    enemyAlive = []
                    enemyKilled = 0
                    gameState = PLAY
                    UserLives = 3
                    blast = []
                    explosionCenterX = -100
                    explosionCenterY = -100
                    explosionTime = FPS
                    laserBolts = []
                    laserBoltsSpeed = 10
                    timer = 0
                    runningClock = True
                    shieldOn = False
                    shieldTimer = 3 * FPS
                    for i in range(maxShots):
                        # Add a laser bolt to the list of Rect objects.
                        laserBolts.append(pygame.Rect(-30, DISPLAYSURF.get_height(), 10, 20))
                    for i in range(numEnemy):
                        blast.append(pygame.Rect(-60, -20, 20, 40))
                    for i in range(numEnemy):
                        enemyXCoords.append(startingXCoord + (i * 80))
                        moveXAmnts.append(random.randint(2, 10))
                        enemyYCoords.append(startingYCoord)
                        moveYAmnts.append(-random.randint(2, 7))
                        jumpCeiling.append(random.randint(20, 70))
                        enemyAlive.append(True)
                elif gameState == PLAY:
                    if laserBolts[numShots].bottom >= DISPLAYSURF.get_height():
                        # Moving laserBolts from outside the screen to inside the screen
                        totalNumOfShots += 1
                        # Add 6 to center the laser with the player.
                        laserBolts[numShots].x = UserX + 6
                        laserBolts[numShots].y = UserY
                        numShots += 1
                        if numShots >= maxShots:
                            numShots = 0
                elif gameState == GAMEOVER:
                    gameState = BEGIN
        elif event.type == pygame.KEYDOWN:
            if event.key == pygame.K_s:
                shieldOn = True
            elif event.key == pygame.K_UP:
                laserBoltsSpeed += 2
                if laserBoltsSpeed > 18:
                    laserBoltsSpeed = 18
            elif event.key == pygame.K_DOWN:
                laserBoltsSpeed -= 2
                if laserBoltsSpeed < 2:
                    laserBoltsSpeed = 2

    # Fill canvas
    DISPLAYSURF.blit(playerImg, (playerImgx, playerImgy))

    if gameState == BEGIN:
        beginText = beginFont.render(("Click to begin"), True, BLACK)
        beginRect = beginText.get_rect()
        beginRect.left = (DISPLAYSURF.get_width() - beginRect.width) / 2
        beginRect.top = (DISPLAYSURF.get_height() - beginRect.height) / 2
        DISPLAYSURF.blit(beginText, beginRect)

    elif gameState == PLAY:
        # Gets the position of the cursor as a tuple with 2 values (x, y)
        pos = pygame.mouse.get_pos()

        # Update User x-coordinate with mouse x-coordinate
        # Don't want to update User y-coordinate
        UserX = pos[0]

        # Draw User only when it is not exploded
        if explosionCenterX < 0 or explosionCenterY < 0:
            UserRect = drawUser(DISPLAYSURF, UserX, UserY)

        if enemyKilled == numEnemy:
            runningClock = False
            gameState = GAMEOVER
        if UserLives == 0:
            runningClock = False
            gameState = GAMEOVER
        for i in range(numEnemy):
            # Draw the Enemy if alive
            if enemyAlive[i]:
                # Check if Enemy should be alive
                for j in range(maxShots):
                    # Colliderect takes a rect that is based on enemyXCoords[i] and enemyYCoords[i]
                    enemyRect = Rect(enemyXCoords[i], enemyYCoords[i] - 5, 30, 45)
                    if laserBolts[j].colliderect(enemyRect) and enemyAlive[i]:
                        kills += 1
                        enemyAlive[i] = False
                        enemyKilled += 1
                        # Once Enemy is killed by a shot, move the shot outside the surface
                        laserBolts[j].x = -30
                        laserBolts[j].y = DISPLAYSURF.get_height()
                        # Blast is shot after Enemy is killed
                        blast[i].x = enemyXCoords[i]
                        blast[i].y = enemyYCoords[i]

                # Draw Enemy
                drawEnemy(DISPLAYSURF, enemyXCoords[i], enemyYCoords[i])

            # Update Enemy x coordinates
            enemyXCoords[i] += moveXAmnts[i]
            if enemyXCoords[i] > DISPLAYSURF.get_width() - 25 or enemyXCoords[i] < 0:
                moveXAmnts[i] *= -1
            # Update Enemy y coordinates
            enemyYCoords[i] += moveYAmnts[i]
            if enemyYCoords[i] > DISPLAYSURF.get_height() - 100 or enemyYCoords[i] < DISPLAYSURF.get_height() - 100 - jumpCeiling[i]:
                moveYAmnts[i] *= -1

        # To turn shield off and reset
        if shieldOn == True:
            shieldTimer = shieldTimer - 1
            if shieldTimer <= 0:
                shieldOn = False
                shieldTimer = 3 * FPS

        # Update and draw laser shots
        for i in range(maxShots):
            # Move the current laser 10 pixels down
            laserBolts[i].move_ip(0, laserBoltsSpeed)
            # Draw a rectangle with the current laser bolt
            pygame.draw.rect(DISPLAYSURF, PURPLE, laserBolts[i])

        # Update and draw blast
        for i in range(numEnemy):
            if blast[i].colliderect(UserRect):
                if shieldOn == False:
                    UserLives -= 1
                    # Drawing explosion
                    explosionCenterX = UserX + 10
                    explosionCenterY = UserY + 20
                    explosionTime = FPS
                blast[i].x = -100
                blast[i].y = -100
            # Move the current laser 10 pixels down
            blast[i].move_ip(0, random.randint(-20, -1))
            # Draw a rectangle with the current laser bolt
            pygame.draw.rect(DISPLAYSURF, RED, blast[i])

        # Drawing explosion
        if explosionTime > 0:
            explosionTime -= 1
        else:
            explosionCenterX = -100
            explosionCenterY = -100
        pygame.draw.circle(DISPLAYSURF, ORANGE, (explosionCenterX, explosionCenterY), 75)
        pygame.draw.circle(DISPLAYSURF, RED, (explosionCenterX, explosionCenterY), 50)

        # Draw scoreboard
        scoreboardText = scoreFont.render(("Kills: " + str(kills) + "   Shots: " + str(totalNumOfShots) + "   Lives: " + str(UserLives) + "   Time: " + str(round(timer / 15, 2))), True, WHITE, BLACK)
        scoreboardRect = scoreboardText.get_rect()
        scoreboardRect.left = 10
        scoreboardRect.bottom = DISPLAYSURF.get_height() - 10
        DISPLAYSURF.blit(scoreboardText, scoreboardRect)

        # Draw laserBoltsSpeed
        laserBoltsSpeedText = scoreFont.render(("Laser Bolts Speed: " + str(laserBoltsSpeed)), True, WHITE, BLACK)
        laserBoltsSpeedRect = laserBoltsSpeedText.get_rect()
        laserBoltsSpeedRect.left = DISPLAYSURF.get_width() - 190
        laserBoltsSpeedRect.bottom = DISPLAYSURF.get_height() - 10
        DISPLAYSURF.blit(laserBoltsSpeedText, laserBoltsSpeedRect)

    elif gameState == GAMEOVER:
        endText = endFont.render(("Click to play again"), True, BLACK)
        endRect = endText.get_rect()
        endRect.left = (DISPLAYSURF.get_width() - endRect.width) / 2
        endRect.top = (DISPLAYSURF.get_height() - endRect.height) / 2
        DISPLAYSURF.blit(endText, endRect)

        # Draw scoreboard on end screen
        endTime = round(timer / 15, 2)
        endScoreboardText = endFont.render(("Kills: " + str(kills) + "   Shots: " + str(totalNumOfShots) + "   Lives: " + str(UserLives) + "   Time: " + str(endTime)), True, BLACK)
        endScoreboardRect = endScoreboardText.get_rect()
        endScoreboardRect.left = (DISPLAYSURF.get_width() - endScoreboardRect.width) / 2
        endScoreboardRect.top = (DISPLAYSURF.get_height() + endRect.height) / 2
        DISPLAYSURF.blit(endScoreboardText, endScoreboardRect)

        totalEfficiencyScore = round(kills * 10 - totalNumOfShots * 3 + UserLives * 20 - endTime, 2)
        totalEfficiencyScoreText = endFont.render(("Efficiency Score: " + str(totalEfficiencyScore)), True, BLACK)
        totalEfficiencyScoreRect = totalEfficiencyScoreText.get_rect()
        totalEfficiencyScoreRect.left = (DISPLAYSURF.get_width() - totalEfficiencyScoreRect.width) / 2
        totalEfficiencyScoreRect.top = (DISPLAYSURF.get_height() + endRect.height) / 2 + totalEfficiencyScoreRect.height
        DISPLAYSURF.blit(totalEfficiencyScoreText, totalEfficiencyScoreRect)

    # Update the graphics
    pygame.display.update()

    # Clock tick
    fpsClock.tick(FPS)