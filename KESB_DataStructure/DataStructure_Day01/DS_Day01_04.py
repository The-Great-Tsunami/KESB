## 함수 선언 부분 ##
def add_data(pokemon):
	pokemons.append(None)
	kLen = len(pokemons)
	pokemons[kLen - 1] = pokemon


def insert_data(idx, pokemon):
	if idx < 0 or idx > len(pokemons):
		print("데이터를 삽입할 범위를 벗어났습니다.")
		return
	
	pokemons.append(None)  # 빈칸 추가
	kLen = len(pokemons)  # 배열의 현재 크기

	for i in range(kLen - 1, idx, -1):
		pokemons[i] = pokemons[i - 1]
		pokemons[i - 1] = None

	pokemons[idx] = pokemon  # 배열의 제일 뒤에 친구 추가


def delete_data(idx):
	if idx < 0 or idx > len(pokemons):
		print("데이터를 삭제할 범위를 벗어났습니다.")
		return

	kLen = len(pokemons)
	pokemons[idx] = None  # 데이터 삭제

	for i in range(idx + 1, kLen):
		pokemons[i - 1] = pokemons[i]
		pokemons[i] = None  # 배열의 제일 위치 삭제

	del (pokemons[kLen - 1])


## 전역 변수 선언 부분 ##
pokemons = []
select = -1  # 1: 추가, 2: 삽입, 3: 삭제, 4: 종료

## 메인 코드 부분 ##
if __name__ == "__main__":

	while (select != 4):

		select = int(input("선택하세요(1: 추가, 2: 삽입, 3: 삭제, 4: 종료)--> "))

		if (select == 1):
			data = input("추가할 데이터--> ")
			add_data(data)
			print(pokemons)
		elif (select == 2):
			pos = int(input("삽입할 위치--> "))
			data = input("추가할 데이터--> ")
			insert_data(pos, data)
			print(pokemons)
		elif (select == 3):
			pos = int(input("삭제할 위치--> "))
			delete_data(pos)
			print(pokemons)
		elif (select == 4):
			print(pokemons)
			#exit -> 아예 프로그램 자체가 종료
			break
		else:
			print("1~4 중 하나를 입력하세요.")
			continue
