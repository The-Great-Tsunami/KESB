def fibo(n):
	"""
	Memoization(DP)을 사용한 피보나치 수열 처리 함수
	:param n:
	:return:
	"""
	if n == 0:
		return 0
	elif n == 1:
		return 1
	else:
		return fibo(n-1) + fibo(n-2)

print("Fibonacci --> 0 1", end = " ")
for i in range(2, 10):
	print(f'{i}번째 -> ', fibo(i))