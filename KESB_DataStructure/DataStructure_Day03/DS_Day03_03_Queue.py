## 함수 선언 부분 ##
def isQueueFull() :
	global SIZE, queue, front, rear
	if rear != SIZE-1 :
		return False
	elif rear == SIZE - 1 and front == -1:
		return True
	else:
		for i in range(front+1, SIZE):
			queue[i-1] = queue[i]
			queue[i] = None
		front = -1
		rear -= 1
		return False

def isQueueEmpty() :
	global SIZE, queue, front, rear
	if front == rear :
		return True
	else :
		return False

def enQueue(data) :
	global SIZE, queue, front, rear
	if isQueueFull() :
		print("Queue is Full")
		return
	rear += 1
	queue[rear] = data

def deQueue() :
	global SIZE, queue, front, rear
	if isQueueEmpty() :
		print("Queue is Empty~")
		return None
	front += 1
	data = queue[front]
	queue[front] = None
	return data

def peek() :
	global SIZE, queue, front, rear
	if isQueueEmpty() :
		print("Queue is Empty~")
		return None
	return queue[front+1]

## 전역 변수 선언 부분 ##
SIZE = int(input("Input queue Size ==> "))
queue = [ None for _ in range(SIZE) ]
front = rear = -1

## 메인 코드 부분 ##
if __name__ == "__main__" :

	while True :
		select = input("Insert(I)/Extract(E)/Verify(V)/eXit(X)==> ")
		if select == 'X' or select == 'x':
			break
		elif select=='I' or select =='i' :
			data = input("Input Data ==> ")
			enQueue(data)
			print("queue status : ", queue)
		elif select=='E' or select =='e' :
			data = deQueue()
			print("Extracted data ==> ", data)
			print("queue status : ", queue)
		elif select=='V' or select =='v' :
			data = peek()
			print("Verified data ==> ", data)
			print("queue status : ", queue)
		else :
			print("Do it again")

	print("Exit!")
