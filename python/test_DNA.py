from unittest import TestCase
from python.DNA import DNA


class Test(TestCase):
    def test_dna(self):
        self.assertEqual(0, DNA("ghhjh"))
        self.assertEqual(1, DNA("GGGCG"))
        self.assertEqual(1/2, DNA("ATVGCG"))
