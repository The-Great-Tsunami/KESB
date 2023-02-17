### List in List

small_birds = ['hummingbird', 'finch']
extinct_birds = ["dodo", 'passenger pigeon', 'Norwegian Blue']
carol_birds = [3, 'French hens', 2, "turtledoves"]
all_ = all_birds = [small_birds, extinct_birds, 'macaw', carol_birds]

print(all_)

###zip함수

days = ['Monday','Tuesday', 'Wednesday']
fruits = ['banana', 'orange', 'peach']
drinks = ['coffee', 'tea', 'beer']
desserts = ['tiramisu', 'ice cream', 'pie', 'pudding']

for day, fruit, drink, dessert in zip(days, fruits, drinks, desserts):
	print(day, ": drink", drink, "- eat", fruit, "- enjoy", dessert)

english = 'Monday','Tuesday', 'Wednesday'
french = 'Lundi', 'Mardi', 'Mercredi'

#zip함수를 이용하여 list와 dict을 만들 수 있음.

zip_list = list(zip(english, french))
zip_dict = dict(zip(english, french))

###List comprehension

#way1
number_list = []

for number in range(1, 6):
	number_list.append(number)

print(number_list)

#way2
number_list = [number for number in range(1, 7)]
print(number_list)

#way2-1 -> 홀수리스트 만들기

odd_list = []

for i in range(1, 11):
	if i % 2 == 1:
		odd_list.append(i)
print(odd_list)

a_list = [number for number in range(1, 10) if number % 2 == 1]
print(a_list)
