#while 구구단 만들기

while True:
	dan = int(input("몇 단?-"))
	if 1 < dan < 100:
		for i in range(1, 10):
			print(f"- {dan} * {i} = {dan * i}")
		break

	else:
		print("2부터 9사이의 조건을 입력하시오.")

# type2

while True:

	i = 1
	dan = int(input("몇 단?"))

	if 1 < dan < 100:
		while i < 10:
			print(f"- {dan} * {i} = {dan * i}")
			i += 1
		break

	else:
		print("2부터 9 사이의 값을 입력하시오")

#type

while True:

	i = 1
	dan = int(input("몇 단?"))

	if dan == 0:
		print("0 ㄴㄴ")
		break

	elif 1 < dan < 100:
		while i < 10:
			print(f"- {dan} * {i} = {dan * i}")
			i += 1
		break

	else:
		print("2부터 9 사이의 값을 입력하시오.")
