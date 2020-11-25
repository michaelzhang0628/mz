from unittest import TestCase
from python.bases import *

class Test(TestCase):
    def test_octal_decimal(self):
        self.assertEqual(0, octal_decimal("0"))
        self.assertEqual(7, octal_decimal("7"))
        self.assertEqual(56, octal_decimal("70"))
        self.assertEqual(73, octal_decimal("111"))
        self.assertEqual(83, octal_decimal("123"))

    def test_decimal_octal(self):
        self.assertEqual("0", decimal_octal(0))
        self.assertEqual("7", decimal_octal(7))
        self.assertEqual("70", decimal_octal(56))
        self.assertEqual("516", decimal_octal(334))
        self.assertEqual("123", decimal_octal(83))

    def test_hexdecimal_decimal(self):
        self.assertEqual(0, hexdecimal_decimal("0"))
        self.assertEqual(7, hexdecimal_decimal("7"))
        self.assertEqual(15, hexdecimal_decimal("f"))
        self.assertEqual(86, hexdecimal_decimal("56"))
        self.assertEqual(46, hexdecimal_decimal("2e"))
        self.assertEqual(3886, hexdecimal_decimal("f2e"))

    def test_decimal_hexdecimal(self):
        self.assertEqual("0", decimal_hexdecimal(0))
        self.assertEqual("7", decimal_hexdecimal(7))
        self.assertEqual("f", decimal_hexdecimal(15))
        self.assertEqual("56", decimal_hexdecimal(86))
        self.assertEqual("2e", decimal_hexdecimal(46))
        self.assertEqual("f2e", decimal_hexdecimal(3886))

    def test_binary_decimal(self):
        self.assertEqual(0, binary_decimal("0"))
        self.assertEqual(1, binary_decimal("1"))
        self.assertEqual(2, binary_decimal("10"))
        self.assertEqual(3, binary_decimal("11"))
        self.assertEqual(15, binary_decimal("1111"))
        self.assertEqual(256, binary_decimal("100000000"))

    def test_decimal_binary(self):
        self.assertEqual("0", decimal_binay(0))
        self.assertEqual("1", decimal_binay(1))
        self.assertEqual("1010", decimal_binay(10))
        self.assertEqual("11", decimal_binay(3))
        self.assertEqual("1111", decimal_binay(15))
        self.assertEqual("100000000", decimal_binay(256))

    def test_hex_decimal(self):
        self.assertEqual(51, base_any_decimal(6, "123"))

    def test_decimal_hex(self):
        self.assertEqual("1555", decimal_base_any(6, 431))
