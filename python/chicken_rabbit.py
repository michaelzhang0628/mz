def chicken_rabbit(head, feet):
    for chicken in range(head+1):
        rabbit = head - chicken
        if feet == 4*rabbit + 2*chicken:
            return chicken, rabbit
    print(f"The numbers are wrong.  Can not find chicken and rabbit with {head} heads and {feet} feet.")

print(chicken_rabbit(10, 21))
print(chicken_rabbit(10, 22))
print(chicken_rabbit(72, 200))
print(chicken_rabbit(9867565, 22986566))