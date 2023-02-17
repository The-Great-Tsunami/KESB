#list

list('cat')  # ['c','a','t']

#List를 통해 Tuple 수정하는 법

scores = ('B+', 'A+', 'C+') #Tuple 그 자체는 수정이 불가
print(scores[1], scores[2])
temp = list(scores) #해당 Tuple을 List로 변환
temp[1] = 'C+' # 원하는 값을 다시 할당
temp[2] = 'A+'
scores = tuple(temp) # List를 다시 Tuple로 변환 후 다시 할당
print(scores[1], scores[2])

#slice

ex = ["a", "b", "c"]

print(ex[0:2])
print(ex[::2]) # 2칸씩 띄어서
print(ex[::-2])
print(ex[::-1]) #List를 반대로 뒤집을 수 있음

print(ex[4:]) # 빈 리스트
print(ex[-6:]) # 음수는 가능

#append & insert - 추가하는 함수

big_bang = ["GD", "태양", "탑", "대성", "승리"]
exo = ["백현", "첸"]

big_bang.append('인하') #맨 뒤에 추가
big_bang.insert(1, "인하") #원하는 위치로 추가

#extend - 두 list를 합칠 수 있음

exo.extend(big_bang) # Like (big_bang + exo)
exo.append(big_bang) # List 내부에 또 다른 List를 추가하는 개념