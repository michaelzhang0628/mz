import math
from unittest import TestCase
from python.sort1 import *


class Test(TestCase):
    def test_sort_int(self):
        self.assertSequenceEqual([0, 1, 2, 3, 9], sort1([1, 3, 2, 9, 0]))
        self.assertSequenceEqual([1, 1, 3, 5, 12], sort1([5, 1, 1, 12, 3]))

    def test_sort_float(self):
        self.assertSequenceEqual([0, 1.1, 2.2, 3.3, 9.9], sort1([1.1, 3.3, 2.2, 9.9, 0]))
        self.assertSequenceEqual([1, 1, math.pi, 5, 12], sort1([5, 1, 1, 12, math.pi]))

