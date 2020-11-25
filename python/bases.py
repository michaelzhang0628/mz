def base_any_decimal(base, b_number):
    count = 0
    d_number = 0
    for character in b_number:
        count += 1
        d_number = d_number + convert_character_to_number(character) * (base ** (len(b_number) - count))
    return int(d_number)


def decimal_base_any(base, d_number):
    b_number = ""
    while d_number >= base:
        b_number = convert_number_to_character(d_number % base) + b_number
        d_number = d_number // base
    return convert_number_to_character(d_number) + b_number


def convert_character_to_number(ch):
    if ch.isnumeric():
        return int(ch)
    elif ch == "a":
        return 10
    elif ch == "b":
        return 11
    elif ch == "c":
        return 12
    elif ch == "d":
        return 13
    elif ch == "e":
        return 14
    elif ch == "f":
        return 15

def convert_number_to_character(number):
    if number < 10:
        return str(number)
    elif number == 10:
        return "a"
    elif number == 11:
        return "b"
    elif number == 12:
        return "c"
    elif number == 13:
        return "d"
    elif number == 14:
        return "e"
    elif number == 15:
        return "f"

def octal_decimal(o_number):
    return base_any_decimal(8, o_number)

def decimal_octal(d_number):
    return decimal_base_any(8, d_number)

def hexdecimal_decimal(h_number):
    return base_any_decimal(16, h_number)

def decimal_hexdecimal(d_number):
    return decimal_base_any(16, d_number)

def binary_decimal(b_number):
    return base_any_decimal(2, b_number)

def decimal_binay(d_number):
    return decimal_base_any(2, d_number)

def hex_decimal(b_number):
    return base_any_decimal(6, b_number)

def decimal_hex(d_number):
    return decimal_base_any(6, d_number)

for b in range(6, 10):
    print("-------------", b)
    print(base_any_decimal(b, "351"))
    print(base_any_decimal(b, "441"))