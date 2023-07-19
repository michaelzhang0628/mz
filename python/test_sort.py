import math
import random
from unittest import TestCase
from python.sort import *


class Test(TestCase):
    def test_get_min(self):
        self.assertEqual(-11, getMin([5, 2, 9, -11]))
        self.assertEqual(0, getMin([0, 3]))

    def test_sort1_int(self):
        self.assertSequenceEqual([0, 1, 2, 3, 9], sort1([1, 3, 2, 9, 0]))
        self.assertSequenceEqual([1, 1, 3, 5, 12], sort1([5, 1, 1, 12, 3]))

    def test_sort1_float(self):
        self.assertSequenceEqual([0, 1.1, 2.2, 3.3, 9.9], sort1([1.1, 3.3, 2.2, 9.9, 0]))
        self.assertSequenceEqual([1, 1, math.pi, 5, 12], sort1([5, 1, 1, 12, math.pi]))

    def test_searchLinear(self):
        self.assertEqual(0, searchLinear(0, [1, 2], 0, 2))
        self.assertEqual(2, searchLinear(5, [1, 2], 0, 2))
        self.assertEqual(1, searchLinear(1.5, [1, 2], 0, 2))
        self.assertEqual(0, searchLinear(5, [], 0, 0))
        self.assertEqual(1, searchLinear(0, [0.5, 1.1, 2.3, 20], 1, 2))
        self.assertEqual(3, searchLinear(5, [0.5, 1.1, 2.3, 20], 1, 2))
        self.assertEqual(3, searchLinear(25, [0.5, 1.1, 2.3, 20], 1, 2))
        self.assertEqual(2, searchLinear(1.5, [0.5, 1.1, 2.3, 20], 1, 2))

    def test_sort2_int(self):
        self.assertSequenceEqual([0, 1, 2, 3, 9], sort2([1, 3, 2, 9, 0]))
        self.assertSequenceEqual([1, 1, 3, 5, 12], sort2([5, 1, 1, 12, 3]))

    def test_sort2_float(self):
        self.assertSequenceEqual([0, 1.1, 2.2, 3.3, 9.9], sort2([1.1, 3.3, 2.2, 9.9, 0]))
        self.assertSequenceEqual([1, 1, math.pi, 5, 12], sort2([5, 1, 1, 12, math.pi]))

    def test_sort3_int(self):
        self.assertSequenceEqual([0, 1, 2, 3, 9], sort3([1, 3, 2, 9, 0]))
        self.assertSequenceEqual([1, 1, 3, 5, 12], sort3([5, 1, 1, 12, 3]))
        self.assertSequenceEqual([8], sort3([8]))
        self.assertSequenceEqual([], sort3([]))
        self.assertSequenceEqual([-1, 7, 8, 9, 9, 9, 100, 1001], sort3([9, 7, -1, 8, 9, 9, 100, 1001]))

    def test_sort_big_list(self):
        myList = []
        for i in range(221):
            myList.append(random.randint(-10000, 10000))
        sorted1 = sort1(myList)
        sorted3 = sort3(myList)
        sorted2 = sort2(myList)
        self.assertSequenceEqual(sorted1, sorted2)
        self.assertSequenceEqual(sorted1, sorted3)

