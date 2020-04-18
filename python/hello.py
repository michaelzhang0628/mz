name = input('What is your name?\n')
print(f'hello, {name}')

age = int(input('What is your age?\n'))
days = age * 365
print(f'You are at least {days} days old')

x = int(input('x: '))
y = int(input('y: '))

if x < y:
    print('X is less than y')
elif x > y:
    print('X is greater than y')
else:
    print('X is equal to y')

c = input('Do you agree? Are sisters and dads very annoying?\n')
if c in ['Yes', 'yes', 'YES']:
    print('Agreed.\n')
elif c in ['No', 'no', 'NO']:
    print('Not agreed.\n')
else:
    print('Invalid.\n')

def main():
    for title in ['michael', "claire", "Dad"]:
        cough(title)
    for i in range(2, 4):
        laugh(i)
    for i in ["horsey"]:
        sneeze(i)
    for i in range(5):
        blah(i)

def cough(thing):
    print(f"cough {thing}")

def laugh (number):
    print(f"laugh {number-1}")

def sneeze(thing):
    print(f"sneeze {thing}")

def blah(number):
    print(f"blah {number}")

main()