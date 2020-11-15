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
        self.assertEqual("111", decimal_octal(73))
        self.assertEqual("123", decimal_octal(83))
