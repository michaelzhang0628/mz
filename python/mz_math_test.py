import unittest

from python.mz_math import quadratic


class MyTest(unittest.TestCase):

    def test_quadratic(self):
        self.assertEqual(quadratic(6, 7, 1, 3), 76)
        self.assertEqual(quadratic(9, 8, 2, 5), 267)
        self.assertEqual(quadratic(2, 0, 6, 4), 38)
        self.assertEqual(quadratic(13, 5, 87, 1), 105)
        self.assertEqual(quadratic(20, 23, 46, 0), 46)

