def fibo(n):
	"""
	재귀함수를 사용한 피보나치 수열 처리 함수
	:param n:
	:return:
	"""
	r = list()
	p1, p2, = 1, 1
	for _ in range(n):
		r.append(p1)
		p1, p2 = p2,  p1 + p2
	return r[-1]

print("Fibonacci --> 0 1", end = " ")
for i in range(2, 101):
	print(f'{i}번째 -> ', fibo(i))