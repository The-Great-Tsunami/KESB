###애스터리스크 -> * x 1
## -> 애스터리스크는 위치인수를 튜플로 묶는다.
## -> 인수의 수를 예측할 수 없을 때, 활용하면 좋음.

#eaxmple1
def print_args(*args):
	print(f'Positional Tuple: {args}')

print_args() # 인수없이 호출하면 아무 것도 없음

print_args(3, 2, 1, 'wait!', 'uh...')

##example2 -> 인수의 수를 예측하지 못할 때 애스터리스크와 반복문을 활용하면 간단

import random

def calculate_fee():

	'''
	놀이공원 요금 계산 프로그램
	:param args: ages
	:return: 지불할 총 입장료
	'''

	total = 0
	for age in args:
		if 19 <= age:
			total = total + 10000
		else:
			total = total + 3000
	return total

#문제1 -> 수업시간 문제

import random

def calculate_fee(args) -> list:
	'''
	:param args: ages in list
	:return: [전체 인원 수, 어른 수, 아이 수, 지불할 금액]
	'''
	total = 0
	adults = 0
	kids = 0
	for age in args:
		if 19 <= age: #adult
			total = total + 10000
			adults += adults
		else:
			total = total + 3000
			kids += kids
	return [len(args), adults, kids, total]

who = int(input("몇명이서 오셨나요?"))
ages = [random.randint(1,60) for age in range(who)]
result = calculate_fee(ages)

print(f'총 {result[0]}명 방문하셨고 어른 {result[1]}명, 아이 {result[2]}, 총 요금은 {result[-1]}입니다.')