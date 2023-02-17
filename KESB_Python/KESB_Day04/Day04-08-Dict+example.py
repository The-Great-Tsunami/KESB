###Dictionary
#what is the Dictionary?
students = {'name':'MooMoo', 'age':'27', 'eyes':[0.3, 2.4]}

#for i in students: #생략된 형태
#for i in students.keys():
#for i in students.values():

for i, j in students.items():
	print(f'{i} : {j}')

print(f"이름은 {students['name']} , 나이는 {students['age']}", end = " ")
print(f"시력은 좌:{students['eyes'][0]}, 우:{students['eyes'][1]}")

### Example

import random

alcohol_foods = {
	'맥주':'치킨',
	'소주':'골뱅이소면',
	'와인':'치즈',
	'고량주':'짬뽕'
}

alcohol_list = list(alcohol_foods.keys())
food_list = list(alcohol_foods.values())

list_sequence = []
for i in range(len(alcohol_list)):
	list_sequence.append(f'{i+1}) {alcohol_list[i]}')

while True:

	alcohol = input(f'술 종류를 고르시오.{" ".join(list_sequence)} {len(alcohol_list)+1}) 아무거나 {len(alcohol_list)+2}) 종료')

	if alcohol == '6':
		break
	elif alcohol == '1':
		print(f"{alcohol_list[0]}에 어울리는 안주는 {food_list[0]}입니다. ")
	elif alcohol == '2':
		print(f"{alcohol_list[1]}에 어울리는 안주는 {food_list[1]}입니다. ")
	elif alcohol == '3':
		print(f"{alcohol_list[2]}에 어울리는 안주는 {food_list[2]}입니다. ")
	elif alcohol == '4':
		print(f"{alcohol_list[3]}에 어울리는 안주는 {food_list[3]}입니다. ")
	# elif alcohol == '5':
	# 	ra = random_alcohol = random.randint(0, len(alcohol_list)-1)
	# 	rf = random_food = random.randint(0, len(food_list)-1)
	# 	print(f"{alcohol_list[ra]}에 어울리는 안주는 {food_list[rf]}입니다. ")
	elif alcohol == '5':
		print(f"{random.choice(alcohol_list)}에 어울리는 안주는 {random.choice(food_list)}입니다. ")
	else:
		print("정신 똑바로 차려")
print("다음에 보자")
