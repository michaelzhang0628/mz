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
        o_number = str(d_number%8) + o_number
        d_number = d_number//8
    o_number = str(d_number) + o_number
    return o_number
