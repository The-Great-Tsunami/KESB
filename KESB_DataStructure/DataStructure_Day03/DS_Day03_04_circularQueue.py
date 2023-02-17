## 함수 선언 부분 ##
def isQueueFull() :
	global SIZE, queue, front, rear
	if (rear + 1) % SIZE == front :
		return True
	else :
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
	rear = (rear + 1) % SIZE
	queue[rear] = data

def deQueue() :
	global SIZE, queue, front, rear
	if isQueueEmpty() :
		print("Queue is Empty~")
		return None
	front = (front + 1) % SIZE
	data = queue[front]
	queue[front] = None
	return data

def peek() :
	global SIZE, queue, front, rear
	if isQueueEmpty() :
		print("Queue is Empty~")
		return None
	return queue[(front + 1) % SIZE]

## 전역 변수 선언 부분 ##
SIZE = int(input("Input queue Size ==> "))
queue = [ None for _ in range(SIZE) ]
front = rear = 0

## 메인 코드 부분 ##
if __name__ == "__main__" :
	while True:

		select = input("Insert(I)/Extract(E)/Verify(V)/eXit(X)==> ")
		if select == 'X' or select == 'x':
			break
		elif select=='I' or select =='i' :
			data = input("Input Data ==> ")
			enQueue(data)
			print("queue status : ", queue)
			print("front : ", front, ", rear : ", rear)
		elif select=='E' or select =='e' :
			data = deQueue()
			print("Extracted data ==> ", data)
			print("queue status : ", queue)
			print("front : ", front, ", rear : ", rear)
		elif select=='V' or select =='v' :
			data = peek()
			print("Verified data ==> ", data)
			print("queue status : ", queue)
			print("front : ", front, ", rear : ", rear)
		else :
			print("Do it again")

	print("Exit!")