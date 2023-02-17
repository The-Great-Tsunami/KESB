def is_stack_full():
	global SIZE, stack, top
	if top >= SIZE-1:
		return True
	return False

def is_stack_empty():
	global SIZE, stack, top
	if top == -1:
		return True
	return False

def push(data):
	global SIZE, stack, top
	if is_stack_full():
		print("Stack is FULL!")
		return
	top += 1
	stack[top] = data

def pop():
	global SIZE, stack, top
	if is_stack_empty():
		print("Stack is EMPTY~")
		return
	temp = stack[top]
	stack[top] = None
	top -= 1
	return temp


def peek():
	global SIZE, stack, top
	if is_stack_empty():
		print("Stack is EMPTY~")
		return
	return stack[top]


SIZE = int(input("Stack Size: "))
stack = [None for _ in range(SIZE)]
top = -1

if __name__ == "__main__" :

	while True:
		select = input("Insert(I)/Extract(E)/Verify(V)/eXit(X) ==> ")

		if select == "X" or select == "x":
			break
		elif select=='I' or select =='i' :
			data = input("input data ==> ")
			push(data)
			print("Stack status : ", stack)
		elif select=='E' or select =='e' :
			data = pop()
			print("Extracted Data ==> ", data)
			print("Stack status : ", stack)
		elif select=='V' or select =='v' :
			data = peek()
			print("Verified Data ==> ", data)
			print("Stack status : ", stack)
		else :
			print("Do it again!")

	print("Exit!")