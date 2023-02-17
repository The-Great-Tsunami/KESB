pokemons = ['피카츄', '라이츄', '파이리', '꼬부기', '이상해씨']

def insert_data(idx, pokemon):
	if idx < 0 or idx > len(pokemons):
		print("데이터를 삽입할 범위를 벗어났습니다.")
		return

	pokemons.append(None)  # 빈칸 추가
	#kLen = len(pokemons)  # 배열의 현재 크기

	for i in range(len(pokemons) - 1, idx, -1):
		pokemons[i] = pokemons[i - 1]
		pokemons[i - 1] = None

	pokemons[idx] = pokemon  # 지정한 위치에 친구 추가


def delete_data(idx):
	if idx < 0 or idx > len(pokemons):
		print("데이터를 삭제할 범위를 벗어났습니다.")
		return

	len_pokemons = len(pokemons)
	pokemons[idx] = None  # 데이터 삭제

	for i in range(idx + 1, len_pokemons):
		pokemons[i - 1] = pokemons[i]
		pokemons[i] = None  # 배열의 맨 마지막 위치 삭제

	del (pokemons[len_pokemons - 1])

if __name__ == "__main__": # main 함수처럼 작동
	pokemons = ['피카츄', '라이츄', '파이리', '꼬부기', '이상해씨']

	print(pokemons)
	insert_data(4, '어니부기')
	print(pokemons)
	insert_data(5, '거북왕')
	print(pokemons)
	delete_data(6)
	print(pokemons)
