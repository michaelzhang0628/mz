import math
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

    def test_find_index_of_first_bigger_num(self):
        self.assertEqual(0, findIndexOfFirstBiggerNum(0, [1, 2]))
        self.assertEqual(2, findIndexOfFirstBiggerNum(5, [1, 2]))
        self.assertEqual(1, findIndexOfFirstBiggerNum(1.5, [1, 2]))
        self.assertEqual(0, findIndexOfFirstBiggerNum(5, []))

    def test_insert_num_to_sorted_list(self):
        self.assertSequenceEqual([3], insertNumToSortedList(3, []))
        self.assertSequenceEqual([1, 2, 3], insertNumToSortedList(3, [1, 2]))
        self.assertSequenceEqual([1, 3, 5], insertNumToSortedList(3, [1, 5]))
        self.assertSequenceEqual([0, 1, 5], insertNumToSortedList(0, [1, 5]))

    def test_sort2_int(self):
        self.assertSequenceEqual([0, 1, 2, 3, 9], sort2([1, 3, 2, 9, 0]))
        self.assertSequenceEqual([1, 1, 3, 5, 12], sort2([5, 1, 1, 12, 3]))

    def test_sort2_float(self):
        self.assertSequenceEqual([0, 1.1, 2.2, 3.3, 9.9], sort2([1.1, 3.3, 2.2, 9.9, 0]))
        self.assertSequenceEqual([1, 1, math.pi, 5, 12], sort2([5, 1, 1, 12, math.pi]))


