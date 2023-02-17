###함수를 매개변수로 가지는 함수

def inha():
	print(60)

def call_func(f):
	"""
	매개변수로 함수를 넘겨받아 실행
	:param f:  매개변수가 함수
	:return:
	"""
	f()

call_func(inha)
print(type(call_func))
def substract(n1, n2):
	print(n1 - n2)

def run_func(f, arg1, arg2):
	'''
	함수를 매개변수로 받아 함수 안에서 해당 함수를 실행
	:param f: 첫번째 인수는 함수
	:param arg1: 정수 값
	:param arg2: 정수 값
	:return:
	'''
	f(arg1, arg2)

run_func(substract, 99, 88)

## 애스터리스크 사용

def sum(func, *args):
	return sum(args)

##Inner Function

def outer(a, b):
	def inner(c, d):
		return c + d
	return inner(a,b)
outer(1,3)

def knights(saying):
	def inner(quote):
		return "He said: %s"%quote
	return inner(saying)