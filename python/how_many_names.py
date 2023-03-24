number_of_names = int(input("Number of names: "))
names = []
for name in range(number_of_names):
    name = input("Name: ")
    names.append(name)
print("First name: " + names[0])
print("Middle names: " + str(names[1:-1]))
print("Last name: " + names[-1])