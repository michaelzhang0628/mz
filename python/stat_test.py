from unittest import TestCase

from python.stat import *


class Test(TestCase):
    def test_mz_count(self):
        self.assertEqual(5, mz_count([3, 2, 6, 1, 2]))
        self.assertEqual(2, mz_count([-3, 2]))
        self.assertEqual(0, mz_count([]))

    def test_mz_average(self):
        self.assertEqual(2.8, mz_average([3, 2, 6, 1, 2]))
        self.assertEqual(-2.8, mz_average([-3, -2, -6, -1, -2]))

    def test_mz_min(self):
        self.assertEqual(1, mz_min([3, 2, 6, 1, 2]))
        self.assertEqual(-6, mz_min([-3, -2, -6, -1, -2]))
        self.assertEqual(-3, mz_min([-3, 2, 6, 1, -2]))

    def test_mz_max(self):
        self.assertEqual(6, mz_max([3, 2, 6, 1, 2]))
        self.assertEqual(-1, mz_max([-3, -2, -6, -1, -2]))
        self.assertEqual(8, mz_max([-3, 2, 4, 1, 8]))

    def test_mz_standard_deviation(self):
        self.assertAlmostEqual(1.65, mz_standard_deviation([3, 2, 6, 1, 2]), places=2)

    def test_mz_sort(self):
        self.assertEqual([1, 2, 2, 3, 6], mz_sort([3, 2, 6, 1, 2]))

    def test_mz_median(self):
        self.assertEqual(2, mz_median([3, 2, 6, 1, 2]))
        self.assertEqual(2.5, mz_median([3, 2, 6, 1, 2, 8]))

    def test_mz_mode(self):
        self.assertEqual(2, mz_mode([3, 2, 6, 1, 2]))
        self.assertEqual(2.5, mz_mode([3, 2, 6, 1, 2, 3, -18]))
