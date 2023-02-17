number = int(input("input number: "))
counts = 0

k = 1

while k <= number:
	if number % k == 0:
		counts += 1
	k += 1
if counts == 2:
	print(f'{number} is prime number')
else:
	print(f'{number} is not prime number')

#for문
number = int(input("input number"))
count = 0
for i in range(1, number+1):
		if number % i == 0:
			count += 1
if count == 2:
	print(f'{number} is prime number')
else:
	print(f'{number} is not prime number')

#for문 2
number = int(input("input number : "))

count = 0

for i in range(2, number):
		if number % i == 0:
			count += 1

if count:
	print(f'{number} is not prime number')

else:
	print(f'{number} is prime number')

#for문 3 #break가 없어 의미없이 메모리를 낭비

number = int(input("input number : "))

is_Prime = True

for i in range(2, number):
		if number % i == 0:
			is_Prime = False

if is_Prime:
	print(f'{number} is prime number')

else:
	print(f'{number} is not prime number')

#for문 3 ver.2 # break를 사용하여 메모리 낭비를 줄임

number = int(input("input number : "))

is_Prime = True

for i in range(2, number):
		if number % i == 0:
			is_Prime = False
			break
		print(i)

if is_Prime:
	print(f'{number} is prime number')

else:
	print(f'{number} is not prime number')
