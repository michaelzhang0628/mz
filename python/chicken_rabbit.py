def chicken_rabbit_problem(head, feet):
  for c in range(0, head+1):
    r = head - c
    f = r*4 + c*2
    if f == feet:
      return r, c
  print("can not find an answer")

rabbit1,chicken1 = chicken_rabbit_problem(72, 200)
print("There are", rabbit1, "rabbits and", chicken1, "chickens.")
rabbit2,chicken2 = chicken_rabbit_problem(45, 130)
print("There are", rabbit2, "rabbits and", chicken2, "chickens.")
