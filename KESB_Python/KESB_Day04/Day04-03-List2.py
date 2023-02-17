exo = ["백현", "첸"]
big_bang = ["GD", "태양", "탑", "대성", "승리"]
big_bang.insert(1, "인하") #원하는 위치로 추가
exo.append(big_bang)

#offset

exo[1] = "시우민" #offset 지정으로 새로운 값 할당

# List 삭제 방법 - pop(), #따로 지정하지 않으면 해당 list의 마지막 요소를 반환하면서 삭제

print(exo[2].pop())  #승리 날려버리기
print(exo[2].pop(-2)) #탑 날려버리기

#List 삭제방법 - del

del exo[2][-1] #대성 날려버리기

#List 삭제방법 - remove()

### exo.remove('인하') #not in exo
exo[2].remove('인하')

#List 삭제방법 - clear() -> 전체 삭제

exo.clear()