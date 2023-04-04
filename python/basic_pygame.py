# Simple pygame program

# Import and initialize the pygame library
import pygame
pygame.init()

# Set up the drawing window
screen = pygame.display.set_mode([800, 600])

background_color = (0, 0, 0)
circle_color = (255, 0, 255)
position = [150, 100]
radius = 75

# Run until the user asks to quit
running = True
while running:

    # Did the user click the window close button?
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    # Fill the background with white
    screen.fill(background_color)

    # Draw a solid blue circle in the center
    pygame.draw.circle(screen, circle_color, position, radius)

    # Flip the display
    pygame.display.flip()

# Done! Time to quit.

pygame.quit()