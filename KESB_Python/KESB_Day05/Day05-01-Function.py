### function



## 함수는 한가지 일을 잘해야한다.

def isPrime(n):

	#:param n: integer number
	#:return: True or False

	if n <= 1:
		return False
	for k in range(2, n):
		if n % k == 0:
			return False
	else:
		return True

def print_Prime(n):

	if isPrime(n):
		return print(f"{n}은 소수입니다.")
	else:
		return print(f"{n}은 소수가 아닙니다.")


# start = int(input("input start number"))
# end = int(input("input end number"))
#
# if end < start:
# 	start, end = end, start
#
# for i in range(start, end+1):
# 	if isPrime(i):
# 		print(i, end = "")