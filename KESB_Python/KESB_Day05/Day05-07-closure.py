###Closure -> 중요하대 정무, 나도 더 몰라서 구글 찾아볼라고

def knights(saying):
	def inner():
		return "He said: %s"%saying
	return inner

a = knights('duck') #knight함수의 메모리주소를 할당 받음
print(a)
a()

############################################

def calculate():
	x = 1
	y = 2
	def add_sub(n):
		x = 11 #local variable -> nonlocal
		return x + n - y
	return add_sub

c1 = calculate() #calculate함수의 메모리주소를 할당 받음

for i in range(5):
	print(c1(i))

print(type(c1)) #c1은 함수임과 동시에 클로저
print(c1)