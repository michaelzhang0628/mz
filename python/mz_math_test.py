import unittest

from python.mz_math import quadratic


class MyTest(unittest.TestCase):

    def test_quadratic(self):
        self.assertEqual(76, quadratic(6, 7, 1, 3))
        self.assertEqual(267, quadratic(9, 8, 2, 5))
        self.assertEqual(38, quadratic(2, 0, 6, 4))
        self.assertEqual(105, quadratic(13, 5, 87, 1))
        self.assertEqual(46, quadratic(20, 23, 46, 0))

