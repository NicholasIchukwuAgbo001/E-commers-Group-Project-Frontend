import unittest
import TaskSeven
class Test_TaskSeven(unittest.TestCase):
    
    def that_take_two_number_and_multiply_without_using_symbol(self):
        number1 = TaskSeven.get_multiply(4)
        number2 = TaskSeven.get_multiply(2)
        result = 8
        self.assertEqual(numbers, result)
