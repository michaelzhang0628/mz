def octal_decimal(o_number):
    d_number = 0
    position = len(o_number) - 1
    for ch in o_number:
        number = int(ch)
        d_number += number * pow(8, position)
        position -= 1
    return d_number


def decimal_octal(d_number):
    d_number = d_number
    o_number = ""
    while d_number >= 8:
        o_number = str(d_number % 8) + o_number
        d_number = d_number // 8
    o_number = str(d_number) + o_number
    return o_number


def convert_hexdecimal_character_to_number(ch):
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


def convert_number_to_hexdecimal(number):
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


def hexdecimal_decimal(h_number):
    d_number = 0
    position = len(h_number) - 1
    for ch in h_number:
        number = convert_hexdecimal_character_to_number(ch)
        d_number += number * pow(16, position)
        position -= 1
    return d_number


def decimal_hexdecimal(d_number):
    d_number = d_number
    h_number = ""
    while d_number >= 16:
        h_number = convert_number_to_hexdecimal(d_number % 16) + h_number
        d_number = d_number // 16
    h_number = convert_number_to_hexdecimal(d_number) + h_number
    return h_number
