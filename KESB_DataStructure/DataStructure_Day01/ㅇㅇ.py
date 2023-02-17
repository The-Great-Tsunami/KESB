#1
avengers = ["Ironman", "Captain America", "Hulk", "Thor", "Hawkeye"]

def add_data(members):
	avengers.append(None)
	len_array = len(avengers)
	avengers[len_array-1] = members
	print(avengers, " -> len of list(avengers) => ",len(avengers))

def insert_data(taget_location, members):
	"""
	1. 먼저 '지정 위치'가  해당 리스트의 길이보다 길 경우엔 오류가 발생하도록 설계
	2. 리스트의 가장 마지막 부분에 빈 자리를 생성
	3. for문을 뒤로 돌아가도록 설정한 후 i Index에 i-1 Index를 할당
	4. 각 i-1 Index는 빈자리로 바꿈
	5. 최종적으로 '지정위치'에는 원하는 데이터를 삽입한다.
	:param taget_location: -> 지정할 위치
	:param members: 추가하고자 하는 데이터
	"""
	if taget_location < 0 or taget_location > len(avengers):
		print("out of range")
		return  #함수를 종료

	avengers.append(None)
	a_l = len(avengers)

	for i in range(a_l-1, taget_location, -1):
		avengers[i] = avengers[i-1]
		avengers[i-1] = None

	avengers[taget_location] = members
	print(avengers, " -> len of list(avengers) => ",len(avengers))

def delete_data(taget_location):
	"""
	1. taget_location --> 0보다 크고 리스트의 전체 길이를 벗어나지 않게 함.
	2. 지정위치의 데이터를 None으로 바꿈
	3. 지정위치 + 1의 데이터를 지정위치로 옮김 -> 반복
	4. 마지막 위치로 옮겨진 데이터를 삭제
	:param taget_location:
	:return:
	"""
	if taget_location < 0 or taget_location > len(avengers):
		print("out of range")
		return  #함수를 종료

	a_l = len(avengers)
	avengers[taget_location] = None #해당 위치의 데이터를 삭제

	for i in range(taget_location+1, a_l):
		avengers[i-1] = avengers[i]
		avengers[i] = None

	del(avengers[a_l-1])

	print(avengers, " -> len of list(avengers) => ", len(avengers))

if __name__ == "__main__":

	while True:
		select = int(input("선택하세요(1:추가, 2:삽입, 3:삭제, 4:종료 --> "))

		if select == 4:
			break

		elif select == 1 :
			data = input("추가할 데이터--> ")
			add_data(data)
		elif select == 2 :
			pos = int(input("삽입할 위치--> "))
			data = input("추가할 데이터--> ")
			insert_data(pos, data)
		elif select == 3 :
			pos = int(input("삭제할 위치--> "))
			delete_data(pos)
		elif select == 4 :
			exit
		else :
			print("1~4 중 하나를 입력하세요.")
			continue