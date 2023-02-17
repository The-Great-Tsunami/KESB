memo = list()

def fibo(n):
	global memo
	memo = [0,1]
	"""
	Memoization(DP)을 사용한 피보나치 수열 처리 함수
	:param n: 
	:return
	"""
	if n <= 1:
		return memo[n]

	else:
		for i in range(2, n+1):
			memo.append(memo[i-1]+memo[i-2])
		return memo[n]

print("Fibonacci --> 0 1", end = " ")
for i in range(2, 10):
	print(f'{i}번째 -> ', fibo(i))