# ###Generators -> 제네레이터는 순회할 때마다 마지막으로 호출된 항목을 기억하고 다음 값을 반환한다.
#
# def my_range(first = 0, last = 0, step = 1):
# 	number = first
# 	while number < last:
# 		yield number
# 		number += step
#
# rangger = my_range(1, 5)
#
# for x in rangger:
# 	print(x)
#
# def a(): #generator
# 	"""
# 	yield => 함수를 종료하지 않고 중간 중간 값을 반환시킬 수 있음
# 	"""
# 	yield 1
# 	yield 2
# 	yield 3
#
# def b(): #normal fonction
# 	return 1 #function stop
# 	return 2 #this code is unreachable
# 	return 3
#
# for i in a():
# 	print(i)
#
# print(a())
# print(b())
#
# ###generator comprehension
#
# for items in ('Got %s' % value for value in range(10)):
#     print(items, end = ' ')

def odd_list():
