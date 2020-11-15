from unittest import TestCase
from python.chicken_rabbit import chicken_rabbit


class Test(TestCase):
    def test_chicken_rabbit(self):
        self.assertEqual((10, 0), chicken_rabbit(10, 20))
        self.assertEqual((0, 10), chicken_rabbit(10, 40))
        self.assertEqual((9, 4), chicken_rabbit(13, 34))
        self.assertEqual((3, 3), chicken_rabbit(6, 18))
