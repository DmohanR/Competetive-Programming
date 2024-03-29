import unittest


def find_unique_delivery_id(delivery_ids):

	# Find the one unique ID in the list
	
	delivery_dic = {}

	for i in delivery_ids:
		if i in delivery_dic.keys():
			delivery_dic[i] += 1
		else:
			delivery_dic[i] = 1

	for i in delivery_dic.keys():
		if delivery_dic[i]==1:
			return i
	return 0




# Tests

class Test(unittest.TestCase):

	def test_one_drone(self):
		actual = find_unique_delivery_id([1])
		expected = 1
		self.assertEqual(actual, expected)

	def test_unique_id_comes_first(self):
		actual = find_unique_delivery_id([1, 2, 2])
		expected = 1
		self.assertEqual(actual, expected)

	def test_unique_id_comes_last(self):
		actual = find_unique_delivery_id([3, 3, 2, 2, 1])
		expected = 1
		self.assertEqual(actual, expected)

	def test_unique_id_in_middle(self):
		actual = find_unique_delivery_id([3, 2, 1, 2, 3])
		expected = 1
		self.assertEqual(actual, expected)

	def test_many_drones(self):
		actual = find_unique_delivery_id([2, 5, 4, 8, 6, 3, 1, 4, 2, 3, 6, 5, 1])
		expected = 8
		self.assertEqual(actual, expected)


unittest.main(verbosity=2)
