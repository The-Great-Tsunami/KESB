def palindrome(p_str):
	if len(p_str) <= 1:
		return True
	if p_str[0] != p_str[-1]:
		return False
	return palindrome(p_str[1:len(p_str)-1])

str_array = ["reaver", "kayak", "borrow or rob", "주유소의 소유주", "야 너 이번주 주번이 너야", "살금살금"]

for test_str in str_array:
	print(test_str, end = ' ---> ')
	test_str = test_str.lower().replace(" ", "")
	if palindrome(test_str):
		print("O")
	else:
		print("X")