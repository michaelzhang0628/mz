"""
This is multi-line comment
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1

10
10 8
10 8 6
10 8 6 4
10 8 6 4 2
"""
# this is one line comment
for x in range(5, 0, -1):
    for y in range(x):
        print(x, end = ' ')
    print()

for x in range(10, 1, -2):
    for y in range(6 - x//2):
        print(10 - y * 2, end=" ")
    print()

for x in range(5):
    for y in range(x+1):
        print(10 - y * 2, end=" ")
    print()