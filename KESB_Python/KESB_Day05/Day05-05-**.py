import random

def calculate_fee(args) -> dict:
	'''
	:param args: ages in list
	:return: {'no_people':전체 인원 수, "no_adult':어른 수, 'no_kids':아이 수, 'total_fee'지불할 금액}
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
	return {'no_people':len(args), "no_adult":adults, 'no_kids':kids, 'total_fee':total}

who = int(input("몇명이서 오셨나요?"))
ages = [random.randint(1,60) for age in range(who)]
result = calculate_fee(ages)
print(f'총 {result["no_people"]}명 방문하셨고 어른 {result["no_adult"]}명, 아이 {result["no_kids"]}, 총 요금은 {result["total_fee"]}입니다.')


print(calculate_fee.__doc__)
help(len)잘