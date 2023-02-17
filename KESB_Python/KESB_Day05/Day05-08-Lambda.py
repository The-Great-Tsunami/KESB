#Lambda

### lambda X
# def edit_story(words, func):
# 	for word in words:
# 		print(func(word))
#
# stairs = ['thud', 'meow', 'thud', 'hiss']
#
# def enliven(word):
# 	return word.capitalize() + '!'
#
# edit_story(stairs, enliven)

### lambda O

def edit_story(words, func):
	for word in words:
		print(func(word))

stairs = ['thud', 'meow', 'thud', 'hiss']

edit_story(stairs, lambda word: word.capitalize() + '!')

### lambda를 사용하지 않을 경우

# import  random
#
# def process(number_lists, func):
# 	for no in number_lists:
# 		print(func(no))
# def squares(n):
# 	'''
# 	제곱 함수
# 	:param n: integer
# 	:return: intger
# 	'''
# 	return n * n
#
# numbers = [random.randint(1, 100) for i in range(5)]
# print(numbers)
# process(numbers, squares)

###lambda를 사용할 경우 -> 자주 부르지 않아도 될 함수의 경우 lambda가 더 간편함.

import  random

def process(number_lists, func):
	for no in number_lists:
		print(func(no))

numbers = [random.randint(1, 100) for i in range(5)]
print(numbers)
process(numbers, lambda x: x * x)