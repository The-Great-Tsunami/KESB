stack = [None for _ in range(5)]

top = -1

top += 1
stack[top] = "커피"
top += 1
stack[top] = "녹차"
top += 1
stack[top] = "꿀물"
top += 1
stack[top] = "오렌지주스"
top += 1
stack[top] = "바닐라라떼"
print("------스택상태---------")
for i in range(len(stack)-1,  -1, -1):
	print(stack[i])
print("-----------------------")

data = stack[top]
stack[top] = None
top -= 1
print("pop----> " + data)

data = stack[top]
stack[top] = None
top -= 1
print("pop----> " + data)

data = stack[top]
stack[top] = None
top -= 1
print("pop----> " + data)

print("------스택상태---------")

for i in range(len(stack)-1,  -1, -1):
	print(stack[i])
print("-----------------------")

