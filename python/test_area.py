from unittest import TestCase
from python.area import *

class Test(TestCase):
    def test_triangle_area(self):
        self.assertEqual(2, triangle_area(2, 2))
        self.assertEqual(0, triangle_area(2, 0))
        self.assertEqual(3, triangle_area(1.2, 5))


    def test_trapezoid_area(self):
        self.assertEqual(4, trapezoid_area(2, 2, 2))
        self.assertEqual(2, trapezoid_area(2, 0, 2))
        self.assertEqual(9.3, trapezoid_area(1.2, 5, 3))
