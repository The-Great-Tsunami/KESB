g = 1 # global variable

def print_global():
	#g = 2 #local variable
	print(g)

def change_print_global():
	global g # global 변수를 활용
	print(g)
	g = 2 #g에 새로 2를 할당
	print(g)

change_print_global()
print_global()

print(globals())
print(__name__)