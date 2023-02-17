def factorial_iter(n):
	"""
	반복문을 사용한 팩토리얼 함수
	:param n: n!
	:return: integer 팩토리얼 계산 결과 값
	"""
	result = 1
	for i in range(1, n+1):
		result *= i
	return result

def factorial_recu(n):
	"""
	재귀함수를 사용한 팩토리얼 계산 함수
	:param n: n!
	:return: 자기 자신을 호출 또는 1
	"""
	if n == 1:  # 끝나는 조건
		return 1
	else:
		return factorial_recu(n-1) * n #

print(factorial_iter(5))
print(factorial_recu(5))

# def flatten(lol):
# 	for item in lol:
# 		if isinstance(item, list):
# 			yield from flatten(item)
# 		else:
# 			yield item
#
# lol = [1, 2, [3,4,5], [6,[7,8,91, [1]]
