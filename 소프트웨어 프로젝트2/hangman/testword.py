import unittest
from word import Word


class Testword(unittest.TestCase):

    def setUp(self):
        self.g3 = Word('words.txt')
    def testtest(self):
        self.assertEqual(self.g3.test(), 'default')


if __name__ == '__main__':
    unittest.main()
