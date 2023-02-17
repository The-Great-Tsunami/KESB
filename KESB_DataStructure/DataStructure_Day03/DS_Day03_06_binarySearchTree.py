## 함수 선언 부분 ##
class TreeNode() :
	def __init__ (self) :
		self.left = None
		self.data = None
		self.right = None

## 전역 변수 선언 부분 ##
memory = []
root = None
nameAry = ['one', 'two', 'three', 'four',  'five', 'six' ]

## 메인 코드 부분 ##
node = TreeNode()
node.data = nameAry[0]
root = node
memory.append(node)

for name in nameAry[1:] :

	node = TreeNode()
	node.data = name

	current = root
	while True :
		if name < current.data :
			if current.left == None :
				current.left = node
				break
			current = current.left
		else :
			if current.right == None :
				current.right = node
				break
			current = current.right

	memory.append(node)

print("Binary Searching Tree complete!")

findName = input("please input!")

current = root
while True :
	if findName == current.data:
		print(findName, 'is here')
		break
	elif findName < current.data :
		if current.left == None :
			print(findName, 'is missing')
			break
		current = current.left
	else :
		if current.right == None :
			print(findName, 'is missing')
			break
		current = current.right